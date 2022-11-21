package chapter9;

/**
 * @author summer
 * @project_name OnJava8
 * @create_time 2022/11/21 15:11
 * @description
 */
public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println(sup.field);
        System.out.println(sup.getField());

        Sub sub = new Sub();
        System.out.println(sub.field);
        System.out.println(sub.getField());
        System.out.println(sub.getSuperField());
    }
}


class Super{
    public int field = 0;
    public int getField(){
        return field;
    }
}


class Sub extends Super{

    public int field = 1;

    @Override
    public int getField() {
        return field;
    }
    public int getSuperField(){
        return super.field;
    }
}

