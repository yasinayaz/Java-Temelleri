public class multiDimensionalArrayDemo {

    public static void main(Stringg[] args) {

        String[][] sehirler=new String[3][3];

        sehirler[0][0] ="istanbul";
        sehirler[0][1] ="bursa";
        sehirler[0][2] ="kocaeli";
        sehirler[1][0] ="ankara";
        sehirler[1][1] ="kayseri";
        sehirler[1][2] ="konya";
        sehirler[2][0] ="diyarbakır";
        sehirler[2][1] ="batman";
        sehirler[2][2] ="bingöl";


        for(int i=0; i<=2; i++){
            if(i==0){
                System.out.println("Marmara Bölgesi");
            }
            else if (i==1) {
                System.out.println("İç Anadolu Bölgesi");

            }
            else System.out.println("doğu anadolu bölgesi");
            for (int j=0; j<=2; j++){
                System.out.println(sehirler[i][j]);
            }
        }


    }
}
