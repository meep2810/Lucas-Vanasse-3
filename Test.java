
public class Test {

    private static int testNum;// tests taken
    private int score;// points on test
    private int qNum;

    public Test() {// sets test up
        this(10, 0);

    }

    public Test(int q) {// sets test up
        this(q, 0);

    }

    public Test(int q, int s) {// sets test up
        testNum++;
        score = s;
        qNum = q;

    }

    // setter methods {
    public static void setTestNum(int te) {// set testNum
        testNum = te;
    }

    public void setScore(int s) {// set score
        this.score = s;
    }

    public void setQnum(int q) {// set Qnum
        this.qNum = q;
    }

    // }
    // getter methods {
    public static int getTestNum() {// get testNum
        if (testNum >= 10) {
            testNum = 0;
        }
        return testNum;
    }

    public int getScore() {// get score
        return this.score;
    }

    public int getQnum() {// get qNum
        return this.qNum;
    }

    // }

}