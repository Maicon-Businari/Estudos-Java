package model;

//Classe herança para diferença
public class Aluno extends Pessoa {
    
    private int matricula;
    private String curso;   

    
    //Contrutor de Aluno + Contrutor de Pessoa
    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }   

    //Getters e Setter de Aluno
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Método de Aluno
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome() + ".");
    }
    public void cancelarMatricula(){
        System.out.println("Mátricula foi cancelada.");
    }
}
