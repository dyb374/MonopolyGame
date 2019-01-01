/**
 *
 * @author Andrew Dong
 * @date 2018/12/19 10:37
 */
public class Cup {

    private Dice dice1 = new Dice();
    private Dice dice2 = new Dice();

    public void roll(){
        dice1.roll();
        dice2.roll();
    }

    public Integer getTotal(){
        return dice1.getFaceValue() + dice2.getFaceValue();
    }
}
