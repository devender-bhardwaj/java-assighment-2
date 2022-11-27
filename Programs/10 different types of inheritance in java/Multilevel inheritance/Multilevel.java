class Animal {
    Animal() {
        System.out.println("this is Animal class");
    }
    void sound() {
        System.out.println("...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bhau Bhau");
    }
}
class StreetDog extends Animal {
    void home() {
        System.out.println("I am homeless");
    }
}
class Multilevel {
    public static void main(String[] args) {
        StreetDog dog = new StreetDog() ;
        dog.sound();
        dog.home();
    }
}
