/**
 * @author Andrew Dong
 * @date 2018/12/7 0:38
 */
public class StartSquare extends Square {
    private double bonus;

    @Override
    public String getInfo() {
        return "起点";
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
