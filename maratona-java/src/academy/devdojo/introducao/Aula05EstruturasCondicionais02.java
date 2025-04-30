package academy.devdojo.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main (String[] args){
        int idade = 17;
        String categoria="";
        if(idade <  15 ){
            categoria= "Você está na categoria infantil";
        }
        else if(idade>=15 && idade<18){
            categoria = "Você está na categoria juvenil";
        }
        else{
            categoria = "Você está na categoria adulta";
        }
        System.out.println(categoria);

    }
}
