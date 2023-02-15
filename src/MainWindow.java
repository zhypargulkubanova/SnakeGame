import javax.swing.*;

public class MainWindow extends JFrame {
    MainWindow() {
        setTitle("Snake game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //the button to close the window
        setSize(420, 345);// the height and the width of the window
        setLocation(300,300);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
