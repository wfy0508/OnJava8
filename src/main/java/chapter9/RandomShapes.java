package chapter9;

import java.util.Random;

/**
 * @author summer
 * @project_name OnJava8
 * @create_time 2022/11/20 18:00
 * @description
 */

public class RandomShapes {
    private Random rand = new Random(47);

    public Shape get() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }

    public Shape[] array(int sz) {
        Shape[] shapes = new Shape[sz];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = get();
        }
        return shapes;
    }

    public static void main(String[] args) {
        RandomShapes randomShapes = new RandomShapes();
        for (Shape shape : randomShapes.array(9)) {
            shape.draw();
        }
    }
}
