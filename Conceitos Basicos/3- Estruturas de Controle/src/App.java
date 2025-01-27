import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        //Linha que gera um número aleatório
        int random1 = new Random().nextInt(10);
        int random2 = new Random().nextInt(10);

        
        int num1 = random1;
        int num2 = random2;


        //----- Estruturas de Controle -----

        //---Condicionais---
        //If e Else -> Utilizado para verificar se a condição é verdadeira ou não
        if(num1 == num2){

            System.out.println("Os numeros " + num1 +" são iguais.");
        }
        else{
            System.out.println("Os numeros " + num1 + " e " + num2 + " não são iguais");
        }

        //If e Else aninhadas  -> Quando quer fazer mais de uma verificação
        if(num1 == num2){
            System.out.println("Os numeros " + num1 +" são iguais.");
        }
        else if(num1 < num2){
            System.out.println("O número " + num1 +" é menor que " + num2 + ".");
        }
        else {
            System.out.println("O número " + num1 +" é maior que " + num2 + ".");
        }
        
        //Switch case -> Utilizado quando quando já se sabe quais são as possiveis respotas
        switch (num1) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            //Caso ocorra de vir algum valor que não foi previsto
            default:
                System.out.println("Dia inválido");
                break;
        }

        //---Laços---
        //For -> Utilizado quando você sabe o número exato de repetições.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contagem FOR: " + i);
        }
        System.out.println("");

        //While -> Utilizada quando você quer repetir algo enquanto uma condição for verdadeira.
        while (num1 <= 15) {
            System.out.println("Contagem WHILE: " + num1);
            num1++;
        }
        System.out.println("");


        //Do-While -> Faz a mesma coisa que o While com a diferença que verifica depois(Executa pelo menos uma vez o código)
        do {
            System.out.println("Contagem Do: " + num2);
            num2++;
        } while (num2 <= 15);
        System.out.println("");

    }
}
