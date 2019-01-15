package tanksGame;

import javax.swing.*;

import figure.Bullet;
import figure.CrateMetal;
import figure.Tank;
import figure.TileGrass1;
import figure.TileGrass_transitionE;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GameField extends JPanel implements ActionListener {

	private Timer timer;
	Tank tank = new Tank();
	
	TileGrass1 tileGrass1 = new TileGrass1(0, 0);
	TileGrass1 tileGrass2 = new TileGrass1(0, 50);
	TileGrass1 tileGrass3 = new TileGrass1(50, 50);
	TileGrass1 tileGrass4 = new TileGrass1(50, 0);
	TileGrass_transitionE tileGrass5 = new TileGrass_transitionE(100, 0);
	TileGrass_transitionE tileGrass6 = new TileGrass_transitionE(100, 50);
	TileGrass_transitionE tileGrass7 = new TileGrass_transitionE(100, 100);
	TileGrass_transitionE tileGrass8 = new TileGrass_transitionE(100, 150);
	CrateMetal crateMetal1 = new CrateMetal(75, 75); 
	
	
	Bullet bullet = new Bullet(tank.getFigureX(), tank.getFigureY());

	public GameField() {

		setBackground(Color.black);
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				tank.keyPressed(e);
				bullet.setFigureX(tank.getFigureX());
				bullet.setFigureY(tank.getFigureY());
				bullet.keyPressed(e);
			}
		});
		
		setFocusable(true);
		timer = new Timer(20, this);
		timer.start();

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(tileGrass1.getGrassImage(), tileGrass1.getFigureX(), tileGrass1.getFigureY(), this);
		g.drawImage(tileGrass2.getGrassImage(), tileGrass2.getFigureX(), tileGrass2.getFigureY(), this);
		g.drawImage(tileGrass3.getGrassImage(), tileGrass3.getFigureX(), tileGrass3.getFigureY(), this);
		g.drawImage(tileGrass4.getGrassImage(), tileGrass4.getFigureX(), tileGrass4.getFigureY(), this);
		g.drawImage(tileGrass5.getGrassImage(), tileGrass5.getFigureX(), tileGrass5.getFigureY(), this);
		g.drawImage(tileGrass6.getGrassImage(), tileGrass6.getFigureX(), tileGrass6.getFigureY(), this);
		g.drawImage(tileGrass7.getGrassImage(), tileGrass7.getFigureX(), tileGrass7.getFigureY(), this);
		g.drawImage(tileGrass8.getGrassImage(), tileGrass8.getFigureX(), tileGrass8.getFigureY(), this);
		g.drawImage(crateMetal1.getGrassImage(), crateMetal1.getFigureX(), crateMetal1.getFigureY(), this);
	
		
		g.drawImage(tank.getTankImage(), tank.getFigureX(), tank.getFigureY(), this);
		g.drawImage(bullet.getBulletImage(), bullet.getFigureX(), bullet.getFigureY(), this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tank.move();
		bullet.move();
		repaint();
	}
}
