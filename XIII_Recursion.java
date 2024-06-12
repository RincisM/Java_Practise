// Recursion - Calling by itself
// Used with advanced sorting algorithms and navigating trees
// Disadvantages - Sometimes slower and uses more memory

public class XIII_Recursion {
    public static void main(String[] args) {
        System.out.println("Iterative");
        // Iterative Method;
        walk(5);

        System.out.println("Recursive");
        // Recurse Method;
        walking(5);
        System.out.println(factorial(7));
        System.out.println(power(2, 0));
    }

    public static void walk(int steps) {
        for(int i = 0; i < steps; i++) {
            System.out.println("You take a step");
        }
    }

    public static void walking(int steps) {
        if(steps < 1)  return;
        System.out.println("You take a step!");
        walking(steps - 1);
    }

    public static int factorial(int num) {
        if(num < 1) return 1;
        return num * factorial(num-1);
    }

    public static int power(int num, int exponent) {
        if(exponent<=0) return 1;
        return num * power(num, exponent-1);
    }
}
