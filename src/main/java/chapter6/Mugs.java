package chapter6;

/**
 * @author summer
 * @project_name IntelliJ IDEA
 * @create_time 2022-10-05 21:02:10
 * @description 非静态实例初始化
 */
public class Mugs {

    Mug mug1;
    Mug mug2;

    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }

    Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int i) {
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");
    }
}

class Mug {
    Mug(int maker) {
        System.out.println("Mug(" + maker + ")");
    }
}