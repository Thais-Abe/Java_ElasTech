import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scam = new Scanner(System.in);
        optionsFromMenu();

        int option = scam.nextInt();

        boolean notFinishProcess = true;

        while (notFinishProcess) {
            switch (option) {
                case 1:
                    System.out.println("Digite a temperatura a ser convertida para Fahrenheit");
                    double celsius = scam.nextDouble();
                    System.out.println(celsius + "para Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
                    optionsFromMenu();
                    option = scam.nextInt();
                    break;
                case 2:
                    System.out.println("Digite a temperatura a ser convertida para Celsius");
                    double fahrenheit = scam.nextDouble();
                    System.out.println(fahrenheit + "para Celsius: " + convertFahrenheitToCelsius(fahrenheit));
                    optionsFromMenu();
                    option = scam.nextInt();
                    break;
                case 3:
                    System.out.println("Sair");
                    notFinishProcess = false;
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    notFinishProcess = false;
            }
        }

        scam.close();
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return ((180 * celsius) + 3200) / 100;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return ((100 * fahrenheit) - 3200) / 180;
    }

    public static void optionsFromMenu() {
        System.out.println("Digite o número da opção desejada: ");
        System.out.println("1 - Converter a temperatura de Celsius para Fahrenheit");
        System.out.println("2 - Converter a temperatura de Fahrenheit para Celsius");
        System.out.println("3 - Sair");
        System.out.println("A opção desejada foi: ");
    }

}

