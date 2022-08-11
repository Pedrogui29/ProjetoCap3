public class Trabalhador {

    String nome;
    String profissao;
    float salario;
    String rg;
    String dataNascimento;

    void recebeAumento(float valor){

        salario  = valor + salario;
        System.out.println("Salario atualizado para: "+ salario);
    }

    float calculaGanhoAnual(){

        return salario * 13;
    }

    void mostrainfosFuncionario(){

        System.out.println("Nome: "+ nome + " profissao: "+profissao + " Salario: "+ salario+ " RG: "+ rg +
                " Data de Nascimento: "+ dataNascimento);
    }


}
