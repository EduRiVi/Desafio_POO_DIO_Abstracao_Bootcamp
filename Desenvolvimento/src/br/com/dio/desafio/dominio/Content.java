package br.com.dio.desafio.dominio;

public abstract class Content {

    protected static final double DEFAULT_XP = 100;

    private String title;
    private String description;

    public abstract double xpCalculate();

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

}
