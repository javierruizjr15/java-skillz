package primitiveDataDefiniteLoops;

public class RotatingIncreasingList10 {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            System.out.print("         |");
        }
        System.out.println();

        for (int j = 1; j <= 6; j++) {
            for (int i = 1; i <= 9; i++) {
                System.out.print(i);
            }
            System.out.print("0");
        }
    }
}