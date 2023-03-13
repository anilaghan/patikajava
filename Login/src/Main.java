import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String userName, password;
       String select;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız: ");
        userName=input.nextLine();

        System.out.println("Şifreniz: ");
        password=input.nextLine();

        if(userName.equals("patika")&& password.equals("java123")){
            System.out.println("Giriş Yaptınız");
        }else if (userName.equals("patika") && !password.equals("java123")){
            System.out.println("Hatalı şifre. Şifrenizi Sıfırlamak ister misiniz ? y/n");
            select=input.nextLine();
            switch (select){
            case "y":
                System.out.println("Yeni Şifrenizi Giriniz");
                select=input.nextLine();
                if (select.equals("java123")){
                    System.out.println("Şifreniz bir önceki ile aynı olamaz yeni şifre giriniz");
                    select=input.nextLine();
                }else {
                    System.out.println("Şifreniz Başarıyla Oluşturuldu.");
                }
                break;
                case "n":
                    System.out.println("Lütfen şifrenizi doğru giriniz.");

            }
        }
    }
}