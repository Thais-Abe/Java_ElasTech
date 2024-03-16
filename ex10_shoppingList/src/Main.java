
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scam = new Scanner(System.in);
        List<String> shoppingList = new ArrayList<>();

        System.out.println("Vamos as compras!");
        System.out.println("Digite a opção desejada abaixo: ");
        System.out.println("1-Adicionar as compras na lista");
        System.out.println("2-Sair");
        System.out.println("A opção foi: ");
        int option = scam.nextInt();

        while (option == 1) {
            switch (option) {
                case 1:
                    System.out.println("Digite o item a ser adicionado na lista:");
                    String item = scam.next();
                    shoppingList.add(item);
                    System.out.println("--------------------------------------");

                    System.out.println("Itens adicionados:");
                    for (String itemAdd : shoppingList) {
                        System.out.println(itemAdd);
                    }
                    System.out.println("--------------------------------------");
                    System.out.println("Deseja adicionar mais itens na lista?");
                    System.out.println("Digite a opção desejada abaixo: ");
                    System.out.println("1-Adicionar as compras na lista");
                    System.out.println("2-Sair");
                    System.out.println("A opção foi: ");
                    option = scam.nextInt();
                    break;
                case 2:
                    System.out.println("A lista de compras esta completa! Até a próxima compra!");
                    break;
                default:
                    System.out.println("Digite uma opção válida");
            }
        }
        scam.close();

    }
}