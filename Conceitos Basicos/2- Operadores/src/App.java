public class App {
    public static void main(String[] args) throws Exception {

        int num1 = 9;
        int num2 = 2;
        float res;

        boolean booleano;

        //----- Operadores -----


        //---Operadores Aritiméticos
        //Soma
        res = num1 + num2;
        System.out.println("Resultado da soma: " + res);

        //Subtração
        res = num1 - num2;
        System.out.println("Resultado da subtração: " + res);

        //Multiplicação
        res = num1 * num2;
        System.out.println("Resultado da multiplicação: " + res);

        //Divisão
        res = num1 / num2;
        System.out.println("Resultado da divisão: " + res);

        //Resto da Divisão
        res = num1 % num2;
        System.out.println("Resto da divisão: " + res);

        
        //---Operadores Relacionais---
        //Igual
        booleano = num1 == num2;
        System.out.println("O primeiro numero é igual ao segundo. " + booleano);

        //Diferente
        booleano = num1 != num2;
        System.out.println("O primeiro numero é diferente do segundo. " + booleano);

        //Maior
        booleano = num1 > num2;
        System.out.println("O primeiro numero é maior que segundo. " + booleano);

        //Menor
        booleano = num1 < num1;
        System.out.println("O primeiro numero é menor que segundo. " + booleano);

        
        //---Operadores Lógicos
        // E -> Todas as condições tem que ser verdadeiras
        booleano = (num1 == num2 && num2 == num1);
        System.out.println("As duas condições são verdadeiras: " + booleano);

        // E -> Pelo menos uma das condições tem que ser verdadeira
        booleano = (num1 == num2 || num2 == num2);
        System.out.println("Pelo menos uma das condições são verdadeiras: " + booleano);
    }
}
