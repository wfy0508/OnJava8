package chapter9;

/**
 * @author summer
 * @project_name OnJava8
 * @create_time 2022/11/20 17:49
 * @description
 */
public class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Circle.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Circle.erase()");
    }

    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        System.out.println(s.getClass().getName());
    }
}

