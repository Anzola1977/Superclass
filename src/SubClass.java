public class SubClass extends SuperClass{
    public SubClass(int a, int b) {
        super(a, b);
       this.b = b;
    }

    @Override
    public int add(int v) {
        return super.add(v) + b;
    }

    public static void main(String args[]) {
        SubClass s = new SubClass(10, 12);
        System.out.println(s.add(10));
    }
}
