package primitiveDataDefiniteLoops;

public class TrippyNest9 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 40; i++) {
            System.out.print("-");
        }

        System.out.println();
        for (int j = 1; j <= 10; j++) {
            System.out.print("_-^-");
        }
        
        System.out.println();
        for (int k = 1; k <= 2; k++) {
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 2; j++) {
                    System.out.print(i);
                }
            }
            System.out.print("00");
        }
        
        System.out.println();
        for (int i = 1; i <= 40; i++) {
            System.out.print("-");
        }
    }
}