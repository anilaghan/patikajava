import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        int total = 0;
        int count =0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++) {

            if (i % 3 == 0 || i % 4 == 0){
                count++;
                total+=i;
            }

        }
        double result = (total / count);

        System.out.println(result);
    }
}