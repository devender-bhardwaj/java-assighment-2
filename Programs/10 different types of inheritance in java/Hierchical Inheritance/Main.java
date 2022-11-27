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
        System.out.println("Dog: Bhau Bhau");
    }
}
class Cow extends Animal {
    void sound() {
        System.out.println("Cow: maaain");
    }
}
class Multilevel {
    public static void main(String[] args) {
        Dog dog = new Dog() ;
        dog.sound();

        Cow cow = new Cow();
        cow.sound();
    }
}
