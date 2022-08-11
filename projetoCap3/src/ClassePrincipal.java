public class ClassePrincipal {

    public static void main(String[] args) {
       // Para se criar um objeto dentro da memoria usa-se a palavra new
       // Para acessar esse objeto deve-se criar um ponteiro para ele

       /*
        Trabalhador t1 = new Trabalhador();
        t1.nome = "Paulo";
        t1.profissao = "uber";
        t1.salario = 2000;
        t1.rg = "3456776";
        t1.dataNascimento = "27/05/1987";
        t1.calculaGanhoAnual();


        Trabalhador t2 = new Trabalhador();
        t2.nome = "Felipe";
        t2.profissao = "Advogado";
        t2.salario = 5000;
        t2.rg = "3357876";
        t2.dataNascimento = "27/05/1990";
        t2.calculaGanhoAnual();
        t2.mostrainfosFuncionario();


        Trabalhador t3 = new Trabalhador();
        t3.nome = "Mateus";
        t3.profissao = "dev";
        t3.salario = 3000f;
        t3.rg = "263446";
        t3.dataNascimento = "14/11/2002";
        t3.recebeAumento(400);
        t3.mostrainfosFuncionario();

        */

        // Exercicio Mario kart
        // criando piloto
        Piloto piloto1 = new Piloto();
        piloto1.nome = "Mario";
        piloto1.vilao = false;

        Piloto piloto2 = new Piloto();
        piloto2.nome = "Wario";
        piloto2.vilao = true;

        // criando karts
        Kart k1 = new Kart();
        k1.nome = "Formula 1";
        // Acessando os dados do motor
        k1.mot.cilindradas = "50cc";
        k1.mot.velocidadeMaxima = 100;
        // Colocando o piloto dentro do kart
        k1.pilot = piloto1;

        Kart k2 = new Kart();
        k2.nome = "Yoshi Kart";
        // Acessando os dados do motor
        k2.mot.cilindradas = "100cc";
        k2.mot.velocidadeMaxima = 200;
        // Colocando o piloto dentro do kart
        k2.pilot = piloto2;

        // Chamando metodos dos karts
        k1.fazerDrift();
        k1.pilot.soltaSuperPoder();

        // chamando dados do motor de um kart
        System.out.println("Piloto do kart "+ k2.nome);
        System.out.println(k2.pilot.nome);
        System.out.println("Motor do kart "+ k2.nome);
        System.out.println(k2.mot.cilindradas);




    }

}
