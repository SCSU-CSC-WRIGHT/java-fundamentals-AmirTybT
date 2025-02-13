public class Lab1 {
  public static void main(String[] args) {
    // Exercise 1
    System.out.println("Hello World");

    // Exercise 2
    int x = 0;
    String message = "The number is: ";
    System.out.println(message + x);

    // Exercise 3
    int number = 15; 
        
    if (number % 2 == 0) {
        System.out.println("Even");
    } else {
        System.out.println("Odd");
    }

    // Exercise 4
    for (int i = 0; i < 5; i++) {
        System.out.println(i);
    }

    // Exercise 5
    System.out.println(greet("Alice"));

    // Exercise 6
    Person p = new Person("Bob");
    System.out.println(p.greet());
    
    // Exercise 7
    int[] numbers = {1, 2, 3, 4, 5};
    for (int num : numbers) {
        System.out.println(num);
    }
  }

  public static String greet(String name) {
    return "Hello, " + name + "!";
  }
}

class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String greet() {
    return "Hello, " + name + "!";
  }
}