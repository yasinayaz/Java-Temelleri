public class ReCapDemo2 {

    public static void main(Stringg[] args) {

        double [] mylist={1.2,5.5,3.4,4.5};
        double total=0;
        double max=mylist[0];
        for (double number:mylist){
            if(max<number){
                max=number;
            }
            total=total+number;
            System.out.println(number);
        }
        System.out.println("toplam sayı "+ total);
        System.out.println("en büyük sayı " + max);
    }


}
