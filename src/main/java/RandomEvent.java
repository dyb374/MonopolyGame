import java.util.HashMap;

/**
 * @author Andrew Dong
 * @date 2019/1/1 23:07
 */
public class RandomEvent {
    private String info;//随机事件的描述

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void doRandomEvent(HashMap<Integer, Player> players, Integer playerId){}
}
