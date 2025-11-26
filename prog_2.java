 // Program to demonstrate basic operators in Java
 class OperatorDemo {
    public static void main(String[] args) {
        int a = 10, b = 5;
        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
 Program to Demonstrate Operators in Java
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));
        // Assignment Operators
        int c = 20;
        System.out.println("\nAssignment Operators:");
        c += 5; // same as c = c + 5
        System.out.println("c += 5 → " + c);
        c *= 2; // same as c = c * 2
        System.out.println("c *= 2 → " + c);
        // Unary Operators
        int num = 10;
        System.out.println("\nUnary Operators:");
        System.out.println("++num = " + (++num)); // pre-increment
        System.out.println("--num = " + (--num)); // pre-decrement
        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b = " + max);
    }
 }