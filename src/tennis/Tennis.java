package tennis;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Tennis extends JFrame {
	public static RenderPanel renderPanel;

	public Tennis(String title) {
		super(title);
	}

	public static void main(String[] args) throws InterruptedException {
		Tennis game = new Tennis("Mini Tennis");
		renderPanel = new RenderPanel();
		game.add(renderPanel);
		game.setSize(1000, 800);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setLocationRelativeTo(null);
		game.setVisible(true);
		

		while (true) {
			renderPanel.move();
			renderPanel.repaint();
			Thread.sleep(1);
		}
	}

}
