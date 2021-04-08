class A {
    private int data = 40;

    private void out() {
        System.out.println("Hello");
    }
}

public class Private {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.data);
        a.out();
    }
}
