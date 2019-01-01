import java.util.*;

/**
 * @author Andrew Dong
 * @date 2018/12/7 10:44
 */
public class MonopolyGame {
    private Integer currentPlayerId;//当前正在掷骰子的玩家id
    private int playerNum;
    private Board board;
    private Cup cup;
    private HashMap<String, Character> characters;
    private HashMap<Integer, Player> players;

    public void init(){
        this.currentPlayerId = 0;
        this.characters = new HashMap<String, Character>();
        this.players = new HashMap<Integer, Player>();

        this.createBoard();
        System.out.println("初始化board完成");

        this.createCharacter("小美", 0);
        this.createCharacter("小明", 1);
        this.createCharacter("老王", 2);
        this.createCharacter("小丽", 3);
        System.out.println("初始化character完成");

        this.createPlayer(characters.get("小美"),0, 5000);
        this.createPlayer(characters.get("小明"),1, 5000);
        this.createPlayer(characters.get("老王"),2, 5000);
        this.createPlayer(characters.get("小丽"),3, 5000);
        this.playerNum = players.size();
        System.out.println("初始化player完成");

        this.createCup();
        System.out.println("初始化cup完成");
    }

    public void createBoard(){
        board = new Board();
        board.createStartSquare("家", 2000, 0);
        board.createLand("共富富都园", 5000, 1);
        board.createLand("申江远景", 3000, 2);
        board.createLand("嘉骏花苑", 3000, 3);
        board.createLand("月泉湾名邸", 3000, 4);
        board.createLand("幸福春天", 3000, 5);
        board.createLand("虹桥华庭", 6000, 6);
        board.createLand("天山河畔花园", 5000, 7);
        //board.createLand("瑞仕花园", 10000, 8);
        board.createRestSquare("洗浴中心", 2, 8);
        board.createLand("河风丽景", 6000, 9);
        board.createLand("海逸公寓", 3000, 10);
        board.createLand("上海加州花园", 3000, 11);
        board.createLand("新风尚", 3000, 12);
        board.createRestSquare("洗浴中心", 2, 13);
        //board.createLand("水岸家苑", 3000, 15);
        board.createLand("金海湾别墅", 3000, 14);
        board.createLand("文治福邸", 3000, 15);
        board.createLand("虹口嘉苑", 4000, 16);
        board.createLand("香港丽园", 3000, 17);
        board.createLand("自由自宅", 4000, 18);
        board.createLand("虹口金地汇", 3000, 19);
        board.createLand("奎江公寓", 5000, 20);
        board.createLand("明珠家园", 3000, 21);
        board.createLand("淮海中华大厦", 4000, 22);
        board.createLand("安基大厦", 3000, 23);
        board.createLand("耀江花园", 6000, 24);
        board.createLand("阳光翠竹苑", 3000, 25);
    }

    /**
     * 创建角色
     * @param name
     * @param id
     */
    public void createCharacter(String name, Integer id){
        Character character = new Character();
        character.setName(name);
        character.setCharacterId(id);

        characters.put(name, character);
    }


    /**
     * 创建玩家
     * @param character
     * @param id
     */
    public void createPlayer(Character character, Integer id, double money){
        Player player = new Player();
        player.setCharacter(character);
        player.setId(id);
        player.increaseCash(money);

        players.put(id, player);
    }

    public void createCup(){
        cup = new Cup();
    }

    public boolean nextPlayer(){
            List list = new ArrayList<Integer>();
            //HashMap的迭代
            Set<Map.Entry<Integer, Player>> entrySet= players.entrySet();
            for (Map.Entry<Integer, Player> entry : entrySet){
                list.add(entry.getKey());
            }
            int index = list.indexOf(this.currentPlayerId);
            index++;
            try {
                this.currentPlayerId = (Integer) list.get(index);
            } catch (IndexOutOfBoundsException e){
                this.currentPlayerId = (Integer) list.get(0);
            }
            if (someoneWin()){
                return false;
            } else return true;

    }

    /**
     * 移动当前玩家
     */
    public boolean moveCurrentPlayer(){
        Player player = players.get(this.currentPlayerId);
        HashMap<Integer, Square> squares = board.getSquares();
        int nextLocation = (player.getCurrentLocation() + cup.getTotal()) % board.getSquareNum();

        if (nextLocation < player.getCurrentLocation()){//说明经过了出发点
            StartSquare startSquare = (StartSquare) board.getSquares().get(0);
            player.increaseCash( startSquare.getBonus());
            System.out.println(player.getCharacter().getName() + "获得了" + startSquare.getBonus() + "元");
        }

        player.setCurrentLocation(nextLocation);
        System.out.println(player.getCharacter().getName() + "移动了" + cup.getTotal() + "步");


        Square square = squares.get(nextLocation);
        System.out.println(player.getCharacter().getName() + "当前在" + square.getName());
        if (square instanceof StartSquare){
            StartSquare startSquare = (StartSquare) board.getSquares().get(0);
            player.increaseCash( startSquare.getBonus());
            System.out.println(player.getCharacter().getName() + "怎么又获得了" + startSquare.getBonus() + "元");
            return true;
        } else if (square instanceof Land){
            Land land = (Land) square;
            if (land.getOwnerId() != -1){//说明这块地有人买了
                if (player.decreaseCash(land.getRentPrice())){//说明还付得起钱
                    Player renter = players.get(land.getOwnerId());
                    renter.increaseCash(land.getRentPrice());
                    return true;
                } else {
                    System.out.println(player.getCharacter().getName() + "破产了");
                    this.refresh(player.getId());
                    return false;
                }
            }
            return true;
        } else if (square instanceof RestSquare){
            player.setRestTime(((RestSquare) square).getRestRoundTime());
            return true;
        }
        return true;
    }

    /**
     * 判断是否有人胜出
     * @return
     */
    public boolean someoneWin(){
        if (this.playerNum == 1){
            System.out.println(players.get(this.currentPlayerId).getCharacter().getName() + "是最终的赢家！");
            return true;
        }
        return false;
    }

    /**
     * 清空破产者房产
     */
    public void refresh(Integer id){
        players.remove(id);
        playerNum = players.size();

        //HashMap的迭代
        Set<Map.Entry<Integer, Square>> entrySet= board.getSquares().entrySet();
        for (Map.Entry<Integer, Square> entry : entrySet){
            if (entry.getValue() instanceof Land){
                Land land = (Land) entry.getValue();
                if (land.getOwnerId().equals(id)){
                    ((Land) board.getSquares().get(entry.getKey())).setOwnerId(-1);
                    ((Land) board.getSquares().get(entry.getKey())).setHotelNum(0);
                }
            }
        }
    }
    public Integer getCurrentPlayerId() {
        return currentPlayerId;
    }

    public void setCurrentPlayerId(Integer currentPlayerId) {
        this.currentPlayerId = currentPlayerId;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Cup getCup() {
        return cup;
    }

    public void setCup(Cup cup) {
        this.cup = cup;
    }

    public HashMap<String, Character> getCharacters() {
        return characters;
    }

    public void setCharacters(HashMap<String, Character> characters) {
        this.characters = characters;
    }

    public HashMap<Integer, Player> getPlayers() {
        return players;
    }

    public void setPlayers(HashMap<Integer, Player> players) {
        this.players = players;
    }
}
