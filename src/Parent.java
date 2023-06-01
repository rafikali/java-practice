class Parent {

    void show() {
        System.out.println("Parent show");
    }

}

/**
 * Child
 */
class Child extends Parent {

    void show() {
        System.out.println("chlids show");
    }

}

/**
 * Main
 */
class Main {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.show();

        Child obj2 = new Child();
        obj2.show();

    }

}
