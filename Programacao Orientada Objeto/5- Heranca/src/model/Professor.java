package model;

//Classe herança para diferença
public class Professor extends Pessoa{     

    //Atributos de Professor
    private String especialidade;
    private float salario;   

    //Construtor de Professor + Contrutor de Pessoa
    public Professor(String nome, int idade, String sexo, String especialidade, float salario){
        super(nome, idade, sexo);
        setEspecialidade(especialidade);
        setSalario(salario);        
    }

    //Getters e Setters 
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    //Método de professor
    public void receberAum(float aumento){
        this.setSalario(getSalario() + aumento);
    }
}
