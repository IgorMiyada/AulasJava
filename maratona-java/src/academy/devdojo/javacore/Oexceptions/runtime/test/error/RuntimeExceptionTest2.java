package academy.devdojo.javacore.Oexceptions.runtime.test.error;

public class RuntimeExceptionTest2 {
    public static void main(String[] args) {
        divisao(1,0);
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     */
    public static int divisao(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Argumento inválido, não é possível dividir por 0");
        }
        return a/b;
    }
}
