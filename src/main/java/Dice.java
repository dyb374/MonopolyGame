import java.util.Random;

/**
 * @author Andrew Dong
 * @date 2018/12/6 16:22
 */
public class Dice {
    private int faceValue;

    public int getFaceValue() {
        return faceValue;
    }

    /**
     * 掷骰子
     */
    public void roll(){
        Random random = new Random();
        this.faceValue = random.nextInt(6) + 1;
        System.out.println("点数为:" + this.faceValue);
    }
}
