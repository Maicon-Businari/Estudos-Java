package model;

public class Tartaruga extends Reptil {

    //Construtor de Cobra + Construtor de Reptil + Construtor de Animal
    public Tartaruga(float peso, int idade, int membros, String cor){
        super(peso, idade, membros, cor);
    }

    //Métodos sobrescritos | Polimorfismo de sobreposição ( Mesmas assinaturas em classes diferentes )
    @Override
    public void locomover() {
        System.out.println("A tartaruga está andando de forma lenta.");
    }

}
