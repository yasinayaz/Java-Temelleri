import java.util.Scanner;

public class SesliHarfler {
    public static void main(String[] args) {

        char harf = 'w';

        char[] sesliharfler = {'a', 'e', 'o', 'ö', 'ı', 'i', 'u', 'ü'};

        boolean ok = true;

        for (int i = 0; i < 8; i++) {
            if (harf == sesliharfler[i]) {
                System.out.println(harf + " Sesli harf");
                ok = false;

            }

        }
        if (ok) {
            System.out.println(harf + " Sesli harf değil");

        }
        System.out.println("--------------------------------");
        String aylar="şubat";
        System.out.println("ay giriniz");
        Scanner ay = new Scanner(System.in);
        String gelenDeğer= ay.nextLine();
        switch (gelenDeğer){
            case "ocak":
            case "şubat":
            case"temmuz":

                System.out.println("Bu aydır ");
                break;
            default:
                System.out.println("ay.nextLine()");
        }

    }
}
