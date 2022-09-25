package chapter4;

/**
 * @author summer
 * @project_name IntelliJ IDEA
 * @create_time 2022-09-25 18:34:09
 * @description
 */
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f;
        System.out.println("i1: " + Integer.toBinaryString(i1));

        int i2 = 0X2F;
        System.out.println("i2: " + Integer.toBinaryString(i2));
    }
}
