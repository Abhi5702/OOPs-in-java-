public class abstract {
    
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // h.changeColor();
        // System.out.println(h.color);
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        // Animal an = new Animal(); -> So we canot create an object for parent class in abstracction 
        Mustang mu = new Mustang();
        //Animal -> Horse -> Mustang (Inheritance)
    }
}


 abstract class Animal {

    String color;

    Animal() {
        System.out.println("Animal Constructor is called...");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor is called...");
    }
    void changeColor() {
        color = "Red Brown";
    }
    void walk() {
        System.out.println("Walk on four legs");
    }
}

class Mustang extends Horse {
    
    Mustang() {
        System.out.println("Mustang constructor is called...");
    }
}

class Chicken extends Animal{
    void changeColor() {
        
    }
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}

