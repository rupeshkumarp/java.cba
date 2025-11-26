//Variables, Constants, and Data Types
class VariableDemo {
    public static void main(String[] args) {
        int age = 25;               // integer variable
        double salary = 55000.75;   // double variable
        char grade = 'A';           // character variable
        boolean isStudent = false;  // boolean variable
 Java Programs Demonstrating Variables, Constants, and
 Data Types
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);
    }
 }
 class ConstantDemo {
    public static void main(String[] args) {
        final double PI = 3.14159;  // constant
        int radius = 5;
        double area = PI * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area);
    }
 }
 class TypeCastingDemo {
    public static void main(String[] args) {
        int num = 10;
        double d = num;   // implicit casting (int to double)
        System.out.println("Implicit Casting: " + d);
        double value = 9.78;
        int val = (int) value;  // explicit casting (double to int)
        System.out.println("Explicit Casting: " + val);
    }
 }
 class ScopeDemo {
    int instanceVar = 50;          // instance variable
    static int staticVar = 100;    // static variable
    public void display() {
        int localVar = 20;         // local variable
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
    public static void main(String[] args) {
        ScopeDemo obj = new ScopeDemo();
        obj.display();
    }
 }
 class DefaultValuesDemo {
    int intVar;          // default 0
    double doubleVar;    // default 0.0
    char charVar;        // default '\u0000'
    boolean boolVar;     // default false
    String strVar;       // default null
    public void show() {
        System.out.println("int: " + intVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
        System.out.println("String: " + strVar);
    }
    public static void main(String[] args) {
        DefaultValuesDemo obj = new DefaultValuesDemo();
        obj.show();
    }
 }