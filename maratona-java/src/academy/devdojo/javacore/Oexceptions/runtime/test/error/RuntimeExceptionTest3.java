package academy.devdojo.javacore.Oexceptions.runtime.test.error;

public class RuntimeExceptionTest3 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Gravando arquivo");
            return "conexão aberta";
        }catch(Exception error){
            error.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
            return null;
    }
}
