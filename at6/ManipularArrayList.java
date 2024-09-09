import java.util.ArrayList;

class ManipularArrayList {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Talles");
        nomes.add("Pedro");

        nomes.remove(1);

        System.out.println("Nomes após remover o segundo nome:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        if (nomes.size() > 2) {
            nomes.remove(2);
        }

        System.out.println("\nNomes após remover o terceiro nome:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        if (nomes.size() > 0 && "Talles".equals(nomes.get(0))) {
            System.out.println("\nO nome na primeira posição é Talles.");
        } else {
            System.out.println("\nO nome na primeira posição não é Talles.");
        }
    }
}