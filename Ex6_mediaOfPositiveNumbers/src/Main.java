import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scam = new Scanner(System.in);
        double number;
        List<Double> listOfPositiveNumbers = new ArrayList<>();
        System.out.println("Por favor, digite um número: ");

        boolean isPositive = true;
        while (isPositive) {
            number = scam.nextDouble();
            if (number < 0) {
                System.out.println("Número negativo digitado. Encerrando entrada de números.");
                isPositive = false;
            } else {
                listOfPositiveNumbers.add(number);
            }
        }

        Double sum = sumOfPositiveElementsTyped(listOfPositiveNumbers);

        double media = listOfPositiveNumbers.isEmpty() ? 0.0 : sum / listOfPositiveNumbers.size();

        System.out.println("A média dos números positivos que você digitou é: " + media);
    }

    public static Double sumOfPositiveElementsTyped(List<Double> list) {
        double sum = 0.00;
        for (double numberPositive : list) {
            sum += numberPositive;
        }
        return sum;
    }

}
