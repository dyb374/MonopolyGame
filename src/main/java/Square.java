/**
 * @author Andrew Dong
 * @date 2018/12/6 19:03
 */
public class Square {
    private String name;
    private Integer positionX;
    private Integer positionY;
    private Integer nextX;
    private Integer nextY;

    public String getInfo(){
        return "公共区域";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    public Integer getNextX() {
        return nextX;
    }

    public void setNextX(Integer nextX) {
        this.nextX = nextX;
    }

    public Integer getNextY() {
        return nextY;
    }

    public void setNextY(Integer nextY) {
        this.nextY = nextY;
    }
}
