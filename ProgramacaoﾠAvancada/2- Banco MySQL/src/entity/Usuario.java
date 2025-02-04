package entity;

public class Usuario {

    //Atributos
    private int idUsuario;
    private String nome;
    private String login;
    private String senha;
    private String email;


    //Construtor
    public Usuario(String nome, String login, String senha, String email) {
        this.setNome(nome);
        this.setLogin(login);
        this.setSenha(senha);
        this.setEmail(email);
    }

    //Construtor com ID
    public Usuario(int  id, String nome, String login, String senha, String email) {
        this.setIdUsuario(id);
        this.setNome(nome);
        this.setLogin(login);
        this.setSenha(senha);
        this.setEmail(email);
    }

    //Getters e Setters
    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id: " + getIdUsuario() + " Nome: " + getNome() + " Login: "+ getLogin() +" Senha: " + getSenha()+ " Email: " + getEmail();
    }
}
