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
		
		ui.mapButton.setVisible(false); // Map button is temporarily disabled until it does something
		ui.hPLabel.setVisible(false); // HP Label is temporarily disabled until it is needed
		// NOTE: The Load Game button currently disabled until it is needed
	}
	
	public void componentHider() {
		
		ui.gameTextLabel1.setVisible(false);
		ui.gameTextLabel2.setVisible(false);
		ui.gameTextLabel3.setVisible(false);
		ui.gameTextLabel4.setVisible(false);
		ui.gameTextLabel5.setVisible(false);
		ui.gPButton1.setVisible(false);
		ui.gPButton2.setVisible(false);
		ui.gPButton3.setVisible(false);
		ui.gPButton4.setVisible(false);
	}
	
}
