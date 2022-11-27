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

class SingleInheritance {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.sound();
        Dog dog = new Dog();
        dog.sound();
    }
}
