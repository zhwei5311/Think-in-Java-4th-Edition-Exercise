//: polymorphism/oshape/Triangle.java
package polymorphism.oshape;
import polymorphism.shape.Shape;
import static net.mindview.util.Print.*;

public class Triangle extends Shape {
  @Override public void draw() { print("Triangle.draw()"); }
  @Override public void erase() {
    print("Triangle.erase()");
  }
} ///:~
