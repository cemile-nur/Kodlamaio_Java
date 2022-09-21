package week1;

public class Main {
    public static void main(String[] args) {
       int number1 = 20, number2 = 25, number3 = 2 , largestNumber = number1;

       if (largestNumber < number2){
           largestNumber = number2;
       }
        if (largestNumber < number3){
            largestNumber = number3;
        }
        System.out.println("En Büyük = " + largestNumber);
    }
}