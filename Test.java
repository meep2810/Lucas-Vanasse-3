import java.util.ArrayList;

public class Test {

    private int testNum;// tests taken
    private int score;// points on test
    private int qNum;
    

    public Test() {// sets test up
       this(10,0,0);

    }

    public Test(int q) {// sets test up
        this(q,0,0);

    }

    public Test(int q, int te) {// sets test up
        this(q, te, 0);
    }

    public Test(int q, int te, int s) {// sets test up
        testNum = te;
        score = s;
        qNum = q;

    }

    // setter methods {
    public void setTestNum(int te) {// set testNum
        this.testNum = te;
    }

    public void setScore(int s) {// set score
        this.score = s;
    }

    public void setQnum(int q) {// set Qnum
        this.qNum = q;
    }

    // }
    // getter methods {
    public int getTestNum() {//get testNum
        return this.testNum;
    }

    public int getScore() {//get score
        return this.score;
    }

    public int getQnum() {//get qNum
        return this.qNum;
    }

    // }
    public double getPer() {// get test percent corect
        return ((double) this.score / this.qNum) * 100;
    }
    // Precondition Array list length > 0
    public static double findAverage(ArrayList<Test> t){// get over all percent over multible tests
        double sum = 0;
        int c = 0;
        for (Test test : t) {
            sum += test.getPer();
            c++;
        }
        return sum/c;
    }
    // postcondition sum > 0
}
