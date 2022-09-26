package week2.homework.RecapDemoClass;

public class FourTransactions {
    public int addition(int number1, int number2){
        return number1 + number2;
    }
    public int extractionProcess(int number1, int number2){
       if (number1 > number2){
           return number1 - number2;
       }else{
           return number2 - number1;
       }

    }

    public int multiplication(int number1, int number2){
        return number1 * number2;
    }

    public int division(int number1, int number2){
        if (number1 > number2){
            return number1 / number2;
        }else{
            return number2 / number1;
        }
    }

}
