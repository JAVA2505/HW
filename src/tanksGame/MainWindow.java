package tanksGame;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class MainWindow extends JFrame {
	
	private Image logo;

    public MainWindow(){ // конструктор окна
        setTitle("Snake");
        setIconImage(Service.loadImages("logo.jpg"));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(Service.SIZE, Service.SIZE);
        setLocationRelativeTo(null); // окно будет по центру
        add(new GameField()); // создаем панель
        setVisible(true);
    }
    

}
