package academy.devdojo.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args){
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição valorParcela>=1000
        double valorCarro = 55000;
        for(int parcela = (int) valorCarro ; parcela>0;parcela--){
            double valorParcela = valorCarro/parcela;
            if(valorParcela<1000){
                continue;
            }
            System.out.println("Você pode pagar em " + parcela + " no valor de R$" + valorParcela);
        }
    }
}
