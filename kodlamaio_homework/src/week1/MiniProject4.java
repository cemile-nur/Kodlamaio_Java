package week1;

public class MiniProject4 {
    public static void main(String[] args) {

        int number1=220, number2=284, total1=0, total2=0;

        for (int i =1; i<number1;i++){
            if (number1%i==0){
                total1 += i;
            }
        }

        for (int i=1;i<number2;i++){
            if (number2 %i ==0){
                total2 += i;
            }
        }

        if (number1==total2 && number2==total1){
            System.out.println("bu iki sayi arkadastır.");
        }else{
            System.out.println("Bu iki sayı arkadaş değildir");
        }
    }
}
