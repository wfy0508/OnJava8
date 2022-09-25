package chapter4;

/**
 * @author summer
 * @project_name IntelliJ IDEA
 * @create_time 2022-09-25 17:57:20
 * @description
 */
public class EqualsMethod {
    public static void main(String[] args) {
        ValA va1 = new ValA();
        ValA va2 = new ValA();

        va1.i = va2.i = 100;
        System.out.println(va1.equals(va2));

        ValB vb1 = new ValB();
        ValB vb2 = new ValB();
        vb1.i = vb2.i = 100;
        System.out.println(vb1.equals(vb2));
    }
}

class ValA {
    // 默认equals比较的不是对象的内容
    int i;
}

class ValB {
    int i;

    public boolean equals(Object o) {
        ValB rval = (ValB) o;
        return i == rval.i;
    }
}