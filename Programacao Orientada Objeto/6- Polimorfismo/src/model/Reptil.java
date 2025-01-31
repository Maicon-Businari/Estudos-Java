package model;

public class Reptil extends Animal {

    //Atributo
    private String cor;

    //Construtor de Raptil + Construtor de Animal
    public Reptil(float peso, int idade, int membros, String cor) {
        super(peso, idade, membros);
        this.setCor(cor);
    }

    //Getters e Setters
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    //Métodos sobrescritos | Polimorfismo de sobreposição ( Mesmas assinaturas em classes diferentes )
    @Override
    public void locomover() {
        System.out.println("Reptil rastejando.");        
    }

    @Override
    public void alimentar() {
        System.out.println("Repitl comendo.");        
    }

    @Override
    public void emitirSom() {
        System.out.println("Reptil fazendo barulho.");        
    }
}
