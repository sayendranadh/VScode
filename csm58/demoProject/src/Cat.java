class Cat extends Animal {
 
  String color;

  Cat(String n, String c) {
    super(n);
    color = c;
  }
  void meow() {
    System.out.println(name + " is meowing");
  }
}