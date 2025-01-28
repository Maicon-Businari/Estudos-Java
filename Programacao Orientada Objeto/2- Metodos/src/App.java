import model.Conta;

public class App {
    public static void main(String[] args) throws Exception {

        Conta contaCarlos = new Conta(1, "Carlos");

        //Testando as funcionalidades da conta
        contaCarlos.visaoDoGetente();
        System.out.println("");

        contaCarlos.abrirConta("Ca");
        System.out.println("");

        contaCarlos.visaoDoGetente();
        System.out.println("");


        Conta contaPedro= new Conta(1, "Pedro");
        System.out.println("");
        contaPedro.visaoDoGetente();
        System.out.println("");


        contaPedro.abrirConta("CP");
        contaPedro.visaoDoGetente();
        System.out.println("");
    }   
}
