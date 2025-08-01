package br.com.dio.challenge.domain;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.dio.challenge.domain.Dev;

public class Bootcamp {
    
    private String name;
    private String description;
    private final LocalDate initData = LocalDate.now();
    private final LocalDate finalData = initData.plusDays(45);
    private Set<Dev> subscribsDevs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public void setName (String name) {
        this.name = name;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public String getName () {
        return name;
    }

    public String getDescription () {
        return description;
    }

    public LocalDate getInitDate(){
        return initData;
    }

    public LocalDate getFinalDate(){
        return finalData;
    }

    public void setSubscribeDevs(Set<Dev> subscribsDevs) {
        this.subscribsDevs = subscribsDevs;
    }

    public Set<Dev> getSubscribeDevs() {
        return subscribsDevs;
    }

    public void setContents(Content contents) {
        this.contents.add(new Course(contents));
            
    }

    public Set<Content> getContents() {
        return contents;
    }

}
