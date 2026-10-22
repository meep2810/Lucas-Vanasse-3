import java.util.ArrayList;
import java.util.Scanner;

//Connor Bug Testing Comments
//I would appreciate a little bit more explanation about the input types (ii, id, di, dd) fixed
//Exceptions need to be caught when asking for user input of integer and variable types - right now the code just breaks fixed
//You still need to design the test function fixed
//But overall good job!

//Wendy Wang
//very good code the history is good and the caculations have no errors
// make sure that ints can't have doubles fixed

//Thomas Murphy: Calculations themselves are correct but program breaks if any strings are inputed and has no safety nets for incorrect data types.
// Logical errors: typos fixed
public class Project {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");// clear previous instance
        System.out.flush();
        Scanner in = new Scanner(System.in);
        Test[] tests = new Test[10];
        Cauculator cauculator = new Cauculator(0, 0);
        boolean done = false;
        int score = 0;
        String don = "no";
        String[] validOps = { "+", "-", "*", "/" };
        while (!done) {
            System.out.println(Cauculator.getCount() + " Caculations done");
            System.out.println("Welcome to the Java calculator what opperation would you like\ntest or calc");
            String mode = in.nextLine().toLowerCase().trim();
            if (mode.equals("calc")) {
                while (!done) {
                    System.out.println(Cauculator.getCount() + " Caculations done");
                    System.out.println("input * + - / or done if done");
                    String op = in.nextLine().toLowerCase().trim();
                    if (cauculator.isOpValid(validOps, op)) {
                        System.out.println("input num 1");
                        while (!in.hasNextDouble()) {
                            System.out.println("That's not a Number! Please try again.");
                            in.next();
                        }
                        cauculator.setX(in.nextDouble());

                        System.out.println("input num 2");
                        while (!in.hasNextDouble()) {
                            System.out.println("That's not a Number! Please try again.");
                            in.next();
                        }
                        cauculator.setY(in.nextDouble());

                        if (op.equals("+")) {
                            System.out.println(cauculator.add());
                        } else if (op.equals("-")) {
                            System.out.println(cauculator.sub());
                        } else if (op.equals("*")) {
                            System.out.println(cauculator.mult());
                        } else if (op.equals("/")) {
                            System.out.println(cauculator.div());
                        }
                    } else if (op.equals("done")) {
                        break;
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
                score = 0;
                int numOfQ = in.nextInt();
                Test test = new Test(numOfQ);
                tests[Test.getTestNum()] = test;
                int pType;
                long time = System.currentTimeMillis();// needs to be long
                for (int i = 0; i < test.getQnum(); i++) {
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
                            score++;
                            test.setScore(score);
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
                            score++;
                            test.setScore(score);
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
                            score++;
                            test.setScore(score);
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
                            score++;
                            test.setScore(score);
                            System.out.println("Correct");
                        } else {
                            System.out
                                    .println("Incorrect the answer is " + Math.round(((double) a / b) * 100.0) / 100.0);
                        }
                    }

                }
                long time1 = System.currentTimeMillis();
                System.out.println("Time spent " + (time1 - time) / 1000 + " seconds");
                System.out.println("Test score " + test.getScore() + " / " + test.getQnum());
                double per = cauculator.getPer(test);
                double aPer = Cauculator.findAverage(tests, cauculator);
                System.out.println(Math.round(per * 100.0) / 100.0 + " %");
                if (per == 100) {
                    System.out.println("WOW perfect Score (ps you got a A+)");
                } else if (per >= 90) {
                    System.out.println("Awesome a A");
                } else if (per >= 80) {
                    System.out.println("Beautiful not bad a B");
                } else if (per >= 70) {
                    System.out.println("Cutting it close with a C");
                } else if (per >= 60) {
                    System.out.println("Dang near failing there with a D");
                } else if (per >= 0) {
                    System.out.println("Failing with a F at least you have this Wonderfull calculator to help you out");
                }
                System.out.println(
                        "Average of last 10 test scores are " + Math.round(aPer * 100) / 100 + "%");
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