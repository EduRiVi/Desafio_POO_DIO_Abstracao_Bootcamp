package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoring extends Content {
    private LocalDate date;

    public Mentoring(){}

    @Override
    public double xpCalculate() {
        return DEFAULT_CONCLUSION_XP + 20d;
    }

    public void setDate (LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate () {
        return date;
    }

    @Override
    public String toString() {
        return "Mentoring{" + 
                "title= '" + getTitle() + '\'' +
                ", description= '" + getDescription() + '\'' +
                ", date= '" + date +
                "'}";
    }
}
