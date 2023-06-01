package collegeday3;

class Nepalaya {

    public void diff() {
        System.out.println("Here is the diff func");
    }

    public int sum(int a, int b) {
        return a + b;

    }

}

class Bca extends Nepalaya {

    public void diff() {
        System.out.println("you are rojesh sir");
    }

    public static void main(String[] args) {
        Bca obj = new Bca();
        int sum = obj.sum(10, 20);
        obj.diff();
        System.out.println(sum);

    }

}
