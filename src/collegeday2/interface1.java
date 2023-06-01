package collegeday2;

interface printable {
    void print();
}

public class interface1 implements printable {

    @Override
    public void print() {
        System.out.println("hakfjldasfjlkdsjflkdsajflkajd");

    }

    public static void main(String args[]) {
        interface1 obj = new interface1();
        obj.print();

    }

}
