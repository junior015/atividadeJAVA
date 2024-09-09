public class ImprimirValoresMaioresQue3 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 7, 2, 8, 4, 6, 3, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3) {
                System.out.println("Valor na posição " + i + ": " + array[i]);
            }
        }
    }
}