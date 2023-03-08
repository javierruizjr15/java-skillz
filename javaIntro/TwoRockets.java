public class TwoRockets {
    public static void main(String[] args) {
        doubleRockets();
    }

    public static void doubleRockets() {
        doubleTips();
        doubleBox();
        doubleBoxUS();
        doubleBox();
        doubleTips();
    }

    public static void doubleTips() {
        System.out.println("   /\\       /\\   ");
        System.out.println("  /  \\     /  \\  ");
        System.out.println(" /    \\   /    \\ ");
    }

    public static void doubleBox() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }

    public static void doubleBoxUS() {
        System.out.println("+------+ +------+");
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
        System.out.println("+------+ +------+"); 
    }
}