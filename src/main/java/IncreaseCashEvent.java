import java.util.HashMap;

/**
 * @author Andrew Dong
 * @date 2019/1/1 23:10
 */
public class IncreaseCashEvent extends RandomEvent {
    @Override
    public void doRandomEvent(HashMap<Integer, Player> players, Integer playerId) {
        Player player = players.get(playerId);
        player.increaseCash(2000);
    }
}
