import java.util.Scanner;

//Connor Bug Testing Comments
//I would appreciate a little big more explanation about the input types (ii, id, di, dd)       fixed
//Exceptions need to be caught when asking for user input of integer and variable types - right now the code just breaks   fixed 
//You still need to design the test function    fixed
//But overall good job!

//Wendy Wang
//very good code the history is good and the caculations have no errors
// make sure that ints can't have doubles fixed

//Thomas Murphy: Calculations themselves are correct but program breaks if any strings are inputed and has no safety nets for incorrect data types.
//  Logical errors: typos fixed
public class Project {
    private static int c = 0;// keaps track of caculations
    private int t;// tests taken
    private int score;// points on test
    private int qNum;
    // addition{

    public static String add(int x, int y) {
        c++;
        return "" + x + " + " + y + " = " + (x + y);
    }

    public static String add(double x, int y) {
        c++;
        return "" + x + " + " + y + " = " + (x + y);
    }

    public static String add(double x, double y) {
        c++;
        return "" + x + " + " + y + " = " + (x + y);
    }

    public static String add(int x, double y) {
        c++;
        return "" + x + " + " + y + " = " + (x + y);
    }

    // }
    // subtraction{
    public static String sub(int x, int y) {
        c++;
        return "" + x + " - " + y + " = " + (x - y);
    }

    public static String sub(double x, int y) {
        c++;
        return "" + x + " - " + y + " = " + (x - y);
    }

    public static String sub(double x, double y) {
        c++;
        return "" + x + " - " + y + " = " + (x - y);
    }

    public static String sub(int x, double y) {
        c++;
        return "" + x + " - " + y + " = " + (x - y);
    }

    // }
    // multiplication{
    public static String mult(int x, int y) {
        c++;
        return "" + x + " * " + y + " = " + (x * y);
    }

    public static String mult(double x, int y) {
        c++;
        return "" + x + " * " + y + " = " + (x * y);
    }

    public static String mult(double x, double y) {
        c++;
        return "" + x + " * " + y + " = " + (x * y);
    }

    public static String mult(int x, double y) {
        c++;
        return "" + x + " * " + y + " = " + (x * y);
    }

    // }
    // division{
    public static String div(int x, int y) {
        if (y == 0) {
            return "Error: Division by zero is undefined.";
        } else {
            c++;
            return "" + x + " / " + y + " = " + (x / y);
        }
    }

    public static String div(double x, int y) {
        if (y == 0) {
            return "Error: Division by zero is undefined.";
        } else {
            c++;
            return "" + x + " / " + y + " = " + (x / y);
        }
    }

    public static String div(double x, double y) {
        if (y == 0) {
            return "Error: Division by zero is undefined.";
        } else {
            c++;
            return "" + x + " / " + y + " = " + (x / y);
        }
    }

    public static String div(int x, double y) {
        if (y == 0) {
            return "Error: Division by zero is undefined.";
        } else {
            c++;
            return "" + x + " / " + y + " = " + (x / y);
        }
    }

    // }
    public Project() {// sets test up
        t = 0;
        score = 0;
        qNum = 10;

    }

    public Project(int q) {// sets test up
        t = 0;
        score = 0;
        qNum = q;

    }

    public Project(int q, int te) {// sets test up
        t = te;
        score = 0;
        qNum = q;

    }

    public Project(int q, int te, int s) {// sets test up
        t = te;
        score = s;
        qNum = q;

    }

    // setter methods {
    public void setTestNum(int te) {
        this.t = te;
    }

    public void setScore(int s) {
        this.score = s;
    }

    public void setQnum(int q) {
        this.qNum = q;
    }

    // }
    // getter methods {
    public int getTestNum() {
        return this.t;
    }

    public int getScore() {
        return this.score;
    }

    public int getQnum() {
        return this.qNum;
    }

