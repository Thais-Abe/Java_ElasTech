
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scam = new Scanner(System.in);
        List<String> shoppingList = new ArrayList<>();
        boolean stopAddShoppingList = false;

        while (!stopShoppingList) {
            optionsMenu();
            int option = scam.nextInt();
            switch (option) {
                case 1:
                    scam.nextLine();
                    System.out.println("Digite o item a ser adicionado na lista:");
                    String item = scam.next();
                    shoppingList.add(item);
                    System.out.println("--------------------------------------");

                    System.out.println("Itens adicionados:");
                    for (String itemAdd : shoppingList) {
                        System.out.println(itemAdd);
                    }
                    System.out.println("--------------------------------------");
                    break;
                case 2:
                    System.out.println("A lista de compras esta completa! Até a próxima compra!");
                    stopAddShoppingList = true;
                    break;
                default:
                    System.out.println("Digite uma opção válida");
            }
        }
        scam.close();

    }

    public static void optionsMenu(){
        System.out.println("Vamos as compras!");
        System.out.println("Digite a opção desejada abaixo: ");
        System.out.println("1-Adicionar as compras na lista");
        System.out.println("2-Sair");
        System.out.println("A opção foi: ");
    }
}
