// Superclass
class A {
    int i;
    int j;

    // Method to display i and j
    void showij() {
        System.out.println("Value of i: " + i);
        System.out.println("Value of j: " + j);
    }
}

// Subclass
class B extends A {
    int k;

    // Method to display k
    void showk() {
        System.out.println("Value of k: " + k);
    }

    // Method to calculate and display sum of i, j, and k
    void sum() {
        int sum = i + j + k;
        System.out.println("Sum of i, j and k: " + sum);
    }
}

// Main class
public class SimpleInheritance {
    public static void main(String[] args) {

        // Create object of superclass
        A superOb = new A();

        // Assign values to i and j
        superOb.i = 10;
        superOb.j = 20;

        // Display values of i and j
        System.out.println("Contents of superOb:");
        superOb.showij();

        System.out.println();

        // Create object of subclass
        B subOb = new B();

        // Assign values to inherited variables i and j
        subOb.i = 30;
        subOb.j = 40;

        // Assign value to subclass variable k
        subOb.k = 50;

        // Display inherited variables
        System.out.println("Contents of subOb:");
        subOb.showij();

        // Display subclass variable
        subOb.showk();

        // Display sum of i, j and k
        subOb.sum();
    }
}
