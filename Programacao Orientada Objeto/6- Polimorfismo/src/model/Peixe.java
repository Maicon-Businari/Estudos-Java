package model;

public class Peixe extends Animal{

    //Atributo
    private String cor;

    //Construtor de Peixe + Construtor de Animal
    public Peixe(float peso, int idade, int membros, String cor) {
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

    //Métodos
    public void soltarBolhas(){
        System.out.println("O peixe está soltando bolha.");
    }

    //Métodos sobrescritos | Polimorfismo de sobreposição ( Mesmas assinaturas em classes diferentes )
    @Override
    public void locomover() {
        System.out.println("Peixe nadando.");        
    }

    @Override
    public void alimentar() {
        System.out.println("Peixe comendo.");        
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe fazendo barulho.");        
    }  
}
