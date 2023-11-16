/* class Dog extends Animal {
  
  String breed;

  Dog(String n, String b) {
    super(n); 
    breed = b;
  }
  void bark() {
    System.out.println(name + " is barking");
  }
}
*/
class Dog extends Animal {
  // A method in the subclass that overrides the superclass method
  @Override
  public void makeSound() {
    System.out.println("Dog barks");
  }
}