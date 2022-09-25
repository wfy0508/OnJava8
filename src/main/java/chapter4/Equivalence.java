package chapter4;

/**
 * @author summer
 * @project_name IntelliJ IDEA
 * @create_time 2022-09-25 17:43:07
 * @description
 */
public class Equivalence {
    static void show(String desc, Integer n1, Integer n2) {
        System.out.println(desc + ":");
        System.out.printf("%d==%d %b %b%n", n1, n2, n1 == n2, n1.equals(n2));
    }

    public static void test(int value) {
        Integer i1 = value;
        Integer i2 = value;
        show("Automatic", i1, i2);

        final Integer r1 = new Integer(value);
        final Integer r2 = new Integer(value);
        show("New Integer", r1, r2);

        final Integer v1 = Integer.valueOf(value);
        final Integer v2 = Integer.valueOf(value);
        show("Integer.valueOf", v1, v2);

        int x = value;
        int y = value;
        System.out.println("Primitive int");
        System.out.printf("%d==%d %b%n", x, y, x == y);

    }

    public static void main(String[] args) {
        test(127);
        test(128);
        test(-128);
    }
}
