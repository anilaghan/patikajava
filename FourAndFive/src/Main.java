import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı Giriniz");
        n=scan.nextInt();

        for (int i = 1, k = 1; i <= n && k <= n; i *= 4, k *= 5){
            System.out.println(i + "\t" + k);
        }
    }
}