package primitiveDataDefiniteLoops;

public class TwiceModifiedNestedNumsLoops14 {
    public static void main(String[] args) {
        
        int lines = 4;
        int cols = 9;
        
        for (int line = 1; line <= lines; line++) {
            for (int row = 9; row >= 1; row--) {
                for (int col = 1; col <= cols; col++) {
                    System.out.print(row);
                }
            }
            System.out.println();
        }
    }
}