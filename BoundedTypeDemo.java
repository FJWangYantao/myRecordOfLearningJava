import java.awt.*;

public class BoundedTypeDemo {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(2,2);
        Circle circle = new Circle(2);

        System.out.println("Same area?" +
                equalArea(rectangle,circle));
    }

    //声明了受限的泛型方法，使得E只能为GeometricObject的实例类型
    public static <E extends GeometricObject> boolean equalArea(E object1,E object2){
        return object1.getArea() == object2.getArea();
    }
}
