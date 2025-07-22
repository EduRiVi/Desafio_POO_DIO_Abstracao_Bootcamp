package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.IntFunction;

public abstract class Content {
    
    protected static final double DEFAULT_CONCLUSION_XP = 100;
    private String title;
    private String description;
    private Set<Lesson> lessons = new LinkedHashSet<>();

    public abstract double xpCalculate();

    public double lessonsXpCalculate(){
        return lessons.stream().filter(Lesson::isCompleted)
                                .mapToDouble(Lesson::getXp)
                                .sum();
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public String getTitle () {
        return title;
    }

    public String getDescription () {
        return description;
    }

    public void setLessons(Set<Lesson> lessons) {
       Iterator<Lesson> iterator = lessons.iterator();
       while (iterator.hasNext()) this.lessons.add(new Lesson(iterator.next()));
       
    }

    public void setLessons(Lesson... lessons) {
        this.lessons = new LinkedHashSet<>(Arrays.asList(lessons));
    }

    public Set<Lesson> getLessons() {
        return lessons;
    }

    public boolean isCompleted() {
        return lessons.stream().allMatch(Lesson::isCompleted) || lessons.isEmpty();
    }

    public Lesson getCurrentLesson() {
        Optional<Lesson> lesson = lessons.stream().filter(l -> !l.isCompleted()).findFirst();
        if (lesson.isPresent()) return lesson.get();
        else return new Lesson(0, "", 0);
    }

    public void progress(){
        if (isCompleted())
            System.err.println("Não há mais aulas para serem completadas nesse curso!");
        else getCurrentLesson().complete();
        
    }

}
