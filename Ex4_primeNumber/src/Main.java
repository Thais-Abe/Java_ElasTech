import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scam = new Scanner(System.in);
        System.out.println("Por favor, digite um número inteiro: ");

        int number = scam.nextInt();
        if(number == 2 || number == 3 || number == 5 || number == 7 || number == 11){
            System.out.println("O número " + number + " é primo");
        }else if(number > 1 && number%number == 0 && number%2 !=0 && number%3 != 0 && number%5 != 0 && number%7 !=0 && number%11 !=0){
            System.out.println("O número " + number + " é primo");
        }else{
            System.out.println("O número " + number + " não é primo");
        }

    }

}

