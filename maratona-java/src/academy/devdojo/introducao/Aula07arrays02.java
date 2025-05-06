package academy.devdojo.introducao;

public class Aula07arrays02 {
    public static void main(String[] args){
        //byte,short,int,long,float e double 0
        //Padrão de valor do char = '\u0000' ''
        //boolean false
        //String null
        String[] nomes = new String[3];
        nomes[0] = "Igor";
        nomes[1] = "Sabrina";
        nomes[2] = "Vanda";
        for(int i=0;i<nomes.length;i++){
            System.out.println(nomes[i]);
        }
    }
}
