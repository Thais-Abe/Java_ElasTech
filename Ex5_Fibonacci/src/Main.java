// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 20; i++) {
            System.out.println("i = " + fibonacci(i));
        }
    }

    public static int fibonacci(int number){
        if(number < 2){
            return number;
        }else{
            return  fibonacci(number-1) + fibonacci(number-2);
        }
    }
}