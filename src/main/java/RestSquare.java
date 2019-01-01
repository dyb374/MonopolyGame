/**
 * @author Andrew Dong
 * @date 2018/12/7 0:37
 */
public class RestSquare extends Square {
    private int restRoundTime;

    @Override
    public String getInfo() {
        return "休息区";
    }

    public int getRestRoundTime() {
        return restRoundTime;
    }

    public void setRestRoundTime(int restRoundTime) {
        this.restRoundTime = restRoundTime;
    }
}
