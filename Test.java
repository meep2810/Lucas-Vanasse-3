public class Test {

    private int testNum;// tests taken
    private int score;// points on test
    private int qNum;

    public Test() {// sets test up
        testNum = 0;
        score = 0;
        qNum = 10;

    }

    public Test(int q) {// sets test up
        testNum = 0;
        score = 0;
        qNum = q;

    }

    public Test(int q, int te) {// sets test up
        testNum = te;
        score = 0;
        qNum = q;

    }

    public Test(int q, int te, int s) {// sets test up
        testNum = te;
        score = s;
        qNum = q;

    }

    // setter methods {
    public void setTestNum(int te) {
        this.testNum = te;
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
        return this.testNum;
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

}
