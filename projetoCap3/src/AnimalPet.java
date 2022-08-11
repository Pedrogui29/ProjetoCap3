public class AnimalPet {

    String nome;
    String especie;
    String som;
    String comida;
    int idade;

    void comer(){
        System.out.println("O(a) "+ nome+ " da especie "+ especie+ " esta comendo"  );
    }
    void dormir(){
        int horas = 9;
        System.out.println("O(a) "+ nome+ " da especie "+ especie+ " esta dormindo desde as"+horas+ " horas."   );
    }
    void movimentar(){
        int metros = 10;
        System.out.println("O(a) "+ nome+ " da especie "+ especie+ " se movimentou "+metros+ " metros."   );
    }
    void fazerBarulhos(){
        System.out.println("O(a) "+ nome+ " da especie "+ especie+ " esta fazendo barulho."  );
    }


}
