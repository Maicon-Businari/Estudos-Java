import model.Luta;
import model.Lutador;

public class App {
    public static void main(String[] args) throws Exception {

        //Array -> Utilizado para armazenar varios objetos
        Lutador lutadores[] = new Lutador[6];

        lutadores[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        lutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        lutadores[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        lutadores[5] = new Lutador("Nerdaard", "EAU", 30, 1.81f, 105.7f, 12, 2, 4);


        System.out.println("");
        System.out.println("-----ANTES DA LUTA-----");
        lutadores[0].status();
        lutadores[1].status();
        System.out.println("");


        //Testando se o relacionamento entre classes está funcionando
        Luta primeiraLuta = new Luta(lutadores[0], lutadores[1], 5);
        primeiraLuta.marcarLuta();
        primeiraLuta.status();
        primeiraLuta.lutar();


        System.out.println("");
        System.out.println("-----DEPOIS DA LUTA-----");
        lutadores[0].status();
        lutadores[1].status();


    }
}
