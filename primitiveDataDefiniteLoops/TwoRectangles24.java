package primitiveDataDefiniteLoops;

public class TwoRectangles24 {
    public static final int WIDTH = 7;
    public static final int HEIGHT = 4;

    public static void main(String[] args) {
        // first rectangle
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // second rectangle
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH * 2; j++) {
                if (j < WIDTH) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}