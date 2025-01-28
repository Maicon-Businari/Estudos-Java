package model;

public class Mamifero extends Animal {

    //Atributos
    private String cor;    


    //Construtor Mamífero + Construtor Animal
    public Mamifero(float peso, int idade, int membros, String cor) {
        super(peso, idade, membros);
        setCor(cor);
    }

    //Getters e Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String corPelo) {
        this.cor = corPelo;
    }

    //Métodos sobrescritos | Polimorfismo de sobreposição ( Mesmas assinaturas em classes diferentes )
    @Override
    public void locomover() {
        System.out.println("Mamífero está correndo.");        
    }
    @Override
    public void alimentar() {
        System.out.println("Mamifero comendo.");        
    }
    @Override
    public void emitirSom() {
        System.out.println("Mamífero fazendo barulho.");        
    }


}
