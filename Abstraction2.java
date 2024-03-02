
abstract class Shape {
   
    abstract void draw();
  }
  
 
  class Circle extends Shape {

    void draw() {
      System.out.println("Drawing a circle");
    }
  }
  
  
  class Square extends Shape {
    
    void draw() {
      System.out.println("Drawing a square");
    }
  }
  
  public class Abstraction2 {
    public static void main(String[] args) {
   
      Circle circle = new Circle();
      Square square = new Square();
  
  
      circle.draw();
      square.draw();
    }
  }
  
