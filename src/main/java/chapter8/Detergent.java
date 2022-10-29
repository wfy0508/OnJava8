package chapter8;

/**
 * @author summer
 * @project_name IntelliJ IDEA
 * @create_time 2022-10-29 12:27:42
 * @description 继承
 */
public class Detergent extends Cleanser{
    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam(){append(" foam()");}

    public static void main(String[] args) {
        final Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}


class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s = s + a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        final Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}