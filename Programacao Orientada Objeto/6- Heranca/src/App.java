import model.Aluno;
import model.Bolsista;
import model.Funcionario;
import model.Professor;
import model.Visitante;


public class App {
    public static void main(String[] args) throws Exception {

        Visitante visitante  = new Visitante("Carina", 35, "F");
        Aluno aluno = new Aluno("Pedro", 15, "M", 1, "Inglês");
        Bolsista bolsista = new Bolsista("Creverson", 21, "M", 15, "TI", 12.5f);
        Professor professor = new Professor("Aldair", 45, "M", "Matemática", 3.500f);
        Funcionario  funcionario = new Funcionario("Claudia", 56, "F", "Secretaria");


        System.out.println(visitante.toString());


        System.out.println();


        System.out.println(aluno.toString());
        System.out.println(("Curso:" + aluno.getCurso()));
        aluno.pagarMensalidade();


        System.out.println();


        System.out.println(bolsista.toString());
        System.out.println(("Curso:" + bolsista.getCurso()));
        bolsista.pagarMensalidade();


        System.out.println();


        System.out.println(professor.toString());
        System.out.println(("Especialidade:" + professor.getEspecialidade()));


        System.out.println();

        
        System.out.println(funcionario.toString());
        System.out.println(("Setor:" + funcionario.getSetor()));
        System.out.println("Está trabalhando? " + funcionario.isTrabalhando());
    }
}
