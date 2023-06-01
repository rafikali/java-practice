class University {

    public String faculty() {
        return "BCA";

    }

}

/**
 * InnerUniversity
 */
class College extends University {

    public String exam() {
        return "Board Exam";

    }

}

class Schoool extends College {

    public static void main(String args[]) {
        Schoool s = new Schoool();
        {

            System.out.println(s.faculty());
            System.out.println(s.exam());

        }

    }
}