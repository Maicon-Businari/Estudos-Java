import model.Cachorro;

public class App {
    public static void main(String[] args) throws Exception {

        Cachorro cachorro = new Cachorro(7, 4, "Branco");

        //Testando os métodos de polimorfismo de sobrecarga
        cachorro.reagir("Olá");
        cachorro.reagir("Vai apanhar");
        cachorro.reagir(11,45);
        cachorro.reagir(21,00);
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(2,12.5f);
        cachorro.reagir(17, 4.5f);

    }
}
