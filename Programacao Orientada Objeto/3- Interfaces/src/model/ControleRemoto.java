package model;
import interfaces.Controlador;

//Implements Controlador -> Significa que a classe ControleRemoto vai ter que codificar todos os métodos que "Controlador" possui
public class ControleRemoto implements Controlador{

    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Contrutor
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //Getters e Setters
    private int getVolume() {
        return volume;
    }
   
    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    //Métodos
    //Override -> Para mostrar onde está o método que o controlador exige
    @Override
    public void abrirMenu() {    
        if(this.isLigado()){
            System.out.println("Está tocando? " + this.isTocando());
            System.out.println("Qual o volume agora? " + this.getVolume());  
        }    
              
    }

    @Override
    public void aumentarVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume()+1);
        }
        
    }

    @Override
    public void deminuirVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume()-1);
        }
        
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado()){
            this.setTocando(true);
        }
    }

    @Override
    public void fecharMenu() {
        if(this.isLigado()){
            System.out.println("Fechando menu...");
        }
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado()){
            this.setTocando(false);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !this.isLigado()){
            this.setTocando(true);
        }
    }




}
