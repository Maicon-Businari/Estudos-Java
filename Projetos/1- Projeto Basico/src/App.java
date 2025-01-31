import model.Livro;
import model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        //Intanciado um array para receber cinco pessoas
        Pessoa[] pessoas = new Pessoa[5];

        //Intciando um objeto pessoas e colcando em uma posição especifica do array
        pessoas[0] = new Pessoa("Ana", "F", 23);
        pessoas[1] = new Pessoa("João", "M", 21);

        //Intanciando o objeto livro e passando como parametro um objeto pessoa, criando asism assim um ralacionamento entre elas
        Livro primeLivro = new Livro("The Witcher", "Desconhecido", 315, pessoas[0]);

        //Imprimindo informações
        primeLivro.detalhes();
        primeLivro.abrir();
        primeLivro.folhear(316);
        primeLivro.detalhes();
       
    }
}
