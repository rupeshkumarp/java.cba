// Program to demonstrate all looping constructs in Java: while, do–while, and for
 class LoopDemo {
    public static void main(String[] args) {
        // ------------------------------
        // 1. while loop demonstration
         // ------------------------------
        System.out.println("=== while loop demonstration ===");
        int i = 1;
        while (i <= 5) {
            System.out.println("while loop count: " + i);
            i++;
        }
        // ------------------------------
        // 2. do–while loop demonstration
        // ------------------------------
        System.out.println("\n=== do–while loop demonstration ===");
        int j = 1;
        do {
            System.out.println("do–while loop count: " + j);
            j++;
        } while (j <= 5);
        // do–while runs at least once even if condition is false
        System.out.println("\nExample: do–while executes once even when condition is");
        int k = 6;
        do {
            System.out.println("This line executes once even though k = " + k);
            k++;
        } while (k <= 5);
        // ------------------------------
        // 3. for loop demonstration
        // ------------------------------
        System.out.println("\n=== for loop demonstration ===");
        // Example 1: simple counting
        for (int a = 1; a <= 5; a++) {
            System.out.println("for loop count: " + a);
        }
        // Example 2: printing even numbers
        System.out.println("\nEven numbers from 1 to 10:");
        for (int num = 1; num <= 10; num++) {
            if (num % 2 == 0)
                System.out.print(num + " ");
        }
        // Example 3: reverse counting
        System.out.println("\n\nReverse counting from 5 to 1:");
        for (int n = 5; n >= 1; n--) {
            System.out.println(n);
        }
        // Example 4: nested for loop
        System.out.println("\nPattern printing using nested for loop:");
        for (int row = 1; row <= 3; row++) {
             for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}