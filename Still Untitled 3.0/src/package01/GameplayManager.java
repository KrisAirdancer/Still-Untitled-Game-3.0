package package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameplayManager {

	UserInterface ui;
	VisibilityManager vManager;
	MainGame mainGame;
	
	String buttonAction1, buttonAction2, buttonAction3, buttonAction4, lastLocation, currentLocation;
	
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
				vManager.componentHider();
				theGoldenLakes();
				break;
			case "Head south":
				System.out.println("You went south!");
				vManager.componentHider();
				oresaVillage();
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
		
		ui.lastLocationNameLabel.setText(currentLocation);
		currentLocation = "- Oresa Village";
		ui.currentLocationNameLabel.setText(currentLocation);
	}
	
	public void theGoldenLakes() {
		
		ui.primaryGameText.setText("You are currently at The Golden Lakes.\nOresa Village lies to the south.");
		ui.gPButton1.setText("Head south");
		ui.gPButton1.setVisible(true);
		
		buttonAction1 = "Head south";
		
		ui.lastLocationNameLabel.setText(currentLocation);
		currentLocation = "- The Golden Lakes";
		ui.currentLocationNameLabel.setText(currentLocation);
	}
	
	public void checkInventory() {
		
		ui.primaryGameText.setVisible(false);
		
		ui.inventoryPanel.setVisible(true);
		
		ui.inventoryHeader.setVisible(true);
		
		ui.inventoryColumn1.setVisible(true);
		ui.inventoryColumn2.setVisible(true);
		ui.inventoryColumn3.setVisible(true);
		

		
		// Hide the normal game stuff
		// Make the inventory stuff visible
		// Loop over the inventory array and add all items to the inventory panels
	}

}
