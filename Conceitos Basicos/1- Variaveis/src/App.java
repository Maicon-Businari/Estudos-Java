public class App {
    public static void main(String[] args) throws Exception {
         //-----Tipos de variáveis-----

        //Lógicos -> Utilizados para verdeiro e falso
        boolean opreadorLogico = true;       

        // Literais => Utilizado para armazenar apenas uma letra ou texto
        char letra = 'A';  
        String palavra = "Palavra";  

        // Inteiros -> Servem para armazenar numeros, unica diferença entre eles é capacidade de armazenamento.
        byte numByte = 25;  //Pode armazenar até o numero 127
        short numShort = 1500;  // Pode armazenar até 32.767
        int numInt = 134530;  // Pode armazenar 2.147.843
        long numLong = 7000000000L;  // Pode armazenar até 2 Elevado 63
        

        // Reais (float, double)
        float temperaturaFloat = 36.5f;  // Pode Armazenar 3.4 Elevado +34
        double salarioDouble = 3500.75;  // Pode Armazenar 1.8 Elevado +308
        


        //Comandos para dar saidas de mensagens no terminal
        System.out.println("---Variável Operadora Lógica---");
        System.out.println("Operador Lógico: " + opreadorLogico);

        System.out.println("---Variáveis Literais---");
        System.out.println("Letra: " + letra);
        System.out.println("Nome: " + palavra);

        
        System.out.println("---Variáveis de Valors Inteiros---");
        System.out.println("Byte: " + numByte);
        System.out.println("Short: " + numShort);
        System.out.println("Int: " + numInt);
        System.out.println("Long: " + numLong);
        
        System.out.println("---Variáveis de Valores Reais---");
        System.out.println("Temperatura (float): " + temperaturaFloat);
        System.out.println("Salário (double): " + salarioDouble);
    }
}
