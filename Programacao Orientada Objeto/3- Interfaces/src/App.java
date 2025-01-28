import model.ControleRemoto;

public class App {
    public static void main(String[] args) throws Exception {

        ControleRemoto controleTv = new ControleRemoto();

        //Testando as funcionalidades do controle remoto
        System.out.println("Testando com a TV desligada.");
        controleTv.abrirMenu();
        controleTv.fecharMenu();
        controleTv.aumentarVolume();
        controleTv.deminuirVolume();
        controleTv.ligarMudo();
        controleTv.desligarMudo();
        controleTv.abrirMenu();


        System.out.println("");
        System.out.println("Ligando a TV!!");
        controleTv.ligar();

        controleTv.abrirMenu();
        controleTv.fecharMenu();
        System.out.println("");

        controleTv.aumentarVolume();
        controleTv.aumentarVolume();
        controleTv.deminuirVolume();
        controleTv.desligarMudo();
        controleTv.abrirMenu();
        controleTv.fecharMenu();
        System.out.println("");

        
        controleTv.ligarMudo();
        controleTv.aumentarVolume();
        controleTv.aumentarVolume();
        controleTv.abrirMenu();
        controleTv.fecharMenu();
    }
}
