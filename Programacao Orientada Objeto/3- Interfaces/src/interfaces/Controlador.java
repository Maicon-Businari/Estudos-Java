package interfaces;

//Serve para dizer que quem for implementar o "Controlador" terá que codificar esses métodos
public interface Controlador {
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void aumentarVolume();
    public abstract void deminuirVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
