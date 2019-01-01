/**
 * 地块
 * @author Andrew Dong
 * @date 2018/12/6 18:11
 */
public class Land extends Square{
    private Integer ownerId = -1;
    private double landPrice = 0;
    private double landRentPrice = 30000;
    private double hotelRentPrice = 200;
    private Integer hotelNum = 0;
    private double hotelPrice = 1000;

    @Override
    public String getInfo(){
        String owner = new String();
        if (this.ownerId == -1)
            owner = "无人";
        else
            owner = ownerId.toString();
        return "地皮: " + this.getName() + "\n" + "酒店数量: " + this.getHotelNum() + "\n" + "所有者id: " + owner + '\n';
    }

    public Integer getHotelNum() {
        return hotelNum;
    }

    public void setHotelNum(Integer hotelNum) {
        this.hotelNum = hotelNum;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public double getLandPrice() {
        return landPrice;
    }

    public void setLandPrice(double landPrice) {
        this.landPrice = landPrice;
    }

    /**
     * 过路费
     * @return
     */
    public double getRentPrice() {
        return landRentPrice + hotelNum * hotelRentPrice;
    }

    public void setLandRentPrice(double landRentPrice) {
        this.landRentPrice = landRentPrice;
    }

    /**
     * 建造酒店
     * @param num
     */
    public void buildHotel(Integer num){
        this.hotelNum += num;
    }

    public double getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(double hotelPrice) {
        this.hotelPrice = hotelPrice;
    }
}
