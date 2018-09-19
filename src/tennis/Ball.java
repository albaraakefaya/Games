package tennis;

import java.awt.Graphics;

public class Ball {
	public static final int BALL_DIMENSION = 30;
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
	private RenderPanel game;

	public Ball(RenderPanel game) {
		this.game = game;
	}

	public void move() {
		if (x + xa < 0)
			xa = 1;
		if (x + xa > game.getWidth() - BALL_DIMENSION)
			xa = -1;
		if (y + ya > game.getHeight() - BALL_DIMENSION)
			ya = -1;
		if (y + ya < 0)
			ya = 1;

		x += xa;
		y += ya;

	}

	public void paint(Graphics g) {
		g.fillOval(x, y, Ball.BALL_DIMENSION, Ball.BALL_DIMENSION);
	}

}
