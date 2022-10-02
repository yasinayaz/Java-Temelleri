public class SayiBulma {

    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 9;
        boolean varmı = false;

        for(int sayi:sayilar){
            if(sayi==aranacak){
                varmı=true;
                break;
            }
        }
        if (varmı){
            System.out.println("Aranan sayı mevcuttur");

        }else
            System.out.println("Aranan sayı mevcut değildir");

    }
}
