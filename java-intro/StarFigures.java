public class StarFigures {
    public static void main(String[] args) {
        starEqualsX();
        System.out.println();
        starEqualsX();
        starEquals();
        System.out.println();
        starLine();
        starEqualsX();
    }

    public static void starEqualsX() {
        starEquals();
        starX();
    }

    public static void starEquals() {
        System.out.println("*****");
        System.out.println("*****");
    }

    public static void starX() {
        System.out.println(" * * ");
        System.out.println("  *  ");
        System.out.println(" * * ");
    }

    public static void starLine() {
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
    }
}