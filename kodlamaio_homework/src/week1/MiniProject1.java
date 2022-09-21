package week1;

public class MiniProject1 {
    public static void main(String[] args) {
        int number=25, remainder =number % 2 ;
        boolean isPrime=true;

        if (number ==1){
            System.out.println("Asal sayı değildir.");
            return;
        }

        if (number<1){
            System.out.println("Gecersiz sayi");
        }

        System.out.println(remainder);
        for (int i=2; i<number;i++){
            if (number % i == 0){
                isPrime=false;
            }
        }
        if (isPrime){
            System.out.println("Sayi Asaldir");
        }else {
            System.out.println("Sayi Asal Degildir");
        }
    }
}
