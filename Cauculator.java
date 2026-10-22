public class Cauculator {
    private static int count = 0;// keaps track of caculations
    private double x;
    private double y;

    public Cauculator(double x, double y) {
        this.x = x;
        this.y = y;
        count = 0;
    }

    public String add() {
        count++;
        return "" + x + " + " + y + " = " + (x + y);
    }

    public String sub() {
        count++;
        return "" + x + " - " + y + " = " + (x - y);
    }

    public String mult() {
        count++;
        return "" + x + " * " + y + " = " + (x * y);
    }

    public String div() {
        if (y == 0) {
            return "Error: Division by zero is undefined.";
        } else {
            count++;
            return "" + x + " / " + y + " = " + (x / y);
        }
    }

    public static int getCount() {
        return count;
    }

    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }

}