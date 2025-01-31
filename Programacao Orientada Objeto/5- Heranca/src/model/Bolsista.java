package model;

//Classe herança para diferença
public final class Bolsista extends Aluno{

    private float bolsa;
    
    //Contrutor de Bolsista + Contrutor de Aluno + Contrutor de Pessoa
    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, float bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.setBolsa(bolsa);
    }

    //Getter e Setters de bolsista
    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    //Métodos
    public void renovarBolsa(){
        System.out.println("Ronavando bolsa do aluno " + this.getNome() + ".");
    }
    @Override
    public void pagarMensalidade() {
        System.out.println("Pagamento de mensalidade do bolsista " + this.getNome() + ".");
    }

}
