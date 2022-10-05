package chapter6;

/**
 * @author summer
 * @project_name IntelliJ IDEA
 * @create_time 2022-10-05 20:29:50
 * @description
 */
public class InitialValues {
    public static void main(String[] args) {
        returnInt();
        TestValues a = new TestValues();
        a.print();
    }

    static int returnInt() {
        // 方法内的字段不会自动初始化，需要在创建时初始化
        int i = 0;
        return i;
    }
}

class TestValues {
    /**
     * i: 类对象
     */
    int i;

    void print() {
        System.out.println(this.i);
    }
}

