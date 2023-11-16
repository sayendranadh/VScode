/*class Circle extends Shape{  
void draw(){
    System.out.println("drawing circle");}  
} */

class Circle extends Shape {
  
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }
}
