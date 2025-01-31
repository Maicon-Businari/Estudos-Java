package model;

import interfaces.AcoesVideo;

public class Video implements AcoesVideo {

    // Atributos
    private String titulo;
    private int avaliacao;
    private int view;
    private int curtida;
    private boolean reproduzindo;

    // Construtor
    public Video(String titulo) {
        this.setTitulo(titulo);
        this.setAvaliacao(1);
        this.setView(0);
        this.setCurtida(0);
        this.setReproduzindo(false);
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getCurtida() {
        return curtida;
    }

    public void setCurtida(int curtida) {
        this.curtida = curtida;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    // Métodos sobrescritos || Polimorfismo sobreposição
    @Override
    public void play() {
        if (isReproduzindo()) {
            System.out.println("Já está reproduzindo.");
        }
        if (!isReproduzindo()) {
            this.setReproduzindo(true);
        }
    }

    @Override
    public void pause() {
        if(!isReproduzindo()){
            System.out.println("Já esta pausado.");
        }
        if(isReproduzindo()){
            this.setReproduzindo(false);
        }
    }

    @Override
    public void like() {
        this.setCurtida(getCurtida()+1);
    }

    @Override
    public String toString() {
        return "Video [getTitulo()=" + getTitulo() + ", getAvaliacao()=" + getAvaliacao() + ", getView()=" + getView()
                + ", getCurtida()=" + getCurtida() + ", isReproduzindo()=" + isReproduzindo() + "]";
    }
}
