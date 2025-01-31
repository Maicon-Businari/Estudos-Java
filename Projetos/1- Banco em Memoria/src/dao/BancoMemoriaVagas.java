package dao;
import model.Vaga;

public class BancoMemoriaVagas extends BancoMemoria<Vaga> {

    public BancoMemoriaVagas() {
        // Inciar com vinte vagas
        for (int i = 0; i < 9; i++) {
            lista.add(new Vaga());
        }
    }

    public void listar() {
        super.lista();
    }

    public Vaga buscar(int nVaga, boolean imprimir) {
        Vaga vagaEncontrada = super.buscar(vaga -> vaga.getnVaga() == nVaga);
        if (vagaEncontrada == null) {
            System.out.println("Vaga não encontrada");
            return null;
        }
        if (imprimir) {
            System.out.println(vagaEncontrada);
        }
        return vagaEncontrada;
    }

}
