public class HierarchicalInheritance {

  public static void main(String[] args) {
  
    Dog d = new Dog("Bruno", "Labrador");
    Cat c = new Cat("Snowy", "White");

    System.out.println("Dog's name: " + d.name);
    System.out.println("Dog's breed: " + d.breed);
    System.out.println("Cat's name: " + c.name);
    System.out.println("Cat's color: " + c.color);

   
    d.eat(); 
    d.bark(); 
    c.eat(); 
    c.meow(); 
  }
}
