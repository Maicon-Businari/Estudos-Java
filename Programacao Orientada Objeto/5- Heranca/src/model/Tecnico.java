package model;

public final class Tecnico extends Aluno {
    
    private int registroProfissional;

    //Construtor de Técnico + Construtor de Aluno + Construtor de Pessoa
    public Tecnico(String nome, int idade, String sexo, int matricula, String curso, int registroProfissional) {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
    }

    //Getter e Setter de Técnico
    public int getRegistroProfissional() {
        return registroProfissional;
    }
    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    //Método
    public void praticar(){
        System.out.println("O técnico está praticando.");
    }

}
