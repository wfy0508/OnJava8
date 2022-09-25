package chapter4;

/**
 * @author summer
 * @project_name IntelliJ IDEA
 * @create_time 2022-09-25 18:43:43
 * @description
 */
public class URShift {
    public static void main(String[] args) {
        int i = -1;
        System.out.println("i: " + Integer.toBinaryString(i));
        i >>>= 10;
        System.out.println("i: " + Integer.toBinaryString(i));

        long l = -1;
        System.out.println("l: " + Long.toBinaryString(l));
        l >>>= 10;
        System.out.println("l: " + Long.toBinaryString(l));

        // 对short类型和byte类型进行移位，可能得到不正确额结果
        short s = -1;
        System.out.println("s: " + Integer.toBinaryString(s));
        s >>>= 10;
        System.out.println("s: " + Integer.toBinaryString(s));

        byte b = -1;
        System.out.println("b: " + Integer.toBinaryString(b));
        b >>>= 10;
        System.out.println("b: " + Integer.toBinaryString(b));

        b = -1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b >>> 10));

    }
}
