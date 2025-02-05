package model;

public class Animal {

    // Atributos
    private int id;
    private String nome;
    private String tipo;
    private Dono dono;

    // Construtor
    public Animal(String nome, String tipo, Dono dono) {
        this.nome = nome;
        this.tipo = tipo;
        this.dono = dono;
    }

    // Construtor com ID
    public Animal(int id, String nome, String tipo, Dono dono) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.dono = dono;
    }

    // Getter e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        String retorno = "Id: " + getId() + " Nome: " + getNome() + " Tipo: " + getTipo() +
                " -> Id Dono: " + getDono().getId() + " Nome Dono: " + getDono().getNome() + " Cpf Dono: " + getDono().getCpf();

        return retorno;
    }

}
