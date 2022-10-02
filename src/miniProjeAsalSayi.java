public class miniProjeAsalSayi {

    public static void main(String[] args) {

        int number =7;
        int remainder=number % 2;
       // System.out.println(remainder);
        boolean isPrime= true;


        for(int i=2; i<number; i++){

            if(number % i == 0 ){
                isPrime=false;

            }

        }

        if(isPrime){
            System.out.println("sayı asal ");
        }else
            System.out.println("sayı asaldır değildir");
    }
}
