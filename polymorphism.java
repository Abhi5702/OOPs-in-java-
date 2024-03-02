
class Animal {
   
    void makeSound() {
      System.out.println("Animal makes a sound");
    }
  }
  
  
  class Dog extends Animal {
    
    void makeSound() {
      System.out.println("Dog barks");
    }
  }
  
  
  
  public class polymorphism {
    public static void main(String[] args) {
      
      Animal animal1 = new Animal();
      Animal dog = new Dog();
    
  
      
      animal1.makeSound();
      dog.makeSound();
    }
  }
  
