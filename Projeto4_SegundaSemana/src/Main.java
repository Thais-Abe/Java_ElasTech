import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];

        System.out.println("Digite 5 números inteiros: ");

        for(int i = 0; i < 5; i++){
            vector[i] = sc.nextInt();
        }


        for(int i = 1; i < vector.length; i++){
            for(int j = 0; j < i; j++){
                if(vector[i] < vector[j]){
                    int aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }

        for(int num : vector){
            System.out.println(num);
        }

    }
}