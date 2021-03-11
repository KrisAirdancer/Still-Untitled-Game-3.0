package package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameplayManager {

	UserInterface ui;
	VisibilityManager vManager;
	MainGame mainGame;
	
	String buttonAction1, buttonAction2, buttonAction3, buttonAction4;
	
	public GameplayManager(UserInterface userInterface, VisibilityManager visibilityManager, MainGame game) {
		
		ui = userInterface;
		vManager = visibilityManager;
		mainGame = game;
		
		buttonAction1 = " ";
		buttonAction2 = " ";
		buttonAction3 = " ";
		buttonAction4 = " ";

	}
	
	public void gameplayDecisionManager(String decision) {
		
		switch (decision) {
			case "Head north":
				System.out.println("You went north!");
				break;
			
		}
	}
	
	public void createDefaultPlayerClass() {
		
	}
	
	public void oresaVillage() {
		
		ui.primaryGameText.setText("You are currently in Oresa Village.\nThe Golden Lakes lie to the north.");
		ui.gPButton1.setText("Head north");
		ui.gPButton1.setVisible(true);
		
		buttonAction1 = "Head north";
	}

}
