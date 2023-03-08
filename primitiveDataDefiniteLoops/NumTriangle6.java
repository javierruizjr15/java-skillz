package primitiveDataDefiniteLoops;

public class NumTriangle6 {
    public static void main(String[] args) {
        for (int row = 1; row <= 7; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }    
}