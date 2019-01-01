import java.util.HashMap;

/**
 * @author Andrew Dong
 * @date 2018/12/7 0:32
 */
public class Board {
    private int squareNum = 0;//方块数量
    private HashMap<Integer, Square> squares = new HashMap<Integer, Square>();

    public int getSquareNum() {
        return squareNum;
    }

    public void setSquareNum(int squareNum) {
        this.squareNum = squareNum;
    }

    public HashMap<Integer, Square> getSquares() {
        return squares;
    }

    public void setSquares(HashMap<Integer, Square> squares) {
        this.squares = squares;
    }

    /**
     * 创建地皮
     * @param landName
     * @param landPrice
     */
    public void createLand(String landName, double landPrice, Integer index){
        Land land = new Land();
        land.setName(landName);
        land.setLandPrice(landPrice);

        //将该块存入square中
        squares.put(index, land);
        this.squareNum++;
    }

    /**
     * 创建休息区
     */
    public void createRestSquare(String name, int restRoundTime, Integer index){
        RestSquare restSquare = new RestSquare();
        restSquare.setName(name);
        restSquare.setRestRoundTime(restRoundTime);

        //将该块存入square中
        squares.put(index, restSquare);
        this.squareNum++;
    }

    /**
     * 创建开始区域
     */
    public void createStartSquare(String name, double bonus, Integer index){
        StartSquare startSquare = new StartSquare();
        startSquare.setName(name);
        startSquare.setBonus(bonus);

        //将该块存入square中
        this.squares.put(index, startSquare);
        this.squareNum++;
    }


}
