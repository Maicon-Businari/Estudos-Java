package model;

public class Financiamento {

    //Atributos
    private float valorTotal;
    private float entrada;
    private int qtdeParcelas;


    //Getters e Setters
    public Financiamento(float valorTotal, float entrada, int qtdeParcelas) {

        if (entrada <= valorTotal * 0.2) {
            //Provocando exceções
            throw new RuntimeException("Valor da entrada muito baixo");
        }
        if (qtdeParcelas >= 5) {
            //Provocando exceções
            throw new RuntimeException("A quantidade miníma é 5 parcelas");
        }

        this.setValorTotal(valorTotal);
        this.setEntrada(entrada);
        this.setQtdeParcelas(qtdeParcelas);
    }

    //Getters e Setters
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public float getEntrada() {
        return entrada;
    }
    public void setEntrada(float entrada) {
        this.entrada = entrada;
    }
    public int getQtdeParcelas() {
        return qtdeParcelas;
    }
    public void setQtdeParcelas(int qtdeParcelas) {
        this.qtdeParcelas = qtdeParcelas;
    }

    //Métodos
    public float prestacao(){
        return (valorTotal - entrada)/ qtdeParcelas;
    }

    

}
