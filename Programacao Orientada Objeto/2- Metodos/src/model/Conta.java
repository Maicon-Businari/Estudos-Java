package model;

public class Conta {

    /* Atributos */
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    /* Construtor */
    public Conta(int numConta, String dono){
        this.numConta = numConta;
        this.dono = dono;
        this.status = false;
        this.saldo = 0f;
    }


    /* Getters e Setters */
    public int getNumConta() {
        System.out.println("Numero da conta: " + this.numConta);
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        System.out.println("Tipo da conta: " + this.tipo);
        return tipo;
    }
    public String setTipo(String tipo) {
        if(tipo == "CC" || tipo == "CP" ){
            System.out.println("Tipo de conta foi definido como: " + this.tipo);
            return tipo;
        }
        else{
            System.out.println("Tipo de conta inváldo!");
            System.out.println("A conta será considerado como CC");
            tipo = "CC";
            return tipo;
        }
    }
    public String getDono() {
        System.out.println("Dono da conta: " + this.dono);
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        System.out.println("Saldo da conta: " + String.format("%.2f", this.saldo));
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean isAberta() {
        System.out.println("Conta está aberta: " + this.status);
        return status;
    }
    public void setAberta(boolean status) {
        this.status = status;
    }


    /* Metodos -> Criando varis funcionalidades para a classe conta */
    public void abrirConta(String tipo){
        this.tipo = setTipo(tipo);
        setAberta(true);
        if(this.tipo  == "CC"){
            setSaldo(50.0f);
        }
        if(this.tipo  == "CP"){
            setSaldo(150.00f);
        }
        System.out.println("Sua conta foi aberta!");
    }

    public void fecharConta(){
        if(this.saldo != 0){
            System.out.println("Não foi possivel fechar a conta pois ainda possui um saldo de R$" + String.format("%.2f", this.saldo) + ", favor retirar/pagar.");
        }
        if(this.saldo == 0){
            setAberta(false);
            System.out.println("Sua conta foi encerrada. ;(");
        }

    }

    public void depostar(float valor){
        if(this.status == true){
            setSaldo( this.saldo + valor);
            System.out.println("Valor de R$" + String.format("%.2f", valor) + " depositado!");
        }
        if(this.status == false){
            System.out.println("Não foi possivel realizar esse depósito, essa conta foi fechada.");
        }
    }

    public void sacar(float valor){
        if(this.status == true && this.saldo >= valor){
            setSaldo(this.saldo -= valor);
            System.out.println("Valor sacado com sucesso!!!");
        }
        else{
            if(this.status == false){
                System.out.println("Falha ao realizar saque, essa conta foi fechada.");
            }
            if(this.saldo < valor && this.status == true ){
                System.out.println("Valor de saque superior ao saldo da conta.");
            }
        }
    }

    public void pagarMensalidade(){
        if(getTipo() == "CC"){
            setSaldo(getSaldo() - 12.00f);
        }
        if(getTipo() == "CP"){
            setSaldo(getSaldo() - 20.00f);
        }

    }

    public void visaoDoGetente(){
        System.out.println("Numero da conta: " + this.numConta);
        System.out.println("Dono da conta: " + this.dono);
        System.out.println("Tipo da conta: " + this.tipo);
        System.out.println("Conta está aberta: " + this.status);
        System.out.println("Saldo da conta: R$" + String.format("%.2f", this.saldo));
    }
}
