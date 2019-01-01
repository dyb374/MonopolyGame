import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Andrew Dong
 * @date 2018/12/6 16:23
 */
public class Player {
    private double cash;
    private Integer id;
    private int restTime = 0;
    private Character character;
    private int currentLocation = 0;


    public String playerInfo(){
        return "玩家id: " + this.id + "\n" + "玩家角色: " + this.getCharacter().getName() + "\n" + "玩家现金: " + this.getCash() + "\n";
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    public void decreaseRestTime() {
        this.restTime -= 1;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    /**
     * 买地皮
     * @param lands
     * @return
     */
    public boolean buyEstate(HashMap<Integer, Square> lands){
        Land land = (Land) lands.get(this.currentLocation);
        if (land.getOwnerId() == -1){
            if (land.getLandPrice() <= this.cash){
                land.setOwnerId(this.id);
                this.cash -= land.getLandPrice();
                return true;
            } else {
                System.out.println("现金不足");
                return false;
            }
        } else {
            System.out.println("该地皮已经被购买");
            return false;
        }
    }

    /**
     * 卖地皮
     * @param lands
     * @param index
     * @return
     */
    public boolean saleEstate(HashMap<Integer, Square> lands,Integer index){
        Land land = (Land) lands.get(index);
        if (land.getOwnerId() != this.id){
            System.out.println("该地皮不是你的");
            return false;
        } else {
            land.setOwnerId(0);
            this.cash += (land.getLandPrice() + land.getHotelPrice() * land.getHotelNum());
            return true;
        }
    }

    public double getCash() {
        return cash;
    }

    /**
     * 减少金额
     * @param money
     * @return
     */
    public boolean decreaseCash(double money){
        this.cash -= money;
        if (this.cash >= 0)
            return true;
        else {
            this.cash += money;
            return false;
        }
    }

    /**
     * 增加金额
     * @param money
     */
    public void increaseCash(double money){
        this.cash += money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
