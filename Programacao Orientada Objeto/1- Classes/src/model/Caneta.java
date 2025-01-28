package model;
public class Caneta {
    /* Atributos */
    //São as caracteristicas o objeto possui
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    /* Contrutores */
    //São as informações que precisamos para "criar o objeto" OU definir como um atributo será iniciado
    public Caneta(String modelo, String cor, float ponta,int carga){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta =  ponta;
        this.carga = carga;
        //Atributo tampada será iniciado com seu estado de verdadeiro
        this.tampada = true;
    }

   
    /* Getters e Setter*/
    //São metodos utilizados para mexer nos atributos
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada() {
        this.tampada = !this.tampada;
    }
    

    /* Metodos */  
    //São coisas que o objeto pode fazer  
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRO! Caneta tampada, não posso rabiscar");
        }
        else{
            System.out.println("Estou rabiscando");
        }
    }

    public void status(){
        System.out.println("Status da Caneta");
        System.out.println();
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Cor:" + this.cor);
        System.out.println("Ponta:" + this.ponta);
        System.out.println("Carga:" + this.carga);
        System.out.println("Tampada:" + this.tampada);
    }
    
}