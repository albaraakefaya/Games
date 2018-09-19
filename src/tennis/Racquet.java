package tennis;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Racquet {
	int x = 0;
	int xa = 0;
	static final int RACQUET_WIDTH = 60;
	static final int RACQUET_HIGHT = 10;
	private RenderPanel game;

	public Racquet(RenderPanel game) {
		this.game = game;
	}

	public void paint(Graphics2D g) {
		g.fillRect(x, this.game.getHeight() - Racquet.RACQUET_HIGHT, Racquet.RACQUET_WIDTH, Racquet.RACQUET_HIGHT);
	}

	public void move() {
		if ((x + xa) > 0 && (x + xa < this.game.getWidth() - Racquet.RACQUET_WIDTH)) {
			x += xa;
		}

	}

	public void keyReleased(KeyEvent e) {
		xa = 0;
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			xa = 1;
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			xa = -1;
	}
}
