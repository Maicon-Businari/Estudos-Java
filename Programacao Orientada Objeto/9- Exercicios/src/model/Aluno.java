package model;

public class Aluno extends Pessoa{

    private String login;
    private int qtdeAulaAss;


    //Construtor Aluno + Construtor Pessoa
    public Aluno(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setQtdeAulaAss(0);
    }

    //Getters e Setters
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getQtdeAulaAss() {
        return qtdeAulaAss;
    }
    public void setQtdeAulaAss(int qtdeAulaAss) {
        this.qtdeAulaAss = qtdeAulaAss;
    }

    //Método 
    public void assistirMaisUmAula(){
        setQtdeAulaAss(getQtdeAulaAss() + 1);
    }

    //Método sobrescrito || Polimorfismo sobreposição
    @Override
    public void ganharExp() {
        setExperiencia(getExperiencia() + 10);
    }

    @Override
    public String toString() {
        return "Aluno [getLogin()=" + getLogin() + ", getNome()=" + getNome() + ", getQtdeAulaAss()=" + getQtdeAulaAss()
                + ", getIdade()=" + getIdade() + ", getSexo()=" + getSexo() + ", getExperiencia()=" + getExperiencia()
                + "]";
    }
}
