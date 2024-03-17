import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------");
        System.out.println("Bem-vindo! Aqui você pode realizar as 4 operações básicas =] ");
        System.out.println("----------------------------------------------------");

        Scanner scam = new Scanner(System.in);
        System.out.println("O que deseja fazer? Digite: ");
        System.out.println("1-Para começar ");
        System.out.println("2-Sair =[");
        int optionSelected = scam.nextInt();

        while (optionSelected == 1) {
            System.out.println("Digite o primeiro número");
            double firstNumber = scam.nextDouble();
            System.out.println("Agora digite o segundo número, por favor: ");
            double secondNumber = scam.nextDouble();
            System.out.println("Digite o número correspondente a sua operação:");
            System.out.println(" 1-Soma \n 2-Subtração \n 3-Divisão \n 4-Multiplicação");
            int option = scam.nextInt();

            calculateAccordingOption(option, firstNumber, secondNumber);

            System.out.println("Deseja fazer outra operação? ");
            System.out.println("Digite: 1 para realizar outra operação ou 2 para finalizar o programa");

            optionSelected = validateType();

        }

        scam.close();
    }


    public static void calculateAccordingOption(int option, double firstNumber, double secondNumber) {
        switch (option) {
            case 1:
                double sum = firstNumber + secondNumber;
                System.out.println("Opção escolhida: soma: ");
                System.out.println(firstNumber + " + " + secondNumber + "=" + sum);
                break;
            case 2:
                double sub = firstNumber - secondNumber;
                System.out.println("Opção escolhida: subtração: ");
                System.out.println(firstNumber + " - " + secondNumber + "=" + sub);
                break;
            case 3:
                double div = firstNumber / secondNumber;
                System.out.println("Opção escolhida: divisão: ");
                System.out.println(firstNumber + " / " + secondNumber + "=" + div);
                break;
            case 4:
                double mult = firstNumber * secondNumber;
                System.out.println("Opção escolhida: multiplicação ");
                System.out.println(firstNumber + " x " + secondNumber + " = " + mult);
                break;
            default:
                System.out.println("Tente novamente, digite uma opção válida!");
        }
    }

    public static int validateType() {

        Scanner scam = new Scanner(System.in);
        int numberTyped;

        while (true) {
            try {
                String optionFinal = scam.next();
                numberTyped = Integer.parseInt(optionFinal);
                if (numberTyped != 1 && numberTyped != 2) {
                    System.out.println("Número inválido, tente novamente! ");
                    String optionFinalTry = scam.next();
                    numberTyped = Integer.parseInt(optionFinalTry);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número novamente.");
            }
        }

        System.out.println("Você digitou o número: " + numberTyped);
        return numberTyped;
    }

}
