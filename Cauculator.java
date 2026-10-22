public class Cauculator {
    private static int count = 0;// keaps track of caculations on all cauculators so needs to be static
    private double x;
    private double y;

    public Cauculator(double x, double y) {
        this.x = x;
        this.y = y;
        count = 0;
    }

    public String add() {//adds x and y
        count++;
        return "" + x + " + " + y + " = " + (x + y);
    }
    //precondition Cauculator object is declared 
    public String sub() {//subtracts x and y
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

    public static int getCount() {// get count returns a static variable so needs to be static
        return count;
    }

    public double getX() {// get x
        return x;
    }

    public double getY() {// get y
        return y;
    }

    public void setX(double x){// set x
        this.x = x;
    }
    
    public void setY(double y) {// set y
        this.y = y;
    }

    public String toString(){// returns cauculator
        return "x = "+x+" y = "+y+" count = "+count;
    }

}