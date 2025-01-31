package model;

public class Cachorro extends Mamifero {

    //Construtor de Cachorro + Contrutor de Mamífero + Construtor de Animal
    public Cachorro(float peso, int idade, int membros, String cor){
        super(peso, idade, membros, cor);
    }

    //Métodos 
    public void enterrarOsso(){
        System.out.println("O cachorro está enterrando osso.");
    }

    public void abanarRabo(){
        System.out.println("O cachorro está abanando o rabo.");
    }
}
