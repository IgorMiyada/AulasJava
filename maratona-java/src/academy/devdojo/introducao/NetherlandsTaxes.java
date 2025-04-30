package academy.devdojo.introducao;

public class NetherlandsTaxes {
    public static void main(String[] args){
        double salario = 4500;
        double salarioAnual = salario * 12;
        double valorASerPagoDeImposto;
        double taxaImposto1 = (9.70/100);
        double taxaImposto2 = (37.35/100);
        double taxaImposto3 = (49.5/100);
        if(salarioAnual<=34712){
            valorASerPagoDeImposto = salarioAnual * taxaImposto1;
        }
        else if(salarioAnual>=34713 && salarioAnual<= 68507){
            valorASerPagoDeImposto = salarioAnual * taxaImposto2;
        }
        else {
            valorASerPagoDeImposto = salarioAnual * taxaImposto3;
        }
        System.out.println("Salário Anual : R$" + salarioAnual);
        System.out.println("Você terá que pagar R$" + valorASerPagoDeImposto + " de imposto");
        System.out.println("Salário restante : R$"+ (salarioAnual - valorASerPagoDeImposto));
    }
}
