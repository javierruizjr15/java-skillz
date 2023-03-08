public class Egg {
    public static void main(String[] args) {
        eggMode();       
    }

private static void eggMode() {
    topEgg();
    eggMiddleLine();
    bottomEgg();
}

    public static void topEgg() {
        System.out.println("   --------   ");
        System.out.println("  /        \\ ");
        System.out.println(" /           \\");
    }

    public static void eggMiddleLine() {
        System.out.println(" -\"-'-\"-'-\"-");
    }

    public static void bottomEgg() {
        System.out.println(" \\           /");
        System.out.println("  \\        /");
        System.out.println("   --------");
    }
}