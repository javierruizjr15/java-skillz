package primitiveDataDefiniteLoops;

public class NumForwardTriangle8 {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5 - row; col++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= row; k++) {
                System.out.print(row);
            }
            System.out.println();
        }  
    }
}