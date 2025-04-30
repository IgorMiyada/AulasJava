package academy.devdojo.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args){
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição valorParcela>=1000
        double valorCarro = 55000;
        for(int qtdParcelas = 1; qtdParcelas<=valorCarro;qtdParcelas++){
            double valorParcela = valorCarro/qtdParcelas;
            if(valorParcela>=1000){
                System.out.println("Você pode pagar em " + qtdParcelas + " no valor de R$" + valorParcela);
            }
            else{
                break;
            }
        }
    }
}
