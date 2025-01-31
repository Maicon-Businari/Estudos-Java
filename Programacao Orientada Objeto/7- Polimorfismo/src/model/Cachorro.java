package model;

public class Cachorro extends Lobo {

    public Cachorro(int idade, int membros, String corPelo){
        super(idade, membros, corPelo);
    }

    //Métodos sobrescritos || Polimorfismo de sobreposição 
    @Override
    public void emitrSom() {
        System.out.println("Au! Au! Au!");
    }

    //Métodos sobrescritos || Polimorfismo de sobrecarga  ( Assinaturas diferentes na mesma classe )
    public void reagir(String frase){
        if(frase == "Comida" || frase == "Olá"){
            System.out.println("Cachorro está latindo e abanando o rabo.");
        }
        else {
            System.out.println("O cachorro está rosnando.");
        }
    }
    public void reagir(int hora, int minutos){
        if(hora <= 12){
            System.out.println("O cachorro acordou abanando o rabo.");
        }
        if(hora > 12 && hora <18){
            System.out.println("O cachorro ja comeu e está latindo e abanando o rabo");
        }
        if(hora >= 18){
            System.out.println("O cachorro está dormindo. Zzz.");
        }
    }
    public void reagir(boolean dono){
        if(dono){
            System.out.println("O cachorro está feliz.");
        }
        if(!dono){
            System.out.println("O cachorro está rosnando.");
        }
    }
    public void reagir(int idade, float peso){
        if(idade < 5){
            if(peso < 10){
                System.out.println("O cachorro está abando o rabo.");
            }
            if(peso >=10){
                System.out.println("O cachorro está latindo.");
            }
        }
        if(idade >= 5){
            if(peso < 10){
                System.out.println("O cachorro está rosnando");
            }
            if(peso >=10){
                System.out.println("O cachorro está dormindo. Zzz.");
            }
        }
    }
}
