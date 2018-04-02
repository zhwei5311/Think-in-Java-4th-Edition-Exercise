//: polymorphism/oshape/Square.java
package polymorphism.oshape;
import polymorphism.shape.Shape;
import static net.mindview.util.Print.*;

public class Square extends Shape {
  @Override public void draw() { print("Square.draw()"); }
  @Override public void erase() { print("Square.erase()"); }
} ///:~
