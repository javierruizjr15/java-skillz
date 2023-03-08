public class Lanterns {
    public static void main(String[] args) {
        topLantern();
        System.out.println();
        topLantern();
        lineLantern();
        starLine3();
        topLantern();
        System.out.println();
        topLantern();
        starLine1();
        lineLantern();
        lineLantern();
        starLine1();
        starLine1();
    }

    public static void topLantern() {
        starLine1();
        starLine2();
        starLine3();
    }   

    public static void starLine1() {
        System.out.println("    *****    ");
    }

    public static void starLine2() {
        System.out.println("  *********  ");
    }

    public static void starLine3() {
        System.out.println("*************");
    }

    public static void lineLantern() {
        System.out.println("* | | | | | *");
    }
}