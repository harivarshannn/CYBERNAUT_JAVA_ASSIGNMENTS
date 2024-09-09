interface A {
    void displayA();
}

interface B {
    void displayB();
}

class C implements A, B {
    public void displayA() {
        System.out.println("Class A.");
    }

    public void displayB() {
        System.out.println("Class B.");
    }

    public void displayC() {
        System.out.println("Class C.");
    }
}

public class multi_inheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.displayA();
        obj.displayB();
        obj.displayC();
    }
}
