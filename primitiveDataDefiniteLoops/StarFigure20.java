package primitiveDataDefiniteLoops;

public class StarFigure20 {
    public static void main(String[] args) {
        
        int count = 0;
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("////");
            }
            for (int k = 1; k <= count; k++) {
                System.out.print("**");
            }
            count += 4;
            for (int j = 5; j >= i; j--) {
                System.out.print("\\\\\\\\");
            }
            System.out.println();
        }
    }
}