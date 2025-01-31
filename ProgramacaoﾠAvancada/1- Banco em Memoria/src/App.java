import dao.BancoPessoa;
import model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        //Instaciando o banco de dados em memória
        BancoPessoa bancoPessoa = new BancoPessoa();

        //Intanciado o objetos de pessoa
        Pessoa pessoa = new Pessoa("Joao", "123", 14);
        Pessoa pessoa2 = new Pessoa("Lucas", "164", 26);
        Pessoa pessoa3 = new Pessoa("Rebeca", "748", 20);
        
        //----- Testando o banco em memoria -----

        //Adiionando pessoas ao banco
        bancoPessoa.adicionar(pessoa);
        bancoPessoa.adicionar(pessoa2);
        bancoPessoa.adicionar(pessoa3);

        //Listando todas as pessoas do banco
        bancoPessoa.listar();

        //Buscando uma pessoa com base no cpf
        System.out.println();
        bancoPessoa.buscar("164");

        //Excluindo pessoa do banco
        bancoPessoa.excluir("123");

        //Listando todas as pessoas do banco e verificando a pessoa foi excluinda
        System.out.println();
        bancoPessoa.listar();

    }
}
