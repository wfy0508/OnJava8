package chapter6;

/**
 * @author summer
 * @project_name IntelliJ IDEA
 * @create_time 2022-10-05 21:24:24
 * @description
 */
public class ValArgsNew {
    public static void main(String[] args) {
        printArray(47, (float) 3, 3.14, 11, 12);
        printArray(1, 2, 3, 4, 4, 5, 6);
        printArray(new A(), new A(), new A());
    }

    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
