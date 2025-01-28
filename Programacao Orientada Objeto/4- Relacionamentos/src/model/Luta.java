package model;
import java.util.Random;

public class Luta {

    // Atributos
    //Uma classe que depende de outra classe para ser instanciada (Relacionamento)
    private Lutador desafiante;// Que chamou pra briga
    private Lutador desafiado;// Quem aceitou brigar
    private int rounds;
    private boolean lutaPermitida;

    // Contrutor
    public Luta(Lutador desafiante, Lutador desafiado, int rouds) {
        this.setDesafiante(desafiante);
        this.setDesafiado(desafiado);
        this.setRounds(rounds);
        this.setLutaPermitida(false);
    }

    // Getters e Setters
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean isLutaPermitida() {
        return lutaPermitida;
    }
    public void setLutaPermitida(boolean lutaPermitida) {
        this.lutaPermitida = lutaPermitida;
    }

    // Métodos
    public void marcarLuta() {
        if (this.desafiante.getNome() != this.desafiado.getNome() &&
                this.desafiante.getCategoria() == this.desafiado.getCategoria()) {
            this.setLutaPermitida(true);
        }
        else{
            if (this.desafiante.getNome() == this.desafiado.getNome()) {
            
                System.out.println("A luta não pôde ser marcada, possui apenas um lutador.");
            }
            if (this.desafiante.getCategoria() != this.desafiado.getCategoria()) {
                System.out.println("A luta não pôde ser marcada, lutadores de catégoria diferente.");
            }
            this.setDesafiante(null);
            this.setDesafiado(null);
        }       
    }
    public void lutar() {
        int desafiante = new Random().nextInt(10);
        int desafiado = new Random().nextInt(10);

        //Timer do suspense
        try {
            System.out.println("O resultado da luta foi...");
            Thread.sleep(1000);
            System.out.println("foi...");
            Thread.sleep(1000);    
            System.out.println("foiiiiiiiii...");
            Thread.sleep(1000);  
        } catch (Exception e) {
            System.out.println("Não é para ocorrer!!!");
        //Timer do suspense
        }
        if(desafiado == desafiante){
            System.out.println("EMPATE!!!!!");
            this.getDesafiante().empatarLuta();
            this.getDesafiado().empatarLuta();
        }
        if(desafiante > desafiado){
            this.getDesafiante().ganharLuta();
            this.getDesafiado().perderLuta();
            System.out.println("VITÓRIA PARA O " + this.getDesafiante().getNome() + "!!!");
        }
        if(desafiante < desafiado){
            this.getDesafiante().perderLuta();
            this.getDesafiado().ganharLuta();;
            System.out.println("VITÓRIA PARA O " + this.getDesafiado().getNome() + "!!!");
        }
    }
    public void status() {
        System.out.println("------STATUS DA LUTA------");
        System.out.println("A luta esta marcada: " + this.isLutaPermitida());
        if (this.isLutaPermitida()) {
            System.out.println("");
            System.out.println("------AO NOSSO LADO DIREITO------");
            System.out.println("Pesando pesando " +   this.desafiante.getPeso() + "KG, com um total de "
                    + this.desafiante.getVitorias() + " vitórias e " + this.desafiante.getDerrotas() + " derrotas, "
                    + this.desafiante.getNome() + "!!!!");

            System.out.println("");
            System.out.println("------JÁ AQUI DO LADO ESQUERDO TEMOS ------");
            System.out.println("Pesando pesando " + this.desafiado.getPeso() + "KG, com um total de "
                    + this.desafiado.getVitorias() + " vitórias e " + this.desafiado.getDerrotas() + " derrotas, "
                    + this.desafiado.getNome() + "!!!!");

        }
    }
}
