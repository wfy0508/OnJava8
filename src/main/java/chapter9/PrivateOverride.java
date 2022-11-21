package chapter9;

/**
 * @author summer
 * @project_name OnJava8
 * @create_time 2022/11/21 15:20
 * @description
 */
public class PrivateOverride {
    private void f(){
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}


class Derived extends PrivateOverride{
    public void f(){
        System.out.println("public f()");
    }
}
