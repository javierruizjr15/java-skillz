public class EggStop {
    public static void main(String[] args) {
        topEgg();
        bottomEgg();
        bottomEgg();
        plusLine1();
        System.out.println();
        topEgg();
        lineStop();
        bottomEgg();
        System.out.println();
        topEgg();
        plusLine2();
    }

    public static void topEgg() {
        System.out.println("   --------   ");
        System.out.println("  /        \\ ");
        System.out.println(" /          \\");
    }

    public static void plusLine1() {
        System.out.println("  +-------+");
    }

    public static void plusLine2() {
        System.out.println(" +----------+");
    }

    public static void lineStop() {
        System.out.println(" |  STOP    |");
    }

    public static void bottomEgg() {
        System.out.println(" \\          /");
        System.out.println("  \\        /");
        System.out.println("   --------");
    }
}