package chapter8;

/**
 * @author summer
 * @project_name IntelliJ IDEA
 * @create_time 2022-10-29 12:15:33
 * @description
 */
public class Bath {
    private String
            // 1 定义时初始化
            s1 = "Happy",
            s2 = "Happy",
            s3, s4;
    private Soap castile;
    private int i;
    private float toy;

    public Bath() {
        System.out.println("Inside Bath()");
        // 2 构造器中初始化
        s3 = "Joy";
        toy = 3.14f;
        castile = new Soap();
    }

    {
        // 3 实例初始化
        i = 47;
    }

    @Override
    public String toString() {
        // 4 使用时初始化
        if (s4 == null) {
            s4 = "Joy";
        }
        return "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "castile = " + castile;
    }


    public static void main(String[] args) {
        final Bath b = new Bath();
        System.out.println(b);
    }
}

class Soap {
    private String s;

    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}
