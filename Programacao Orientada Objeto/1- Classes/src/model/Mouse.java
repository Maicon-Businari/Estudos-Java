package model;
public class Mouse {

    //Atributos
    String cor;
    int qtdeBotoes;
    int maxDpi;
    boolean semFio;


    //Método
    void status(){
        System.out.println("Status da Mouse");
        System.out.println("Cor: " + this.cor);
        System.out.println("Quantidade de botões: " + this.qtdeBotoes);
        System.out.println("Maximo de DPI: " + this.maxDpi);
        System.out.println("Sem Fio: " + this.semFio);
    }
}
