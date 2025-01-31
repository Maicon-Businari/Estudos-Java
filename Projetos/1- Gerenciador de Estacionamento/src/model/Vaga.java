package model;

import java.time.Duration;
import java.time.LocalDateTime;

import dao.BancoMemoriaCarro;

public class Vaga {

    private static int contVaga = 0;
    private int nVaga;
    private Carro carro;
    private boolean vazia;
    private LocalDateTime tempo;

    public Vaga() {
        this.setContVaga(getContVaga() + 1);
        this.setnVaga(getContVaga());
        this.setVazia(true);
        this.setTempo(null);
    }

    public int getContVaga() {
        return contVaga;
    }

    public void setContVaga(int contVaga) {
        Vaga.contVaga = contVaga;
    }

    public int getnVaga() {
        return nVaga;
    }

    public void setnVaga(int nVaga) {
        this.nVaga = nVaga;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public boolean isVazia() {
        return vazia;
    }

    public void setVazia(boolean vazia) {
        this.vazia = vazia;
    }

    public LocalDateTime getTempo() {
        return tempo;
    }

    public void setTempo(LocalDateTime tempo) {
        this.tempo = tempo;
    }

    public void colocarCarro(String placa, BancoMemoriaCarro bancoMemoriaCarro)
            throws Exception {
        Carro carroEncontrado = bancoMemoriaCarro.buscar(placa, false);

        if (carroEncontrado == null || !this.isVazia()) {
            if (carroEncontrado == null) {
                throw new Exception("Carro não encontrado");

            } else {
                throw new Exception("Já possui um carro na vaga");
            }
        }
        this.setCarro(carroEncontrado);
        this.setVazia(false);
        this.setTempo(LocalDateTime.now());

    }

    public void retirarCarro() throws Exception {
        if (this.isVazia()) {
            throw new Exception("A vaga ja está vazia");
        }
        Duration duracao = Duration.between(this.tempo, LocalDateTime.now());
        System.out.println("O carro ficou no estácionamento :" + (duracao.getSeconds() % 60) + ":" + (duracao.getSeconds() % 60 + "." ));
        this.setCarro(null);
        this.setVazia(true);
        this.setTempo(null);

    }

    @Override
    public String toString() {
        return "Numéro vaga: " + getnVaga() + " Vazia: " + isVazia() + " Carro: " + getCarro();
    }
}
