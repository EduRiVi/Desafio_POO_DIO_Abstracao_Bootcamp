package br.com.dio.desafio.dominio;

public class Course extends Content {
    private int workload;

    public Course(){}

    @Override
    public double xpCalculate() {
        return DEFAULT_XP * workload;
    }

    public void setWorkload (int workload) {
        this.workload = workload;
    }

    public int getWorkload () {
        return workload;
    }

    @Override
    public String toString() {
        return "Curso{" + 
                "titulo= '" + getTitle() + '\'' +
                ", description= '" + getDescription() + '\'' +
                ", workload= '" + workload +
                "'}";
    }
}
