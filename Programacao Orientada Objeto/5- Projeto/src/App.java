import model.Livro;
import model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        //------ Execício ------

        //Fazer duas classes "Pessoa" e "Livro" e fazer um relacionamento entre as duas.
        //Criar pelo menos 2 metodos.

        Pessoa[] pessoas = new Pessoa[5];

        pessoas[0] = new Pessoa("Ana", "F", 23);
        pessoas[1] = new Pessoa("João", "M", 21);

        Livro primeLivro = new Livro("The Witcher", "Desconhecido", 315, pessoas[0]);

        primeLivro.detalhes();
        primeLivro.abrir();
        primeLivro.folhear(316);
        primeLivro.detalhes();

        


       
    }
}
