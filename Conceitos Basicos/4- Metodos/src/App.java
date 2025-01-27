import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        int random1 = new Random().nextInt(10);
        int random2 = new Random().nextInt(10);

        int num1 = random1;
        int num2 = random2;
        float resultado;
       
        resultado = dividir(num1, num2);
        System.out.println("Resultado da divisão de " + num1 + " por " + num2 + " é: " + resultado);

        resultado = dividir(num2, num1);
        System.out.println("Resultado da divisão de " + num2 + " por " + num1 + " é: " + resultado);

    }

    //----- Métodos -----
    //Função -> Utilizado quando se pretendo utilizar mais de uma vez o mesmo bloco de código
    //Variaveis passados na função receber o nome de parametros (Atualmente 2 parametros)
    public static float dividir(int num1, int num2) {
        //Converte a respota inteira para float
        return (float) num1 / num2;
    }
}
