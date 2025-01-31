package model;

//Classe herança para diferença
public class Funcionario extends Pessoa {

    //Atributos de Funcionário
    private String setor;
    private boolean trabalhando;
    
    //Contrutor de Funcionário + Contrutor de Pessoas
    public Funcionario(String nome, int idade, String sexo, String setor) {
        super(nome, idade, sexo);
        this.setSetor(setor);
        this.setTrabalhando(false);
    }

    //Setter e Getters de Funcionário
    public String getSetor() {
        return setor;
    }
    public void setSetor(String settor) {
        this.setor = settor;
    }
    public boolean isTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    //Método de Funcionário
    public void mudarTrabalho(String trabalho){
        this.setSetor(trabalho);
    }

    public void trabalhar(){
        if(this.isTrabalhando()){
            System.out.println("Já está trabalhando.");
        }
        if(!this.isTrabalhando()){
            setTrabalhando(true);
        }
    }

    public void folgar(){
        if(!this.isTrabalhando()){
            System.out.println("Já está de folga.");
        }
        if(this.isTrabalhando()){
            setTrabalhando(false);
        }
    }    
}
