import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kullaniciAdi,sifre,karar;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz : ");
        kullaniciAdi = scan.nextLine();
        System.out.println("Şifrenizi giriniz : ");
        sifre = scan.nextLine();
        if (kullaniciAdi.equals("patika") && sifre.equals("java123")) {
            System.out.println("Kullanıcı adınızı ve şifrenizi doğru giriniz. " );
        }
        else {
            System.out.println("Girdiğiniz şifre yanlış. Yeni bir şifre oluşturmak ister misiniz ? (evet,hayır)");
            karar = scan.nextLine();
            if (karar.equals("evet")) {
                System.out.println("Yeni şifrenizi giriniz :");
                sifre = scan.nextLine();
                if (sifre.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }
            else {
                System.out.println("Giriş yapamazsınız. ");
            }

        }}}