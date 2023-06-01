class Animal {
    void eat() {
        System.out.println("eating");
    }

}

class Dog extends Animal {
    void bark() {
        System.out.println("barking");
    }

}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeeping");
    }
}

class TestInheritance extends BabyDog {
    public static void main(String args[]) {
        // BabyDog = new Babydog();
        TestInheritance d = new TestInheritance();
        d.weep();
        d.bark();
        d.eat();

    }
}
