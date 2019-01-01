import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * @author Andrew Dong
 * @date 2018/12/7 11:08
 */
public class GameUI {
    private static int flag = 0;
    private static int noPlayer = 0;

    public static void main(String[] args) {

        final JFrame frame = new JFrame("大富翁");
        frame.setSize(1500, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{1300, 200};
        gridBagLayout.rowHeights = new int[]{850};
        gridBagLayout.columnWeights = new double[]{1.0, 1.0};
        gridBagLayout.rowWeights = new double[]{1.0};
        frame.getContentPane().setLayout(gridBagLayout);

        JPanel mapPanel = new JPanel();
        GridBagConstraints gbc_mapPanel = new GridBagConstraints();
        gbc_mapPanel.insets = new Insets(0, 0, 0, 0);
        gbc_mapPanel.fill = GridBagConstraints.BOTH;
        gbc_mapPanel.gridx = 0;
        gbc_mapPanel.gridy = 0;
        frame.getContentPane().add(mapPanel, gbc_mapPanel);
        GridBagLayout gbl_mapPanel = new GridBagLayout();
        gbl_mapPanel.columnWidths = new int[]{100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        gbl_mapPanel.rowHeights = new int[]{100, 100, 100, 100, 100, 100, 100, 100};
        gbl_mapPanel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
        gbl_mapPanel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
        mapPanel.setLayout(gbl_mapPanel);

        JPanel panel = new JPanel();
        GridBagConstraints gbc_panel = new GridBagConstraints();
        gbc_panel.insets = new Insets(0, 0, 5, 5);
        gbc_panel.fill = GridBagConstraints.BOTH;
        gbc_panel.gridx = 1;
        gbc_panel.gridy = 1;
        mapPanel.add(panel, gbc_panel);

        JPanel panel_1 = new JPanel();
        GridBagConstraints gbc_panel_1 = new GridBagConstraints();
        gbc_panel_1.insets = new Insets(0, 0, 5, 5);
        gbc_panel_1.fill = GridBagConstraints.BOTH;
        gbc_panel_1.gridx = 2;
        gbc_panel_1.gridy = 1;
        mapPanel.add(panel_1, gbc_panel_1);

        JPanel panel_2 = new JPanel();
        GridBagConstraints gbc_panel_2 = new GridBagConstraints();
        gbc_panel_2.insets = new Insets(0, 0, 5, 5);
        gbc_panel_2.fill = GridBagConstraints.BOTH;
        gbc_panel_2.gridx = 3;
        gbc_panel_2.gridy = 1;
        mapPanel.add(panel_2, gbc_panel_2);

        JPanel panel_3 = new JPanel();
        GridBagConstraints gbc_panel_3 = new GridBagConstraints();
        gbc_panel_3.insets = new Insets(0, 0, 5, 5);
        gbc_panel_3.fill = GridBagConstraints.BOTH;
        gbc_panel_3.gridx = 4;
        gbc_panel_3.gridy = 1;
        mapPanel.add(panel_3, gbc_panel_3);

        JPanel panel_4 = new JPanel();
        GridBagConstraints gbc_panel_4 = new GridBagConstraints();
        gbc_panel_4.insets = new Insets(0, 0, 5, 5);
        gbc_panel_4.fill = GridBagConstraints.BOTH;
        gbc_panel_4.gridx = 5;
        gbc_panel_4.gridy = 1;
        mapPanel.add(panel_4, gbc_panel_4);

        JPanel panel_5 = new JPanel();
        GridBagConstraints gbc_panel_5 = new GridBagConstraints();
        gbc_panel_5.insets = new Insets(0, 0, 5, 5);
        gbc_panel_5.fill = GridBagConstraints.BOTH;
        gbc_panel_5.gridx = 6;
        gbc_panel_5.gridy = 1;
        mapPanel.add(panel_5, gbc_panel_5);

        JPanel panel_6 = new JPanel();
        GridBagConstraints gbc_panel_6 = new GridBagConstraints();
        gbc_panel_6.insets = new Insets(0, 0, 5, 5);
        gbc_panel_6.fill = GridBagConstraints.BOTH;
        gbc_panel_6.gridx = 7;
        gbc_panel_6.gridy = 1;
        mapPanel.add(panel_6, gbc_panel_6);

        JPanel panel_7 = new JPanel();
        GridBagConstraints gbc_panel_7 = new GridBagConstraints();
        gbc_panel_7.insets = new Insets(0, 0, 5, 5);
        gbc_panel_7.fill = GridBagConstraints.BOTH;
        gbc_panel_7.gridx = 8;
        gbc_panel_7.gridy = 1;
        mapPanel.add(panel_7, gbc_panel_7);

//        JPanel panel_8 = new JPanel();
//        GridBagConstraints gbc_panel_8 = new GridBagConstraints();
//        gbc_panel_8.insets = new Insets(0, 0, 5, 5);
//        gbc_panel_8.fill = GridBagConstraints.BOTH;
//        gbc_panel_8.gridx = 9;
//        gbc_panel_8.gridy = 1;
//        mapPanel.add(panel_8, gbc_panel_8);

        JPanel panel_9 = new JPanel();
        GridBagConstraints gbc_panel_9 = new GridBagConstraints();
        gbc_panel_9.insets = new Insets(0, 0, 5, 5);
        gbc_panel_9.fill = GridBagConstraints.BOTH;
        gbc_panel_9.gridx = 9;
        gbc_panel_9.gridy = 1;
        mapPanel.add(panel_9, gbc_panel_9);

        JPanel panel_27 = new JPanel();
        GridBagConstraints gbc_panel_27 = new GridBagConstraints();
        gbc_panel_27.insets = new Insets(0, 0, 5, 5);
        gbc_panel_27.fill = GridBagConstraints.BOTH;
        gbc_panel_27.gridx = 1;
        gbc_panel_27.gridy = 2;
        mapPanel.add(panel_27, gbc_panel_27);

        JPanel panel_10 = new JPanel();
        GridBagConstraints gbc_panel_10 = new GridBagConstraints();
        gbc_panel_10.insets = new Insets(0, 0, 5, 5);
        gbc_panel_10.fill = GridBagConstraints.BOTH;
        gbc_panel_10.gridx = 9;
        gbc_panel_10.gridy = 2;
        mapPanel.add(panel_10, gbc_panel_10);

        JPanel panel_26 = new JPanel();
        GridBagConstraints gbc_panel_26 = new GridBagConstraints();
        gbc_panel_26.insets = new Insets(0, 0, 5, 5);
        gbc_panel_26.fill = GridBagConstraints.BOTH;
        gbc_panel_26.gridx = 1;
        gbc_panel_26.gridy = 3;
        mapPanel.add(panel_26, gbc_panel_26);

        JPanel panel_11 = new JPanel();
        GridBagConstraints gbc_panel_11 = new GridBagConstraints();
        gbc_panel_11.insets = new Insets(0, 0, 5, 5);
        gbc_panel_11.fill = GridBagConstraints.BOTH;
        gbc_panel_11.gridx = 9;
        gbc_panel_11.gridy = 3;
        mapPanel.add(panel_11, gbc_panel_11);

        JPanel panel_25 = new JPanel();
        GridBagConstraints gbc_panel_25 = new GridBagConstraints();
        gbc_panel_25.insets = new Insets(0, 0, 5, 5);
        gbc_panel_25.fill = GridBagConstraints.BOTH;
        gbc_panel_25.gridx = 1;
        gbc_panel_25.gridy = 4;
        mapPanel.add(panel_25, gbc_panel_25);

        JPanel panel_12 = new JPanel();
        GridBagConstraints gbc_panel_12 = new GridBagConstraints();
        gbc_panel_12.insets = new Insets(0, 0, 5, 5);
        gbc_panel_12.fill = GridBagConstraints.BOTH;
        gbc_panel_12.gridx = 9;
        gbc_panel_12.gridy = 4;
        mapPanel.add(panel_12, gbc_panel_12);

        JPanel panel_24 = new JPanel();
        GridBagConstraints gbc_panel_24 = new GridBagConstraints();
        gbc_panel_24.insets = new Insets(0, 0, 5, 5);
        gbc_panel_24.fill = GridBagConstraints.BOTH;
        gbc_panel_24.gridx = 1;
        gbc_panel_24.gridy = 5;
        mapPanel.add(panel_24, gbc_panel_24);

        JPanel panel_13 = new JPanel();
        GridBagConstraints gbc_panel_13 = new GridBagConstraints();
        gbc_panel_13.insets = new Insets(0, 0, 5, 5);
        gbc_panel_13.fill = GridBagConstraints.BOTH;
        gbc_panel_13.gridx = 9;
        gbc_panel_13.gridy = 5;
        mapPanel.add(panel_13, gbc_panel_13);

        JPanel panel_23 = new JPanel();
        GridBagConstraints gbc_panel_23 = new GridBagConstraints();
        gbc_panel_23.insets = new Insets(0, 0, 5, 5);
        gbc_panel_23.fill = GridBagConstraints.BOTH;
        gbc_panel_23.gridx = 1;
        gbc_panel_23.gridy = 6;
        mapPanel.add(panel_23, gbc_panel_23);

        JPanel panel_22 = new JPanel();
        GridBagConstraints gbc_panel_22 = new GridBagConstraints();
        gbc_panel_22.insets = new Insets(0, 0, 5, 5);
        gbc_panel_22.fill = GridBagConstraints.BOTH;
        gbc_panel_22.gridx = 2;
        gbc_panel_22.gridy = 6;
        mapPanel.add(panel_22, gbc_panel_22);

        JPanel panel_21 = new JPanel();
        GridBagConstraints gbc_panel_21 = new GridBagConstraints();
        gbc_panel_21.insets = new Insets(0, 0, 5, 5);
        gbc_panel_21.fill = GridBagConstraints.BOTH;
        gbc_panel_21.gridx = 3;
        gbc_panel_21.gridy = 6;
        mapPanel.add(panel_21, gbc_panel_21);

        JPanel panel_20 = new JPanel();
        GridBagConstraints gbc_panel_20 = new GridBagConstraints();
        gbc_panel_20.insets = new Insets(0, 0, 5, 5);
        gbc_panel_20.fill = GridBagConstraints.BOTH;
        gbc_panel_20.gridx = 4;
        gbc_panel_20.gridy = 6;
        mapPanel.add(panel_20, gbc_panel_20);

        JPanel panel_19 = new JPanel();
        GridBagConstraints gbc_panel_19 = new GridBagConstraints();
        gbc_panel_19.insets = new Insets(0, 0, 5, 5);
        gbc_panel_19.fill = GridBagConstraints.BOTH;
        gbc_panel_19.gridx = 5;
        gbc_panel_19.gridy = 6;
        mapPanel.add(panel_19, gbc_panel_19);

        JPanel panel_18 = new JPanel();
        GridBagConstraints gbc_panel_18 = new GridBagConstraints();
        gbc_panel_18.insets = new Insets(0, 0, 5, 5);
        gbc_panel_18.fill = GridBagConstraints.BOTH;
        gbc_panel_18.gridx = 6;
        gbc_panel_18.gridy = 6;
        mapPanel.add(panel_18, gbc_panel_18);

        JPanel panel_17 = new JPanel();
        GridBagConstraints gbc_panel_17 = new GridBagConstraints();
        gbc_panel_17.insets = new Insets(0, 0, 5, 5);
        gbc_panel_17.fill = GridBagConstraints.BOTH;
        gbc_panel_17.gridx = 7;
        gbc_panel_17.gridy = 6;
        mapPanel.add(panel_17, gbc_panel_17);

        JPanel panel_16 = new JPanel();
        GridBagConstraints gbc_panel_16 = new GridBagConstraints();
        gbc_panel_16.insets = new Insets(0, 0, 5, 5);
        gbc_panel_16.fill = GridBagConstraints.BOTH;
        gbc_panel_16.gridx = 8;
        gbc_panel_16.gridy = 6;
        mapPanel.add(panel_16, gbc_panel_16);

//        JPanel panel_15 = new JPanel();
//        GridBagConstraints gbc_panel_15 = new GridBagConstraints();
//        gbc_panel_15.insets = new Insets(0, 0, 5, 5);
//        gbc_panel_15.fill = GridBagConstraints.BOTH;
//        gbc_panel_15.gridx = 9;
//        gbc_panel_15.gridy = 6;
//        mapPanel.add(panel_15, gbc_panel_15);

        JPanel panel_14 = new JPanel();
        GridBagConstraints gbc_panel_14 = new GridBagConstraints();
        gbc_panel_14.insets = new Insets(0, 0, 5, 5);
        gbc_panel_14.fill = GridBagConstraints.BOTH;
        gbc_panel_14.gridx = 9;
        gbc_panel_14.gridy = 6;
        mapPanel.add(panel_14, gbc_panel_14);


        JPanel ButtonPanel = new JPanel();
        GridBagConstraints gbc_ButtonPanel = new GridBagConstraints();
        gbc_ButtonPanel.insets = new Insets(0, 0, 0, 0);
        gbc_ButtonPanel.fill = GridBagConstraints.BOTH;
        gbc_ButtonPanel.gridx = 1;
        gbc_ButtonPanel.gridy = 0;
        frame.getContentPane().add(ButtonPanel, gbc_ButtonPanel);
        ButtonPanel.setLayout(new GridLayout(2, 0, 0, 0));

        JPanel panel_28 = new JPanel();
        ButtonPanel.add(panel_28);
        panel_28.setLayout(new GridLayout(1, 0, 0, 0));

        final JTextPane textPane = new JTextPane();
        panel_28.add(textPane);

        JPanel panel_29 = new JPanel();
        ButtonPanel.add(panel_29);
        panel_29.setLayout(new GridLayout(6, 0, 0, 0));

        JPanel panel_30 = new JPanel();
        panel_29.add(panel_30);
        panel_30.setLayout(new BorderLayout(0, 0));

        JButton cupButton = new JButton("掷骰子");
        panel_30.add(cupButton, BorderLayout.CENTER);

        JPanel panel_31 = new JPanel();
        panel_29.add(panel_31);
        panel_31.setLayout(new BorderLayout(0, 0));

        JButton buyLandButton = new JButton("购买地皮");
        panel_31.add(buyLandButton, BorderLayout.CENTER);

        JPanel panel_32 = new JPanel();
        panel_29.add(panel_32);
        panel_32.setLayout(new BorderLayout(0, 0));

        JButton saleLandButton = new JButton("我是一个没用的按钮");
        panel_32.add(saleLandButton, BorderLayout.CENTER);

        JPanel panel_33 = new JPanel();
        panel_29.add(panel_33);
        panel_33.setLayout(new BorderLayout(0, 0));

        JButton buyHotelButton = new JButton("购买房产");
        panel_33.add(buyHotelButton, BorderLayout.CENTER);

        JPanel panel_34 = new JPanel();
        panel_29.add(panel_34);
        panel_34.setLayout(new BorderLayout(0, 0));

        JButton nextButton = new JButton("结束回合");
        panel_34.add(nextButton, BorderLayout.CENTER);

        JPanel panel_35 = new JPanel();
        panel_29.add(panel_35);
        panel_35.setLayout(new BorderLayout(0, 0));

        JButton bankruptButton = new JButton("点我一下破个产");
        panel_35.add(bankruptButton, BorderLayout.CENTER);


        final MonopolyGame monopolyGame = new MonopolyGame();
        monopolyGame.init();

        JTextPane textPane_0 = new JTextPane();
        textPane_0.setText(monopolyGame.getBoard().getSquares().get(0).getName());
        panel.add(textPane_0);
        JTextPane textPane_1 = new JTextPane();
        textPane_1.setText(monopolyGame.getBoard().getSquares().get(1).getName());
        panel_1.add(textPane_1);
        JTextPane textPane_2 = new JTextPane();
        textPane_2.setText(monopolyGame.getBoard().getSquares().get(2).getName());
        panel_2.add(textPane_2);
        JTextPane textPane_3 = new JTextPane();
        textPane_3.setText(monopolyGame.getBoard().getSquares().get(3).getName());
        panel_3.add(textPane_3);
        JTextPane textPane_4 = new JTextPane();
        textPane_4.setText(monopolyGame.getBoard().getSquares().get(4).getName());
        panel_4.add(textPane_4);
        JTextPane textPane_5 = new JTextPane();
        textPane_5.setText(monopolyGame.getBoard().getSquares().get(5).getName());
        panel_5.add(textPane_5);
        JTextPane textPane_6 = new JTextPane();
        textPane_6.setText(monopolyGame.getBoard().getSquares().get(6).getName());
        panel_6.add(textPane_6);
        JTextPane textPane_7 = new JTextPane();
        textPane_7.setText(monopolyGame.getBoard().getSquares().get(7).getName());
        panel_7.add(textPane_7);
//        JTextPane textPane_8 = new JTextPane();
//        textPane_8.setText(monopolyGame.getBoard().getSquares().get(8).getName());
//        panel_8.add(textPane_8);
        JTextPane textPane_9 = new JTextPane();
        textPane_9.setText(monopolyGame.getBoard().getSquares().get(8).getName());
        panel_9.add(textPane_9);
        JTextPane textPane_10 = new JTextPane();
        textPane_10.setText(monopolyGame.getBoard().getSquares().get(9).getName());
        panel_10.add(textPane_10);
        JTextPane textPane_11 = new JTextPane();
        textPane_11.setText(monopolyGame.getBoard().getSquares().get(10).getName());
        panel_11.add(textPane_11);
        JTextPane textPane_12 = new JTextPane();
        textPane_12.setText(monopolyGame.getBoard().getSquares().get(11).getName());
        panel_12.add(textPane_12);
        JTextPane textPane_13 = new JTextPane();
        textPane_13.setText(monopolyGame.getBoard().getSquares().get(12).getName());
        panel_13.add(textPane_13);
        JTextPane textPane_14 = new JTextPane();
        textPane_14.setText(monopolyGame.getBoard().getSquares().get(13).getName());
        panel_14.add(textPane_14);
//        JTextPane textPane_15 = new JTextPane();
//        textPane_15.setText(monopolyGame.getBoard().getSquares().get(15).getName());
//        panel_15.add(textPane_15);
        JTextPane textPane_16 = new JTextPane();
        textPane_16.setText(monopolyGame.getBoard().getSquares().get(14).getName());
        panel_16.add(textPane_16);
        JTextPane textPane_17 = new JTextPane();
        textPane_17.setText(monopolyGame.getBoard().getSquares().get(15).getName());
        panel_17.add(textPane_17);
        JTextPane textPane_18 = new JTextPane();
        textPane_18.setText(monopolyGame.getBoard().getSquares().get(16).getName());
        panel_18.add(textPane_18);
        JTextPane textPane_19 = new JTextPane();
        textPane_19.setText(monopolyGame.getBoard().getSquares().get(17).getName());
        panel_19.add(textPane_19);
        JTextPane textPane_20 = new JTextPane();
        textPane_20.setText(monopolyGame.getBoard().getSquares().get(18).getName());
        panel_20.add(textPane_20);
        JTextPane textPane_21 = new JTextPane();
        textPane_21.setText(monopolyGame.getBoard().getSquares().get(19).getName());
        panel_21.add(textPane_21);
        JTextPane textPane_22 = new JTextPane();
        textPane_22.setText(monopolyGame.getBoard().getSquares().get(20).getName());
        panel_22.add(textPane_22);
        JTextPane textPane_23 = new JTextPane();
        textPane_23.setText(monopolyGame.getBoard().getSquares().get(21).getName());
        panel_23.add(textPane_23);
        JTextPane textPane_24 = new JTextPane();
        textPane_24.setText(monopolyGame.getBoard().getSquares().get(22).getName());
        panel_24.add(textPane_24);
        JTextPane textPane_25 = new JTextPane();
        textPane_25.setText(monopolyGame.getBoard().getSquares().get(23).getName());
        panel_25.add(textPane_25);
        JTextPane textPane_26 = new JTextPane();
        textPane_26.setText(monopolyGame.getBoard().getSquares().get(24).getName());
        panel_26.add(textPane_26);
        JTextPane textPane_27 = new JTextPane();
        textPane_27.setText(monopolyGame.getBoard().getSquares().get(25).getName());
        panel_27.add(textPane_27);


        final JPanel panellist[] = {
                panel, panel_1, panel_2, panel_3, panel_4, panel_5, panel_6, panel_7, panel_9, panel_10, panel_11,
                panel_12, panel_13, panel_14, panel_16, panel_17, panel_18, panel_19, panel_20, panel_21, panel_22,
                panel_23, panel_24, panel_25, panel_26, panel_27, panel_26, panel_27
        };

        for (JPanel p : panellist) {
            p.setBorder(BorderFactory.createEtchedBorder());
        }

        JLabel label = new JLabel(monopolyGame.getPlayers().get(0).getCharacter().getName());
        JLabel label_1 = new JLabel(monopolyGame.getPlayers().get(1).getCharacter().getName());
        JLabel label_2 = new JLabel(monopolyGame.getPlayers().get(2).getCharacter().getName());
        JLabel label_3 = new JLabel(monopolyGame.getPlayers().get(3).getCharacter().getName());

        final JLabel labelList[] = {
                label, label_1, label_2, label_3
        };

        for (JLabel l : labelList) {
            l.setSize(100, 25);
            panel.add(l);
        }

        frame.setVisible(true);
        textPane.setText(monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).playerInfo() + "============\n" + monopolyGame.getBoard().getSquares().get(monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).getCurrentLocation()).getInfo());


        cupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Player player = monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId());
                int currentPlayerID= player.getId();

