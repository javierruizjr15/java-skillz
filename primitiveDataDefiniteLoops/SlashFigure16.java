package primitiveDataDefiniteLoops;

public class SlashFigure16 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\\\\");
            }
            for (int j = 0; j < 22 - 4 * i; j++) {
                System.out.print("!");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("//");
            }
            System.out.println();
        }
    }
}