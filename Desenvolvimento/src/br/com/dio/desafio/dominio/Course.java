package br.com.dio.desafio.dominio;

public class Course extends Content {
    private boolean isCompleted = false;

    public Course (){}

    public Course (Content content){
        setTitle(content.getTitle());
        setDescription(content.getDescription());
        setLessons(content.getLessons());
    }

    @Override
    public double xpCalculate() {
        return (isCompleted ? DEFAULT_CONCLUSION_XP : 0) + lessonsXpCalculate();
    }

    @Override
    public String toString() {
        return "Curso{" + getTitle()
                        + getDescription()
                        + getLessons() +
                        "}";
    }
}
