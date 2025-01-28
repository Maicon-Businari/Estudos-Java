package model;
import interfaces.Publicacao;

public class Livro implements Publicacao{

    //Atributos
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Construtor
    public Livro(String titulo, String autor, int totalPag, Pessoa leitor){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotalPag(totalPag);
        this.setPagAtual(1);
        this.setAberto(false);
        this.setLeitor(leitor);
    }

    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotalPag() {
        return totalPag;
    }
    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Métodos
    public void detalhes(){
        System.out.println("-----DETALHES DO LIVRO-----");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotalPag());
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("O livro está aberto? " + this.isAberto());
        System.out.println("Quem está lendo? " + this.getLeitor().getNome());
    }
    @Override
    public void abrir() {
        if(isAberto()){
            System.out.println("O livro já está aberto.");
        }
        if(!isAberto()){
            setAberto(true);       
        }
              
    }
    @Override
    public void fechar() {
        if(!isAberto()){
            System.out.println("Livro já está fechado.");
        }
        if(isAberto()){
            setAberto(false);
        }
             
    }
    @Override
    public void folhear(int nPag) {
        if(isAberto() && nPag > 0 && nPag <= getTotalPag()){
            setPagAtual(nPag);
        }
        if(!isAberto()){
            System.out.println("Livro fechado, não posso folhear.");
        }
        if(nPag <= 0 || nPag > getTotalPag()){
            System.out.println("Não foi possivel folhear, numero da pagina incorreto.");
        }
    }
    @Override
    public void avancarPag() {
        if(isAberto()){
            setPagAtual(getPagAtual()+1);        
        }
        if(!isAberto()){
            System.out.println("Não é possivel avançar a página, livro está fechado.");
        }
    }
    @Override
    public void voltarPag() {
        if(isAberto()){
            setPagAtual(getPagAtual()-1);        
        }
        if(!isAberto()){
            System.out.println("Não é possivel voltar a página, livro está fechado.");
        }
    }
}
