import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        int total = 0;

        do {
            System.out.println("Sayi Giriniz : ");
            n = scan.nextInt();
            if (n % 2 == 0 || n % 4 == 0){
                total+=n;
            }
        } while (n % 2 == 0);

        System.out.println(total);
    }
}