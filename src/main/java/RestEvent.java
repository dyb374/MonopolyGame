import java.util.HashMap;

/**
 * @author Andrew Dong
 * @date 2019/1/1 23:15
 */
public class RestEvent extends RandomEvent {
    @Override
    public void doRandomEvent(HashMap<Integer, Player> players, Integer playerId) {
        Player player = players.get(playerId);
        player.setCurrentLocation(8);
        player.setRestTime(2);
    }
}
