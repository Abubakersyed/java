// Superclass A
class A {
    int i;
    int j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("Value of i: " + i);
        System.out.println("Value of j: " + j);
    }
}

// Subclass B
class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Overridden method (without @Override)
    void show() {
        super.show();
        System.out.println("Value of k: " + k);
    }
}

// Main class
class Override {
    public static void main(String[] args) {
        B subOb = new B(10, 20, 30);
        subOb.show();
    }
}