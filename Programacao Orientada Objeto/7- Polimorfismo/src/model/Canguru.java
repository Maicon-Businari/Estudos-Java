package model;

public class Canguru extends Mamifero {

    //Construtor de Canguro + Contrutor de Mamífero + Construtor de Animal
    public Canguru(float peso, int idade, int membros, String cor){
        super(peso, idade, membros, cor);
    }

    //Métodos 
    public void usarBolsa(){
        System.out.println("O canguru está utilizando a bolsa.");
    }

    //Métodos sobrescritos | Polimorfismo de sobreposição ( Mesmas assinaturas em classes diferentes )
    @Override
    public void locomover() {
        System.out.println("O Canguro está pulando.");
    }  
}
