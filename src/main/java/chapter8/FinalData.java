package chapter8;

import java.util.Random;

/**
 * @author summer
 * @project_name IntelliJ IDEA
 * @create_time 2022-10-29 13:25:39
 * @description final用法
 */
public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    // 可以是编译时常量
    private final int valueOne = 9;
    private static final int VALUE_INFO = 99;
    // 典型的公共常量
    private static final int VALUE_THREE = 39;
    // 这些不能作为编译时常量
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(1);
    private final Value v2 = new Value(22);
    private final static Value VAL_3 = new Value(33);
    private final int[] a = {1, 2, 3, 4, 5, 6};

    @Override
    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 =" + INT_5;
    }

    public static void main(String[] args) {
        final FinalData fd1 = new FinalData("fd1");
        // valueOne值无法修改
        //fd1.valueOne++;

        // 对象引用不变，但其中的值可以变
        fd1.v2.i++;

        // 非final，可变
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;
        }

        System.out.println(fd1);
        System.out.println("Create New FinalData");
        final FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}


class Value {
    int i;

    Value(int i) {
        this.i = i;
    }
}
