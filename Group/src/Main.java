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
        JFrame sec = new JFrame();
        GamePlaySecLevel gamePlaySecLevel = new GamePlaySecLevel();
        sec.setBounds(10,10,700,600);
        sec.setTitle("Breakout ball Level 2");
        sec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sec.add(gamePlaySecLevel);
        sec.setVisible(true);
    }
    public static void thirdLevel(){
        JFrame third = new JFrame();
        GamePlayThirdLevel gamePlayThirdLevel = new GamePlayThirdLevel();
        third.setBounds(10,10,700,600);
        third.setTitle("Breakout ball Level 3");
        third.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        third.add(gamePlayThirdLevel);
        third.setVisible(true);
    }
}
