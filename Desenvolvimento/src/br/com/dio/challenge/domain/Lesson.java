package br.com.dio.challenge.domain;

import java.util.Objects;

public class Lesson {
    private double minutes;
    private String title;
    private double xp;
    private boolean isCompleted = false;

    public Lesson(double minutes, String title, double xp) {
        this.minutes = minutes;
        this.title = title;
        this.xp = xp;

    }

    public Lesson(Lesson lesson) {
        this.minutes = lesson.getMinutes();
        this.title = lesson.getTitle();
        this.xp = lesson.getXp();
    }

    public double getMinutes(){
        return minutes;
    }

    public String getTitle(){
        return title;
    }

    public double getXp(){
        return xp;
    }

    public void complete() {
        isCompleted = true;
    }

    public boolean isCompleted(){
        return isCompleted;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Lesson les = (Lesson) obj;        
        return Objects.equals(minutes, les.minutes) 
                && Objects.equals(title, les.title)
                && Objects.equals(xp, les.xp);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(minutes, title, xp);
    }

    @Override
    public String toString() {
        return "Lesson{" + 
                getMinutes() +", "+
                getTitle() +", " +
                getXp() +", " +
                isCompleted()+
                "}";
    }

}