                if (player.getRestTime() > 0){
                    flag = 1;
                    player.decreaseRestTime();
                    JOptionPane.showMessageDialog(null, "别急,你还不能行动", "提示", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (flag == 0) {
                        flag = 1;
                        monopolyGame.getCup().roll();
                        if (!monopolyGame.moveCurrentPlayer()) {
                            JOptionPane.showMessageDialog(null, "这个人破产了", "提示", JOptionPane.ERROR_MESSAGE);
                            noPlayer = 1;
                            labelList[currentPlayerID].setVisible(false);
                            frame.repaint();
                        } else {
                            textPane.setText(monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).playerInfo() + "============\n" + monopolyGame.getBoard().getSquares().get(monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).getCurrentLocation()).getInfo());
                            //System.out.println(monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).getCurrentLocation());
                            panellist[monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).getCurrentLocation()].add(labelList[monopolyGame.getCurrentPlayerId()]);
                            frame.repaint();
                            int event = new Random().nextInt(20) + 1;
                            if (event <= 2){//随机事件
                                JOptionPane.showMessageDialog(null, monopolyGame.getEvents().get(event).getInfo(), "提示", JOptionPane.ERROR_MESSAGE);
                                monopolyGame.getEvents().get(event).doRandomEvent(monopolyGame.getPlayers(), monopolyGame.getCurrentPlayerId());
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "你已经掷过骰子了你不知道吗", "提示", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        buyLandButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag == 1 && noPlayer == 0) {
                    Player player = monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId());
                    Square square = monopolyGame.getBoard().getSquares().get(player.getCurrentLocation());
                    if (square instanceof Land) {
                        Land land = (Land) square;
                        if (land.getOwnerId() != -1) {
                            JOptionPane.showMessageDialog(null, "该地皮已有所有者", "提示", JOptionPane.ERROR_MESSAGE);
                        } else {
                            if (player.buyEstate(monopolyGame.getBoard().getSquares())) {
                                textPane.setText(monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).playerInfo() + "============\n" + monopolyGame.getBoard().getSquares().get(monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).getCurrentLocation()).getInfo());
                                JOptionPane.showMessageDialog(null, "购买成功", "提示", JOptionPane.ERROR_MESSAGE);
                            } else
                                JOptionPane.showMessageDialog(null, "现金不足", "提示", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "不能购买该地皮", "提示", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (flag == 0) {
                    JOptionPane.showMessageDialog(null, "你先掷骰子好吗", "提示", JOptionPane.ERROR_MESSAGE);
                } else if (noPlayer == 1) {
                    JOptionPane.showMessageDialog(null, "你都破产了买什么买", "提示", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        saleLandButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        buyHotelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag == 1 && noPlayer == 0) {
                    Player player = monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId());
                    Square square = monopolyGame.getBoard().getSquares().get(player.getCurrentLocation());
                    if (square instanceof Land) {
                        Land land = (Land) square;
                        if (land.getOwnerId() != player.getId()) {
                            JOptionPane.showMessageDialog(null, "这不是你的地皮", "提示", JOptionPane.ERROR_MESSAGE);
                        } else {
                            if (player.decreaseCash(land.getHotelPrice())) {
                                land.buildHotel(1);
                                textPane.setText(monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).playerInfo() + "============\n" + monopolyGame.getBoard().getSquares().get(monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).getCurrentLocation()).getInfo());
                                JOptionPane.showMessageDialog(null, "建造成功", "提示", JOptionPane.ERROR_MESSAGE);
                            } else
                                JOptionPane.showMessageDialog(null, "现金不足", "提示", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "这不是你的地皮", "提示", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (flag == 0) {
                    JOptionPane.showMessageDialog(null, "你先掷骰子好吗", "提示", JOptionPane.ERROR_MESSAGE);
                } else if (noPlayer == 1) {
                    JOptionPane.showMessageDialog(null, "你都破产了买什么买", "提示", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (flag == 1) {
                    flag = 0;
                    noPlayer = 0;
                    if (!monopolyGame.nextPlayer()) {
                        JOptionPane.showMessageDialog(null, "玩家" + monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).getCharacter().getName() + "获胜", "提示", JOptionPane.ERROR_MESSAGE);
                    } else {
                        textPane.setText(monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).playerInfo() + "============\n" + monopolyGame.getBoard().getSquares().get(monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).getCurrentLocation()).getInfo());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "你还没掷骰子好吗", "提示", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

//        bankruptButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).decreaseCash(monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).getCash());
//                textPane.setText(monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).playerInfo() + "============\n" + monopolyGame.getBoard().getSquares().get(monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).getCurrentLocation()).getInfo());
//                monopolyGame.refresh(monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).getId());
//                JOptionPane.showMessageDialog(null, "这个人破产了", "提示", JOptionPane.ERROR_MESSAGE);
//                labelList[monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).getId()].setText(labelList[monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).getId()].getText()+"(破产)");
//                //frame.repaint();
//                panellist[monopolyGame.getPlayers().get(monopolyGame.getCurrentPlayerId()).getCurrentLocation()].repaint();
//            }
//        });
    }
}
