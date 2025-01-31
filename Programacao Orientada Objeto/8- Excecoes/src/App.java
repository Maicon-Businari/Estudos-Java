import model.Financiamento;

public class App {
    public static void main(String[] args) throws Exception {

        float valorTotal = 1000f;
        float entrada = 100f;
        int qtdeParcelas = 10;

        //------ Exceções -----

        //Try Catch -> Utillizado para repar erros futuros não previstos
        try {
            Financiamento f = new Financiamento(valorTotal, entrada, qtdeParcelas);
            System.out.println(f.prestacao());
      
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

    }
}
