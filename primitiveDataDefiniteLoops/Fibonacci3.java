package primitiveDataDefiniteLoops;

public class Fibonacci3 {


        public static void main(String[] args) {

            int firstNum = 1;
            int secondNum = 1;
            
            System.out.print(firstNum + " " + secondNum + " ");

            for (int i = 1; i <= 10; i++) {
                int sum = firstNum + secondNum;
                System.out.print(sum + " ");
                firstNum = secondNum;
                secondNum = sum;    
            }
        }
    }