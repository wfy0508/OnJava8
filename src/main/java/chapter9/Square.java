package chapter9;

import java.awt.image.SampleModel;

/**
 * @author summer
 * @project_name OnJava8
 * @create_time 2022/11/20 17:54
 * @description
 */
public class Square extends Shape {
    @Override
    public void draw(){
        System.out.println("Square.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Square.erase()");
    }
}
