package clima;

import java.util.Scanner;

class clima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        int temperatura = scanner.nextInt();

        if (temperatura > 30) {
            System.out.println("O clima está quente.");
        } else {
            System.out.println("O clima está frio.");
        }

        scanner.close();
    }
}
