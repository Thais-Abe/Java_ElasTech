import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scam = new Scanner(System.in);
        System.out.println("Por favor, digite um número inteiro para saber se é primo ou não: ");

        try {
            System.out.println("Digite um valor maior que 0, por favor");
            int number = scam.nextInt();
            while (number <= 0) {
                System.out.println("somente números inteiros positivos e acima de zero são aceitos !");
                System.out.println("Digite um número: ");
                number = scam.nextInt();
            }
            boolean isPrime = verifyIfIsPrimeNumber(number);
            if (isPrime && number > 1) {
                System.out.println("O número : " + number + " é primo");
            } else {
                System.out.println("O número : " + number + " não é primo");
            }
        } catch (Exception e) {
            System.out.println("você digitou qualquer coisa menos um número inteiro, execute o programa novamente" + e.getMessage());
        }
    }

    public static boolean verifyIfIsPrimeNumber(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }

}

//        boolean isPrime = verifyIfIsPrimeNumber(number);
//        if(isPrime){
//            System.out.println("O número : " + number + " é primo");
//        }else{
//            System.out.println("O número : " + number + " não é primo");
//        }


//
//        if(number == 2 || number == 3 || number == 5 || number == 7 || number == 11){
//            System.out.println("O número " + number + " é primo");
//        }else if(number > 1 && number%number == 0 && number%2 !=0 && number%3 != 0 && number%5 != 0 && number%7 !=0 && number%11 !=0){
//            System.out.println("O número " + number + " é primo");
//        }else{
//            System.out.println("O número " + number + " não é primo");
//        }
