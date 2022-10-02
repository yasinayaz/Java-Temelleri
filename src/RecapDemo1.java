public class RecapDemo1 {

    public static void main(Stringg[] args) {

        int sayi1=27;
        int sayi2=25;
        int sayi3=26;

        int enBüyük= sayi1;
        if (enBüyük<sayi2){
            enBüyük=sayi2;
        }
        if(enBüyük<sayi3){
            enBüyük=sayi3;
        }
        System.out.println("En büyük sayı "+ enBüyük);
    }
}
