package academy.devdojo.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args){
        //Utilizando o switch e dados os valores de 1 a 7, imprima se é dia útil ou não
        // Considere domingo como 1
        byte diaNumeral = 5;
        switch(diaNumeral){
            case 1:
            case 7:
                System.out.println("Não é um dia útil");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }


}
