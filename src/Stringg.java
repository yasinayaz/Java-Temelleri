import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Stringg {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel. ";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("ilk harf :"+ mesaj.startsWith("B"));
        System.out.println(mesaj.concat("Yaşasın!"));
        System.out.println("Eleman sayısı 2  : " + mesaj.length());
        System.out.println(mesaj.indexOf("ü"));

        if(mesaj.endsWith(" ")==true){
            System.out.println("Son harf boş");
        }

        char [] karakter= new char[5];
        mesaj.getChars(0,5,karakter,0);
        System.out.println(karakter);

        System.out.println("-----------------------------------------------------------");

        String yenimesaj=mesaj.replace(' ','-');
        System.out.println(yenimesaj);
        System.out.println(mesaj.substring(5,9));


        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }


        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
    }
}
