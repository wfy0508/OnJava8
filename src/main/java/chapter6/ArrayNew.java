package chapter6;

import java.util.Arrays;
import java.util.Random;

/**
 * @author summer
 * @project_name IntelliJ IDEA
 * @create_time 2022-10-16 22:24:57
 * @description
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random random = new Random(47);
        // 初始化大小，并且数组中的值全部初始化为0
        a = new int[random.nextInt(20)];
        System.out.println("length of a is " + a.length);
        System.out.println(Arrays.toString(a));
        // 为数组中的每个元素赋值
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
    }
}
