package model;

public class Lobo extends Mamifero{

    public Lobo(int idade, int membros, String corPelo){
        super(idade, idade, membros, corPelo);
    }

    //Método sobrescrito || Polimorfismo de sobreposição ( Mesmas assinaturas em classes diferentes )
    @Override
    public void emitrSom() {
        System.out.println("Auuuuuuuuuuuuuuu!");
    }
}
