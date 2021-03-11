package package01;

import package01.MainGame.GameplayButtonHandler;
import package01.MainGame.GeneralButtonHandler;

public class VisibilityManager {

	UserInterface ui;
	GeneralButtonHandler gBHandler;
	GameplayButtonHandler gPBHandler;
	
	public VisibilityManager(UserInterface userInterface, GeneralButtonHandler gButtonHandler, GameplayButtonHandler gameplayButtonHandler) {
		
		ui = userInterface;
		this.gBHandler = gButtonHandler;
		gPBHandler = gameplayButtonHandler;
	}
	
	public void startGame() {
		
		ui.createMainGameWindow(gBHandler, gPBHandler);
		
		ui.startMenuPanel.setVisible(false);
		
		ui.primaryMainGamePanel.setVisible(true);
	}
	
}
