package string;

import java.util.Scanner;

class StringManipulation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int numCaracteres = input.length();
        System.out.println("a - Número de caracteres: " + numCaracteres);

        String stringMaiuscula = input.toUpperCase();
        System.out.println("b - String em maiúsculo: " + stringMaiuscula);

        int numVogais = contarVogais(input);
        System.out.println("c - Número de vogais: " + numVogais);

        boolean comecaComUni = stringMaiuscula.startsWith("UNI");
        System.out.println("d - Começa com 'UNI': " + comecaComUni);

        boolean terminaComRio = stringMaiuscula.endsWith("RIO");
        System.out.println("e - Termina com 'RIO': " + terminaComRio);

        scanner.close();
    }

    public static int contarVogais(String s) {
        int count = 0;
        String vogais = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            if (vogais.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}