package util;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputUtil {
    //Utilizado static nos metodos para que possam ser utilizados sem precisar instaciar a classe

    //Vericando se tem algarismos na String
    public static boolean validarPalavra(String palavra) {
        Pattern palavraPadrao = Pattern.compile("^[A-Za-z]+$");
        return palavraPadrao.matcher(palavra).matches();
    }

    //Verificando se possui apenas numeros
    public static boolean validarAlgarismo(String algarismo){
        Pattern numeroPadrao = Pattern.compile("[0-9]+$");
        return numeroPadrao.matcher(algarismo).matches();
    }

    //Validando CPF
    public static boolean validadorCpf(String cpf) {
        Pattern cfpPadrao = Pattern.compile("[0-9]{11}");
        return cfpPadrao.matcher(cpf).matches();
    }


    //Validando a Placa
    public static boolean validarPlaca(String placa) {

        Pattern padraoPlacaAntiga = Pattern.compile("^[A-Za-z]{3}\\d{4}$");
        Pattern padraoPlacaNova = Pattern.compile("^[A-Za-z]{3}\\d{1}[A-Za-z]{1}\\d{2}$");

        return padraoPlacaAntiga.matcher(placa).matches() || padraoPlacaNova.matcher(placa).matches();
    }
    
    //Pause no console
    @SuppressWarnings("resource")
    public static void pressionarParaContinuar() {
        System.out.println("Pressione Enter para continuar...");
        new Scanner(System.in).nextLine();
    }

    //Temporizador 1 segundo
    public static void pausarExecucao() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Erro no temporizador");
        }
    }

    //Validar e converter string para int
    public static int validarConveterInt(String input) {
        if (!InputUtil.validarAlgarismo(input)) {
            System.out.println("Informar somente numeros");
            InputUtil.pausarExecucao();
            return -1;
        }

        return Integer.parseInt(input);
    }


}
