package primitiveDataDefiniteLoops;

public class DollarFigure223 {
    public static void main(String[] args) {
        int ROWS = 11;
        
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (ROWS - i); j++) {
                System.out.print("$");
            }
            for (int j = 0; j < (ROWS - i) * 2; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (ROWS - i); j++) {
                System.out.print("$");
            }
            for (int j = 0; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}