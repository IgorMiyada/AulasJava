package academy.devdojo.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] array = {1,2,3};

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[6];

        int[][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for(int[] arrayBase : arrayInt){
            System.out.println("\n-----");
            for(int number:arrayBase){
                System.out.print(number);
            }
        }
    }
}
