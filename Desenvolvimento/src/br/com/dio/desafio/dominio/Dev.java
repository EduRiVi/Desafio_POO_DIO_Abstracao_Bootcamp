package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> subscribeContents = new LinkedHashSet<>();
    private Set<Content> doneContents = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp) {
        subscribeContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribeDevs().add(this);
    }

    public void progress() {
        Optional<Content> content = subscribeContents.stream().findFirst();
        if (content.isPresent()) {
            doneContents.add(content.get());
            subscribeContents.remove(content.get());
        } else {
            System.err.println("Você não está inscrito em nenhum conteúdo!");
        }
    }

    public double xpCalculate() {
        return doneContents.stream().mapToDouble(Content::xpCalculate).sum();
    }

    public void setName (String name) { this.name = name; }

    public String getName () {
        return name;
    }

    public void setSubscribeContents (Set<Content> subscribeContents) {
        this.subscribeContents = subscribeContents;
    }

    public Set<Content> getSubscribeContents () {
        return subscribeContents;
    }

    public void setDoneContents (Set<Content> doneContents) {
        this.doneContents = doneContents;
    }

    public Set<Content> getDoneContents () {
        return doneContents;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dev dev = (Dev) obj;        
        return Objects.equals(name, dev.name) 
                && Objects.equals(subscribeContents, dev.subscribeContents)
                && Objects.equals(doneContents, dev.doneContents);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, subscribeContents, doneContents);
    }
}
