public class Kart {

    String nome;

    // Agregacao
    Piloto pilot;

    // Cmposicao
    Motor mot = new Motor();

    void pular(){
        System.out.println("O " + nome + " pulou");
    }

    void soltarTurbo(){
        System.out.println("O " + nome + " soltou turbo");
    }

    void fazerDrift(){
        System.out.println("O " + nome + " fez um drift");
    }



}
