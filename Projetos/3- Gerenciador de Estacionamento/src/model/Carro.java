package model;

import dao.BancoMemoriaMotorista;
import util.InputUtil;

public class Carro {

    // Atributos
    private String modelo;
    private String cor;
    private String placa;
    private Motorista motorista;

    // Construtor
    public Carro(String modelo, String cor, String placa, String cpfMotorista,
            BancoMemoriaMotorista bancoMemoriaMotorista) throws Exception {

        Motorista motoristaEncontrado = bancoMemoriaMotorista.buscar(cpfMotorista, false);

        if (motoristaEncontrado == null) {
            throw new Exception("Motorista não cadastrado.");
        }
        this.setModelo(modelo);
        this.setCor(cor);
        this.setPlaca(placa);
        this.setMotorista(motoristaEncontrado);

    }

    // Getter e Setter
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) throws Exception {
        if (InputUtil.validarPalavra(modelo)) {
            this.modelo = modelo;
        } else {
            throw new Exception("Modelo inválido.");
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) throws Exception {
        if (InputUtil.validarPalavra(cor)) {
            this.cor = cor;
        } else {
            throw new Exception("Cor inválida.");
        }

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) throws Exception {

        if (InputUtil.validarPlaca(placa)) {
            this.placa = placa;
        } else {
            throw new Exception("Placa inválida.");
        }

    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    // Métodos
    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Cor: " + cor + ", Placa: " + placa + ", Motorista: " + motorista;
    }
}
