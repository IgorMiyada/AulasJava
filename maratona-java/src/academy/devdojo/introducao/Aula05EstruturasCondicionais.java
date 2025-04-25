package academy.devdojo.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args){
        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida){
            System.out.println("Está autorizado a comprar bebida alcóolica");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não está autorizado a compra de bebidas alcóolicas");
        }
        System.out.println("Fora do if");
    }
}
