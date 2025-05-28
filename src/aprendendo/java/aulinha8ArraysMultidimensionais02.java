package aprendendo.java;

public class aulinha8ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        // NÃO ENTENDI NADA! LEMBRAR DE ESTUDAR SOBRE DEPOIS!!!!!!!!
        // AULA 38 CANAL DevDojo playlist: Maratona Java Virado no Jiraya
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n---------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
