package model;

public class Visualizacao {

    //Atributos
    private Aluno espectador;
    private Video videoAula;

    //Construtor
    public Visualizacao(Aluno espectador, Video videoAula) {
        this.espectador = espectador;
        this.videoAula = videoAula;
        espectador.setQtdeAulaAss(espectador.getQtdeAulaAss()+1);
        videoAula.setView(videoAula.getView()+1);
    }

    //Getters e Setters
    public Aluno getEspectador() {
        return espectador;
    }
    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
    }
    public Video getVideoAula() {
        return videoAula;
    }
    public void setVideoAula(Video videoAula) {
        this.videoAula = videoAula;
    }


    public void avaliar(){
        this.videoAula.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.videoAula.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int nota = 0;
        if(porc < 20){
            nota = 3;
        }
        if(porc >= 20 && porc < 50){
            nota = 5;
        }
        if(porc >= 50 && porc <90){
            nota = 8;
        }
        if(porc >= 90){
            nota = 10;
        }
        this.videoAula.setAvaliacao(nota);
    }

    public void status(){
        System.out.println("Aluno: " + this.espectador.getNome());
        System.out.println("Video: " + this.videoAula.getTitulo());
    }
}
