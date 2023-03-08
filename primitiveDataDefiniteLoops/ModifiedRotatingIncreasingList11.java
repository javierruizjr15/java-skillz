
package primitiveDataDefiniteLoops;

public class ModifiedRotatingIncreasingList11 {
    public static void main(String[] args) {
        //modified code with easily changed constants
        int reps = 10;
        int nums = 4;

        for (int i = 1; i <= reps; i++) {
            for (int j = 1; j <= nums; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for (int i = 1; i <= reps; i++) {
            for (int j =1; j <= nums; j++) {
                System.out.print(j);
            }
            System.out.print("0");
        }
        
        int reps2 = 7;
        int nums2 = 7;
        
        System.out.println();
        for (int i = 1; i <= reps2; i++) {
            for (int j = 1; j <= nums2; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for (int i = 1; i <= reps2; i++) {
            for (int j =1; j <= nums2; j++) {
                System.out.print(j);
            }
            System.out.print("0");
        }
    }
}