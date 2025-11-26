 // Program to demonstrate how operator precedence and parentheses affect expression 
class ExpressionDemo {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;
        // Expression without parentheses
 Program to Demonstrate Operator Precedence and
 Expression Evaluation in Java
        int result1 = a + b * c;  // Multiplication (*) has higher precedence than a
        // Expression with parentheses
        int result2 = (a + b) * c; // Parentheses change the order of evaluation
        // Expression mixing multiple operators
        int result3 = a + b * c - 4 / 2; // * and / are evaluated before + and 
        System.out.println("Expression: a + b * c");
        System.out.println("Result (a + b * c) = " + result1);
        System.out.println("\nExpression: (a + b) * c");
        System.out.println("Result ((a + b) * c) = " + result2);
        System.out.println("\nExpression: a + b * c - 4 / 2");
        System.out.println("Result (a + b * c - 4 / 2) = " + result3);
        // Example with mixed data types (implicit type conversion)
        double result4 = a + b / (double)c; // b/c evaluated first, then added to a
        System.out.println("\nExpression: a + b / (double)c");
        System.out.println("Result (a + b / (double)c) = " + result4);
    }
 }