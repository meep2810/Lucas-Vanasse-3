public class Cauculator {
    private static int count = 0;// keaps track of caculations on all cauculators so needs to be static becouse
                                 // it is part of the class not a particular object
    private double x;
    private double y;

    public Cauculator(double x, double y) {
        this.x = x;
        this.y = y;
        count = 0;
    }

    public String add() {// adds x and y
        count++;
        return "" + x + " + " + y + " = " + (x + y);
    }

    // precondition Cauculator object is declared
    public String sub() {// subtracts x and y
        count++;
        return "" + x + " - " + y + " = " + (x - y);
    }

    // postcondition return string
    public String mult() {// mutiplies x and y
        count++;
        return "" + x + " * " + y + " = " + (x * y);
    }

    public String div() {// divides x and y
        if (y == 0) {
            return "Error: Division by zero is undefined.";
        } else {
            count++;
            return "" + x + " / " + y + " = " + (x / y);
        }
    }

    public static int getCount() {// get count returns a static variable so needs to be static becouse it woild
                                  // have to be declared with a object otherwise
        return count;
    }

    public double getX() {// get x
        return x;
    }

    public double getY() {// get y
        return y;
    }

    public void setX(double x) {// set x
        this.x = x;
    }

    public void setY(double y) {// set y
        this.y = y;
    }

    public String toString() {// returns cauculator
        return "x = " + x + " y = " + y + " count = " + count;
    }

    public boolean isOpValid(String[] s, String op) {
        boolean valid = false;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(op)) {
                valid = true;
            }
        }
        return valid;
    }

    public double getPer(Test t) {// get test percent corect
        if (t.getQnum() > 0) {
            return ((double) t.getScore() / t.getQnum()) * 100;
        }
        return 0.0;
    }

    // Precondition Array length > 0
    public static double findAverage(Test[] t, Cauculator ca) {// get over all percent over last 10 tests
        double sum = 0;
        int c = 0;
        for (Test test : t) {
            if (test != null) {
                sum += ca.getPer(test);
                c++;
            }

        }
        return sum / c;
    }
    // postcondition sum > 0
}
