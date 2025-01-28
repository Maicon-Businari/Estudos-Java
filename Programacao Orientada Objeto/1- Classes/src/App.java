import model.Caneta;

public class App {
    public static void main(String[] args) throws Exception {

        //Intanciando uma classe
        Caneta c1 = new Caneta("Bic","Verde", 0.8f, 90);

        //Utilizando os métodos da classe intanciada
        c1.status();
        c1.rabiscar();

        c1.setTampada();
        c1.status();
        c1.rabiscar();

    }
}
