package primitiveDataDefiniteLoops;

public class ModifiedNestedNumsLoops13 {
    
    public static void main(String[] args) {
        
        int lines = 5;
        int cols = 5;
        
        for (int line = 1; line <= lines; line++) {
            for (int row = 9; row >= 0; row--) {
                for (int col = 1; col <= cols; col++) {
                    System.out.print(row);
                }
            }
            System.out.println();
        }
    }
}