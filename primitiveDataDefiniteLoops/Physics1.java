package primitiveDataDefiniteLoops;

public class Physics1 {
    public static void main(String[] args) {
        // declare variables
        double S0;
        double V0;
        double a;
        double t;
        double S;

        S0 = 3;
        V0 = 2;
        t = 5;
        a = 4;

        // compute position S
        S = S0 + V0 * t + 0.5 * a * t * t ;

        System.out.println("S = " + S);
    }
}