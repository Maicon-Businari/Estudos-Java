package model;

//Classe abstrata não pode ser intanciada
public abstract  class Animal {

    //Atributos
    protected float peso;
    protected int idade;
    protected int membros;

    //Construtor
    public Animal(float peso, int idade, int membros) {
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }

    //Getters e Setters
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }

    //Métodos abstratos
    public abstract  void locomover();
    public abstract  void alimentar();
    public abstract  void emitirSom();

}
