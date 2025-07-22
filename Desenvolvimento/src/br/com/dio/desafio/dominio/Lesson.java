package br.com.dio.desafio.dominio;

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
    public String toString() {
        return "Lesson{" + 
                getMinutes() +", "+
                getTitle() +", " +
                getXp() +", " +
                isCompleted()+
                "}";
    }

}
