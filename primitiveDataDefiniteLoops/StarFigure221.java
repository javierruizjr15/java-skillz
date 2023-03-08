package primitiveDataDefiniteLoops;

public class StarFigure221 {
    public static void main(String[] args) {
        
        int count = 0;
        int height = 3;
        
        for (int i = 1; i <= height; i++) {
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