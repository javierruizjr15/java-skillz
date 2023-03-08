package primitiveDataDefiniteLoops;

public class NestedNumsLoops12 {
    public static void main(String[] args) {
        for (int line = 1; line <= 3; line++) {
            for (int row = 0; row <= 9; row++) {
                for (int col = 1; col <= 3; col++) {
                    System.out.print(row);
                }
            }
            System.out.println();
        }
    }
}  