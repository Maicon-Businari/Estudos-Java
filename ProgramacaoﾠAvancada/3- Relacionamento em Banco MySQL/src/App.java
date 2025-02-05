import dao.AnimalDAO;
import dao.DonoDAO;
import model.Animal;
import model.Dono;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Inserindo dados
        Dono dono = new Dono(1,"Lucas", "123456");
        Animal animal = new Animal(2,"Lila", "Gato", dono);

        //Conexões com banco de dados
        DonoDAO donoDAO = new DonoDAO();
        AnimalDAO animalDAO = new AnimalDAO();


        //Ações para o banco Dono
        donoDAO.adicionar(dono);
        donoDAO.listar();
        donoDAO.buscar(1);
        donoDAO.atualizar(dono);
        donoDAO.deletar(1);

        //Ações para o banco Animal
        animalDAO.adicionar(animal);
        animalDAO.listar();
        animalDAO.buscas(1);
        animalDAO.atualizar(animal);
        animalDAO.deletar(2);
        animalDAO.listar();


    }
}
