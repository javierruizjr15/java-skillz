package primitiveDataDefiniteLoops;

public class SlashFigure217 {
    public static void main(String[] args) {
        
        int height = 4;
        int length = 14;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\\\\");
            }
            for (int j = 0; j < length - 4 * i; j++) {
                System.out.print("!");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("//");
            }
            System.out.println();
        }

        int height2 = 8;
        int length2 = 30;

        for (int i = 0; i < height2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\\\\");
            }
            for (int j = 0; j < length2 - 4 * i; j++) {
                System.out.print("!");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("//");
            }
            System.out.println();
        }
        
    }
}