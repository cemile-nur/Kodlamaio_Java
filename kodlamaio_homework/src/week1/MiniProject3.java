package week1;

public class MiniProject3 {
    public static void main(String[] args) {

        int number=5, total=0;

        for (int i=1; i<number;i++){
            if (number % i ==0){
                total +=i;
            }
        }

        if (total ==number){
            System.out.println("Mukemmel sayidir.");
        }else {
            System.out.println("Mukemmel sayi degildir.");
        }
    }
}