    // }
    public double getPer() {
        return ((double) this.score / this.qNum) * 100;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");// clear previous instance
        System.out.flush();
        Scanner in = new Scanner(System.in);
        boolean done = false;
        int s = 0;
        String don = "no";
        while (!done) {
            System.out.println(c + " Caculations done");
            System.out.println("Welcome to the Java calculator what opperation would you like\n test or calc ");
            // need to design test function fixed
            String mode = in.nextLine().toLowerCase().trim();
            if (mode.equals("calc")) {
                while (!done) {
                    System.out.println(c + " Caculations done");
                    System.out.println("input * + - or /");
                    String op = in.nextLine();
                    if (op.equals("*") || op.equals("-") || op.equals("/") || op.equals("+")) {
                        System.out.println("input Number type i is int d is double ii dd di id");
                        // a little bit of explanation could be good here
                        String type = in.nextLine().toLowerCase().trim();
                        if (type.equals("ii")) {
                            System.out.println("input num 1");
                            while (!in.hasNextInt()) {
                                System.out.println("That's not a int! Please try again.");
                                in.next();// consumes input
                            }
                            int x = in.nextInt(); // need to catch exception of other variable types
                            System.out.println("input num 2");
                            while (!in.hasNextInt()) {
                                System.out.println("That's not a int! Please try again.");
                                in.next();
                            }
                            int y = in.nextInt(); // need to catch exception of other variable types
                            if (op.equals("+")) {
                                System.out.println(add(x, y));
                            } else if (op.equals("-")) {
                                System.out.println(sub(x, y));
                            } else if (op.equals("*")) {
                                System.out.println(mult(x, y));
                            } else if (op.equals("/")) {
                                System.out.println(div(x, y));
                            }
                        } else if (type.equals("dd")) {
                            System.out.println("input num 1");
                            while (!in.hasNextDouble()) {
                                System.out.println("That's not a double! Please try again.");
                                in.next();
                            }
                            double x = in.nextDouble(); // need to catch exception of other variable types
                            System.out.println("input num 2");
                            while (!in.hasNextDouble()) {
                                System.out.println("That's not a double! Please try again.");
                                in.next();
                            }
                            double y = in.nextDouble(); // need to catch exception of other variable types
                            if (op.equals("+")) {
                                System.out.println(add(x, y));
                            } else if (op.equals("-")) {
                                System.out.println(sub(x, y));
                            } else if (op.equals("*")) {
                                System.out.println(mult(x, y));
                            } else if (op.equals("/")) {
                                System.out.println(div(x, y));
                            }
                        } else if (type.equals("di")) {
                            System.out.println("input num 1");
                            while (!in.hasNextDouble()) {
                                System.out.println("That's not a double! Please try again.");
                                in.next();
                            }
                            double x = in.nextDouble(); // need to catch exception of other variable types
                            System.out.println("input num 2");
                            while (!in.hasNextInt()) {
                                System.out.println("That's not a int! Please try again.");
                                in.next();
                            }
                            int y = in.nextInt(); // need to catch exception of other variable types
                            if (op.equals("+")) {
                                System.out.println(add(x, y));
                            } else if (op.equals("-")) {
                                System.out.println(sub(x, y));
                            } else if (op.equals("*")) {
                                System.out.println(mult(x, y));
                            } else if (op.equals("/")) {
                                System.out.println(div(x, y));
                            }
                        } else if (type.equals("id")) {
                            System.out.println("input num 1");
                            while (!in.hasNextInt()) {
                                System.out.println("That's not a int! Please try again.");
                                in.next();
                            }
                            int x = in.nextInt(); // need to catch exception of other variable types
                            System.out.println("input num 2");
                            while (!in.hasNextDouble()) {
                                System.out.println("That's not a double! Please try again.");
                                in.next();
                            }
                            double y = in.nextDouble(); // need to catch exception of other variable types
                            if (op.equals("+")) {
                                System.out.println(add(x, y));
                            } else if (op.equals("-")) {
                                System.out.println(sub(x, y));
                            } else if (op.equals("*")) {
                                System.out.println(mult(x, y));
                            } else if (op.equals("/")) {
                                System.out.println(div(x, y));
                            }
                        } else {
                            System.out.println("invalid type");
                            continue;
                        }
                    } else {
                        System.out.println("invalid opperation");
                        continue;
                    }
                    in.nextLine();
                    System.out.println("are you done if so input done");
                    don = in.nextLine().toLowerCase().trim();
                    if (don.equals("done")) {
                        done = true;
                    }

                }
            } else if (mode.equals("test")) {
                System.out.println("How manny questions would you like");
                while (!in.hasNextInt()) {
                    System.out.println("That's not a int! Please try again.");
                    in.next();
                }
                s = 0;
                int u = in.nextInt();
                Project r = new Project(u);
                int pType;
                long time = System.currentTimeMillis();// needs to be long
                for (int i = 0; i < r.getQnum(); i++) {
                    pType = (int) (Math.random() * 4) + 1;
                    if (pType == 1) {
                        int a = (int) (Math.random() * 100) + 1;
                        int b = (int) (Math.random() * 100) + 1;
                        System.out.println("What is " + a + " + " + b);

                        while (!in.hasNextInt()) {
                            System.out.println("That's not a int! Please try again.");
                            in.next();
                        }
                        int ans = in.nextInt();
                        if (ans == a + b) {
                            s++;
                            r.setScore(s);
                            System.out.println("Correct");
                        } else {
                            System.out.println("Incorrect the answer is " + (a + b));
                        }
                    } else if (pType == 2) {
                        int a = (int) (Math.random() * 100) + 1;
                        int b = (int) (Math.random() * 100) + 1;
                        System.out.println("What is " + a + " - " + b);

                        while (!in.hasNextInt()) {
                            System.out.println("That's not a int! Please try again.");
                            in.next();
                        }
                        int ans = in.nextInt();
                        if (ans == a - b) {
                            s++;
                            r.setScore(s);
                            System.out.println("Correct");
                        } else {
                            System.out.println("Incorrect the answer is " + (a - b));
                        }
                    } else if (pType == 3) {
                        int a = (int) (Math.random() * 100) + 1;
                        int b = (int) (Math.random() * 100) + 1;
                        System.out.println("What is " + a + " * " + b);

                        while (!in.hasNextInt()) {
                            System.out.println("That's not a int! Please try again.");
                            in.next();
                        }
                        int ans = in.nextInt();
                        if (ans == a * b) {
                            s++;
                            r.setScore(s);
                            System.out.println("Correct");
                        } else {
                            System.out.println("Incorrect the answer is " + (a * b));
                        }
                    } else {
                        int a = (int) (Math.random() * 100) + 1;
                        int b = (int) (Math.random() * 100) + 1;
                        System.out.println("What is " + a + " / " + b + " Round to the nearest hundredth ");

                        while (!in.hasNextDouble()) {
                            System.out.println("That's not a double! Please try again.");
                            in.next();
                        }
                        double ans = in.nextDouble();
                        if (ans == Math.round(((double) a / b) * 100.0) / 100.0) {
                            s++;
                            r.setScore(s);
                            System.out.println("Correct");
                        } else {
                            System.out
                                    .println("Incorrect the answer is " + Math.round(((double) a / b) * 100.0) / 100.0);
                        }
                    }

                }
                long time1 = System.currentTimeMillis();
                System.out.println("Time spent " + (time1 - time) / 1000 + " seconds");
                System.out.println("Test score " + r.getScore() + " / " + r.getQnum());
                double d = r.getPer();
                System.out.println(Math.round(d * 100.0) / 100.0 + " %");
                if (d == 100) {
                    System.out.println("WOW perfect Score (ps you got a A+)");
                } else if (d >= 90) {
                    System.out.println("Awesome a A");
                } else if (d >= 80) {
                    System.out.println("Beautiful not bad a B");
                } else if (d >= 70) {
                    System.out.println("Cutting it close with a C");
                } else if (d >= 60) {
                    System.out.println("Dang near failing there with a D");
                } else if (d >= 0) {
                    System.out.println("Failing with a F at least you have this Wonderfull calculator to help you out");
                }
                in.nextLine();
                System.out.println("are you done if so input done");
                don = in.nextLine().toLowerCase().trim();
                if (don.equals("done")) {
                    done = true;
                }
            } else {
                System.out.println("Not a Mode");
                continue;
            }

        }
        in.close();// close scanner
    }

}