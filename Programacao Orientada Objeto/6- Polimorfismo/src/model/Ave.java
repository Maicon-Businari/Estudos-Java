package model;

public class Ave extends Animal{

     //Atributo
     private String cor;

     //Construtor de Raptil + Construtor de Animal
     public Ave(float peso, int idade, int membros, String cor) {
         super(peso, idade, membros);
         this.setCor(cor);
     }
 
     //Getters e Setters
     public String getCor() {
         return cor;
     }
     public void setCor(String cor) {
         this.cor = cor;
     }
 
     //Métodos
     public void fazerNinho(){
         System.out.println("A ave está construindo ninho.");
     }
 
     //Métodos sobrescritos | Polimorfismo de sobreposição ( Mesmas assinaturas em classes diferentes )
     @Override
     public void locomover() {
         System.out.println("Ave andando.");        
     }
 
     @Override
     public void alimentar() {
         System.out.println("Ave comendo.");        
     }
 
     @Override
     public void emitirSom() {
         System.out.println("Ave fazendo barulho.");        
     }  

}
