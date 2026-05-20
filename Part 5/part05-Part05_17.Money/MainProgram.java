public class MainProgram {

    public static void main(String[] args) {

        Money a = new Money(10, 0);
        Money b = new Money(3, 50);
        Money c = new Money(5, 0);

        Money d = a.plus(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(d);

        System.out.println(a.lessThan(b));
        System.out.println(b.lessThan(c));

        Money e = a.minus(b);

        System.out.println(e);

        Money f = e.minus(a);

        System.out.println(f);
    }
}