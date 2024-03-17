import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scam = new Scanner(System.in);
        
        System.out.print("Por favor digite um número inteiro: ");
        int number = scam.nextInt();

        System.out.println("A tabuada de 1 a 10 do número " + number + " é : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + i * number);
        }
        scam.close();
    }
}
