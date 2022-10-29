package chapter8;

/**
 * @author summer
 * @project_name IntelliJ IDEA
 * @create_time 2022-10-29 12:43:50
 * @description 继承时自动调用父类的构造器
 */
public class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        final Cartoon cartoon = new Cartoon();
    }

}

class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}



