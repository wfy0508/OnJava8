package chapter9;

/**
 * @author summer
 * @project_name OnJava8
 * @create_time 2022/11/20 17:56
 * @description
 */
public class Triangle extends Shape {
    @Override
    public void draw(){
        System.out.println("Square.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Square.erase()");
    }
}