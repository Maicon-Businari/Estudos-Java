package model;

public class Mamifero extends Animal {

    //Atributos de Mamíferos + Atributos de Animais
    protected String corPelo;

    //Construtor de Mamífero + Construtor de Animal
    public Mamifero(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.setCorPelo(corPelo);
    }
    
    //Getters e Setters
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //Método sobrescrito || Polimorfismo de sobreposição ( Mesmas assinaturas em classes diferentes )
    @Override
    public void emitrSom() {
       System.out.println("Som de mamífero");
    }
}
