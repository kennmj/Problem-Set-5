import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        firstLevel();
    }
    public static void firstLevel(){
        JFrame obj = new JFrame();
        Gameplay gamePlay = new Gameplay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Breakout ball");


        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        obj.setVisible(true);

    }
    public static void secLevel(){
        JFrame obj = new JFrame();
        GamePlaySecLevel gamePlaySecLevel = new GamePlaySecLevel();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Breakout ball");


        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlaySecLevel);
        obj.setVisible(true);

    }
    public static void thirdLevel(){
        JFrame obj = new JFrame();
        GamePlayThirdLevel gamePlayThirdLevel = new GamePlayThirdLevel();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Breakout ball");


        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlayThirdLevel);
        obj.setVisible(true);

    }
}
//mikey