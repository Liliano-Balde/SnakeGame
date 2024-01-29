package snakepackage;

import javax.swing.JFrame;

//this class is the main frame of the game
public class GameFrame extends JFrame {

//	constructor that line 13. add new instance of game panel to the frame, 14. set the title of the frame,
//	15. set the default to close operation to exit the application, 16. disables the ability to resize the frame and 17. adjusts the frame based on its components
//	18. makes the frame visible, 19. center the frame on the screen
	GameFrame() {

		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);

	}

}
