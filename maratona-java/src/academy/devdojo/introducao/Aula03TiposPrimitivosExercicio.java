package academy.devdojo.introducao;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:



Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Igor";
        String address = "Rua Fernando de Noronha 226";
        double salary = 2500;
        String date = "16/04/2025";
        String relatorio = "Eu " + name + ", morando no endereço "+address + ", confirmo que recebi o salário de " + salary
                + ", na data " + date;

        System.out.println(relatorio);
    }
}
