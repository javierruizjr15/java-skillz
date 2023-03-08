package primitiveDataDefiniteLoops;

public class PrintDesign15 {
    public static void main(String[] args) {
        
        int lines = 5;
        int dashes = lines -1;
        int nums = 1;
        int currentNum = 1;

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j <= dashes; j++) {
                System.out.print("-");
            }
            
            for (int j = 0; j < nums; j++) {
                System.out.print(currentNum);
            }
            
            for (int j = 0; j <= dashes; j++) {
                System.out.print("-");
            }

            currentNum += 2;
            nums += 2;
            dashes--;

            System.out.println();
            
        }
    }
}