import model.Aluno;
import model.Video;
import model.Visualizacao;

public class App {
    public static void main(String[] args) throws Exception {

        Video videos[] = new Video[5];

        videos[0] = new Video("Primeiro Video");
        videos[1] = new Video("Segundo video");
        videos[2] = new Video("Terceiro video");

        Aluno alunos[] = new Aluno[3];

        alunos[0] = new Aluno("Maicon", 25, "M", "1234");
        alunos[1] = new Aluno("Pedro", 23, "M", "5678");
        alunos[2] = new Aluno("Matheus", 19, "M", "91011");

        System.out.println(videos[0].toString());
        System.out.println(videos[1].toString());
        System.out.println(videos[2].toString());

        System.err.println();

        System.out.println(alunos[0].toString());
        System.out.println(alunos[1].toString());
        System.out.println(alunos[2].toString());

        Visualizacao visualizacoes[] = new Visualizacao[3];

        visualizacoes[0] = new Visualizacao(alunos[0], videos[0]);
        visualizacoes[1] = new Visualizacao(alunos[0], videos[1]);
        visualizacoes[2] = new Visualizacao(alunos[0], videos[2]);

        visualizacoes[1].status();

        System.out.println(alunos[0].getQtdeAulaAss());
    }
}
