public class SuperClass {
    public int a;
    public int b;

    public SuperClass(int a, int b) {
        this.a = 15;
        this.b = 35;
    }

    public int add(int v) {
        this.a += v;
        return a;
    }
}
