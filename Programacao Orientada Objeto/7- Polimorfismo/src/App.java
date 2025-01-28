import model.Ave;
import model.Mamifero;
import model.Peixe;
import model.Reptil;

public class App {
    public static void main(String[] args) throws Exception {

        Mamifero mamifero = new Mamifero(40.5f, 7, 4, "Marrom");
        Reptil reptil = new Reptil(1.7f, 2, 4, "Verde");
        Peixe peixe = new Peixe(3.5f, 7, 0, "Branco");
        Ave ave   = new Ave(0.6f, 3, 2, "Marrom");
        
        mamifero.alimentar();
        mamifero.locomover();
        mamifero.emitirSom();

        reptil.alimentar();
        peixe.alimentar();
        ave.alimentar();

    }
}
