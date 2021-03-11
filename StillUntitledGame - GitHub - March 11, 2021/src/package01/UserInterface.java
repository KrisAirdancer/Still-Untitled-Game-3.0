package package01;

import java.awt.*;

import javax.swing.*;

import package01.MainGame.GameplayButtonHandler;
import package01.MainGame.GeneralButtonHandler;

public class UserInterface {

	JFrame primaryGameFrame;
	JPanel startMenuPanel, primaryMainGamePanel, mainGamePanel1, mainGamePanel2, mainGamePanel3, internalPanel1;
	JButton startButton,loadGameButton, inventoryButton, mapButton, exitButton, gPButton1, gPButton2, gPButton3, gPButton4;
	JLabel titleLabel, fillerLabelTop, fillerLabelMiddle, fillerLabelBottom, hPLabel, fillerLabel1, fillerLabel2, fillerLabel3, 
	westFillerLabel, eastFillerLabel, notifictaionLabel1, gameTextLabel1, gameTextLabel2, gameTextLabel3, gameTextLabel4, gameTextLabel5;
	JTextArea primaryGameText;
	Font primaryFont = new Font("Times New Roman", Font.PLAIN, 50);
	Font secondaryFont = new Font("Calibri", Font.PLAIN, 18);
	Dimension panel2ButtonDimension = new Dimension(150, 20);
	Dimension panel1ButtonDimension = new Dimension(150, 20);
	Dimension panel1ButtonMAXDimension = new Dimension(150, 20);
	Dimension internalPanelFillerLabelDimension = new Dimension(400, 20);
	
	public void createUserInterface(GeneralButtonHandler gButtonHandler, GameplayButtonHandler gPBHandler) {
				
		primaryGameFrame = new JFrame();
		primaryGameFrame.setTitle("Start Menu Test");
		primaryGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagConstraints gBC = new GridBagConstraints();
		
		// Creating a JPanel
		startMenuPanel = new JPanel();
		startMenuPanel.setLayout(new GridBagLayout() );
		startMenuPanel.setPreferredSize(new Dimension(700, 500) );
		startMenuPanel.setMinimumSize(new Dimension(700, 500) ); // NOT SURE IF THIS LINE IS NEEDED
		startMenuPanel.setBackground(Color.BLACK);
		
		// Creating some JLabels
		titleLabel = new JLabel();
		titleLabel.setText("Still Untitled Game");
		titleLabel.setFont(primaryFont);
		titleLabel.setForeground(Color.WHITE);
		fillerLabelTop = new JLabel();
		fillerLabelMiddle = new JLabel();
		fillerLabelBottom = new JLabel();

		// Creating some buttons
		startButton = new JButton();
		startButton.addActionListener(gButtonHandler);
		startButton.setActionCommand("Start");
		startButton.setText("START");
		startButton.setForeground(Color.WHITE);
		startButton.setBackground(Color.DARK_GRAY);
		startButton.setContentAreaFilled(false); // Makes the button transparent - except the text - leaving the button colored for now, it is confusing without it
//		startButton.setBorderPainted(false); // Removes the clicking animation - the thin white line around the box - leaving the box for now, it is confusing without it
		loadGameButton = new JButton();
		loadGameButton.addActionListener(gButtonHandler);
		loadGameButton.setActionCommand("Load");
		loadGameButton.setText("LOAD GAME");
		loadGameButton.setForeground(Color.WHITE);
		loadGameButton.setBackground(Color.DARK_GRAY);
		loadGameButton.setContentAreaFilled(false); // Makes the button transparent - except the text - leaving the button colored for now, it is confusing without it
//		loadGameButton.setBorderPainted(false); // Removes the clicking animation - the thin white line around the box - leaving the box for now, it is confusing without it
		
		// Adding components to startMenuPanel
		gBC.gridx = 0;
		gBC.gridy = 1;
		gBC.weighty = 1;
		gBC.anchor = GridBagConstraints.NORTH;
		startMenuPanel.add(titleLabel, gBC);
		gBC.gridx = 0;
		gBC.gridy = 0;
		gBC.weighty = 1;
//		gBC.fill = GridBagConstraints.REMAINDER;
		startMenuPanel.add(fillerLabelTop, gBC);
		gBC.gridx = 0;
		gBC.gridy = 2;
		gBC.weighty = 1;
//		gBC.fill = GridBagConstraints.REMAINDER;
		startMenuPanel.add(fillerLabelMiddle, gBC);
		gBC.gridx = 0;
		gBC.gridy = 5;
		gBC.weighty = 1;
//		gBC.fill = GridBagConstraints.REMAINDER;
		startMenuPanel.add(fillerLabelBottom, gBC);
		gBC.gridx = 0;
		gBC.gridy = 3;
		gBC.weighty = 0;
		startMenuPanel.add(startButton, gBC);
		gBC.gridx = 0;
		gBC.gridy = 4;
		gBC.weighty = 0;
		startMenuPanel.add(loadGameButton, gBC);
		
		// ADDING THE REMAINING ITEMS TO THE FRAME
		primaryGameFrame.setContentPane(startMenuPanel);
		primaryGameFrame.pack();
		primaryGameFrame.setVisible(true);
		
	}
	
	public void createMainGameWindow(GeneralButtonHandler gButtonHandler, GameplayButtonHandler gPBHandler) {
		
		GridBagConstraints primaryGBC = new GridBagConstraints(); // Making the constraints for GBL - this creates a new instance of GridBagConstraints
		
		primaryMainGamePanel = new JPanel();
		primaryMainGamePanel.setLayout(new GridBagLayout() );
		primaryMainGamePanel.setPreferredSize(new Dimension(700, 500) ); 
		primaryMainGamePanel.setMinimumSize(new Dimension(700, 500) ); // NOT SURE IF I NEED THIS LINE
		
		// BUILDING PRIMARY GAMEPLAY PANEL - panel1
		mainGamePanel1 = new JPanel();
		mainGamePanel1.setBackground(Color.BLACK);
		mainGamePanel1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1) ); // Adding a border to panel1 - this adds a border and sets the color and width of the border.
		primaryGBC.gridx = 1; // Setting the x-location of the panel1 object within the primaryPanel object
		primaryGBC.gridy = 1; // Setting the y-location of the panel1 object within the primaryPanel object
		primaryGBC.gridwidth = 1; // Setting the number of cells of the GBL grid in the x-direction that panel1 will take up
		primaryGBC.gridheight = 1; // Setting the number of cells of the GBL grid in the y-direction that panel1 will take up
		primaryGBC.weightx = 1; // Still don't fully understand this line
		primaryGBC.weighty = 1; // Still don't fully understand this line ************************
		primaryGBC.fill = GridBagConstraints.BOTH; // Setting the panel to expand in both the x and y-directions to fill any extra space in the parent/super-container
		primaryMainGamePanel.add(mainGamePanel1, primaryGBC); 
		
		// BUILDING SOME BUTTONS
		// Create inventoryButton
		inventoryButton = new JButton();
		inventoryButton.setText("Inventory");
//		button1.setContentAreaFilled(false); // Makes the button transparent - except the text - leaving the button colored for now, it is confusing without it
//		button1.setBorderPainted(false); // Removes the clicking animation - the thin white line around the box - leaving the box for now, it is confusing without it
		inventoryButton.setForeground(Color.WHITE);
		inventoryButton.setBackground(Color.DARK_GRAY);
		inventoryButton.setPreferredSize(panel2ButtonDimension); // This works for setting the size when it's container is using GridBagLayout and .pack()
		inventoryButton.setMaximumSize(panel2ButtonDimension); // I don't think this makes a difference or affects anything under the current setup
		// Creating mapButton
		mapButton = new JButton();
		mapButton.setForeground(Color.WHITE);
		mapButton.setBackground(Color.DARK_GRAY);
		mapButton.setText("Map");
		mapButton.setVerticalAlignment(JLabel.CENTER); // Centering the JLabel text in the vertical direction
		mapButton.setHorizontalAlignment(JLabel.CENTER); // Centering the JLabel text in the horizontal direction
		mapButton.setOpaque(true); // Label must be opaque to have it's background color changed - default opaqueness is "false"
		mapButton.setPreferredSize(panel2ButtonDimension); // This works for setting the size when it's container is using GridBagLayout and .pack()
		mapButton.setMaximumSize(panel2ButtonDimension); // I don't think this makes a difference or affects anything under the current setup
		// Creating exitButton
		exitButton = new JButton();
		exitButton.setForeground(Color.WHITE);
		exitButton.setBackground(Color.DARK_GRAY);
		exitButton.setText("Quit Game");
		exitButton.setVerticalAlignment(JLabel.CENTER); // Centering the JLabel text in the vertical direction
		exitButton.setHorizontalAlignment(JLabel.CENTER); // Centering the JLabel text in the horizontal direction
		exitButton.setOpaque(true); // Label must be opaque to have it's background color changed - default opaqueness is "false"
		exitButton.setPreferredSize(panel2ButtonDimension); // This works for setting the size when it's container is using GridBagLayout and .pack()
		exitButton.setMaximumSize(panel2ButtonDimension); // I don't think this makes a difference or affects anything under the current setup
		exitButton.addActionListener(gButtonHandler);
		exitButton.setActionCommand("Exit");
		// Creating Gameplay Button gPButton1
		gPButton1 = new JButton();
		gPButton1.addActionListener(gPBHandler);
		gPButton1.setActionCommand("gPButton1");
		gPButton1.setForeground(Color.WHITE);
		gPButton1.setBackground(Color.DARK_GRAY);
		gPButton1.setText(" ");
		gPButton1.setPreferredSize(panel1ButtonDimension);
		gPButton1.setMaximumSize(panel1ButtonDimension);
		gPButton1.setVerticalAlignment(JButton.CENTER);
		gPButton1.setHorizontalAlignment(JButton.CENTER);
		gPButton1.addActionListener(gButtonHandler);
		gPButton1.setActionCommand("gPButton1");
		// Creating Gameplay Button gPButton2
		gPButton2 = new JButton();
		gPButton2.addActionListener(gPBHandler);
		gPButton2.setActionCommand("gPButton2");
		gPButton2.setForeground(Color.WHITE);
		gPButton2.setBackground(Color.DARK_GRAY);
		gPButton2.setText(" ");
		gPButton2.setPreferredSize(panel1ButtonDimension);
		gPButton2.setMaximumSize(panel1ButtonDimension);
		gPButton2.setVerticalAlignment(JButton.CENTER);
		gPButton2.setHorizontalAlignment(JButton.CENTER);
		gPButton2.addActionListener(gButtonHandler);
		gPButton2.setActionCommand("gPButton2");
		// Creating Gameplay Button gPButton3
		gPButton3 = new JButton();
		gPButton3.addActionListener(gPBHandler);
		gPButton3.setActionCommand("gPButton3");
		gPButton3.setForeground(Color.WHITE);
		gPButton3.setBackground(Color.DARK_GRAY);
		gPButton3.setText(" ");
		gPButton3.setPreferredSize(panel1ButtonDimension);
		gPButton3.setMaximumSize(panel1ButtonDimension);
		gPButton3.setVerticalAlignment(JButton.CENTER);
		gPButton3.setHorizontalAlignment(JButton.CENTER);
		gPButton3.addActionListener(gButtonHandler);
		gPButton3.setActionCommand("gPButton3");
		// Creating Gameplay Button gPButton4
		gPButton4 = new JButton();
		gPButton4.addActionListener(gPBHandler);
		gPButton4.setActionCommand("gPButton4");
		gPButton4.setForeground(Color.WHITE);
		gPButton4.setBackground(Color.DARK_GRAY);
		gPButton4.setText(" ");
		gPButton4.setPreferredSize(panel1ButtonDimension);
		gPButton4.setMaximumSize(panel1ButtonDimension);
		gPButton4.setVerticalAlignment(JButton.CENTER);
		gPButton4.setHorizontalAlignment(JButton.CENTER);
		gPButton4.addActionListener(gButtonHandler);
		gPButton4.setActionCommand("gPButton4");
		
		// BUILDING SOME LABELS
		// Creating hPLabel
		hPLabel = new JLabel();
		hPLabel.setText("HP: ");
		hPLabel.setForeground(Color.WHITE);
		hPLabel.setVerticalAlignment(JLabel.CENTER); // Centering the JLabel text in the vertical direction
		hPLabel.setHorizontalAlignment(JLabel.LEFT); // Centering the JLabel text in the horizontal direction
		hPLabel.setPreferredSize(new Dimension(150, 20) ); // This works for setting the size when it's container is using GridBagLayout and .pack()
		hPLabel.setMaximumSize(new Dimension(150, 20) ); // I don't think this makes a difference or affects anything under the current setup
		// Creating fillerLabel1
		fillerLabel1 = new JLabel();
		// Creating fillerLabel2 - NOTE: USED FOR SETTING THE WIDTH OF internalPanel1
		fillerLabel2 = new JLabel();
		fillerLabel2.setText(" ");
		fillerLabel2.setOpaque(true);
		fillerLabel2.setBackground(Color.BLACK);
		fillerLabel2.setPreferredSize(internalPanelFillerLabelDimension);
		// Creating fillerLabel3
		fillerLabel3 = new JLabel();
		fillerLabel3.setText(" ");
		fillerLabel3.setOpaque(true);
		fillerLabel3.setBackground(Color.BLACK);
		fillerLabel3.setPreferredSize(internalPanelFillerLabelDimension);
		// Creating westFillerLabel
		westFillerLabel = new JLabel();
		// Creating eastFillerLabel
		eastFillerLabel = new JLabel();
		// Creating notificationLabel1
		notifictaionLabel1 = new JLabel();
		notifictaionLabel1.setText("This panel intentionally left blank.");
		notifictaionLabel1.setForeground(Color.WHITE);
		notifictaionLabel1.setPreferredSize(new Dimension(500, 50) );
		notifictaionLabel1.setHorizontalAlignment(JLabel.CENTER);
		notifictaionLabel1.setVerticalAlignment(JLabel.CENTER);
		//Creating some gameTextLabels to provide output from the game
		// Creating gameTextLabel1
		gameTextLabel1 = new JLabel();
		gameTextLabel1.setText(" ");
		gameTextLabel1.setOpaque(true);
		gameTextLabel1.setBackground(Color.BLACK);
		gameTextLabel1.setForeground(Color.WHITE);
		gameTextLabel1.setHorizontalAlignment(JLabel.CENTER);
		gameTextLabel1.setVerticalAlignment(JLabel.CENTER);
		// Creating gameTextLabel2
		gameTextLabel2 = new JLabel();
		gameTextLabel2.setText(" ");
		gameTextLabel2.setOpaque(true);
		gameTextLabel2.setBackground(Color.BLACK);
		gameTextLabel2.setForeground(Color.WHITE);
		gameTextLabel2.setHorizontalAlignment(JLabel.CENTER);
		gameTextLabel2.setVerticalAlignment(JLabel.CENTER);
		// Creating gameTextLabel3
		gameTextLabel3 = new JLabel();
		gameTextLabel3.setText(" ");
		gameTextLabel3.setOpaque(true);
		gameTextLabel3.setBackground(Color.BLACK);
		gameTextLabel3.setForeground(Color.WHITE);
		gameTextLabel3.setHorizontalAlignment(JLabel.CENTER);
		gameTextLabel3.setVerticalAlignment(JLabel.CENTER);
		// Creating gameTextLabel4
		gameTextLabel4 = new JLabel();
		gameTextLabel4.setText(" ");
		gameTextLabel4.setOpaque(true);
		gameTextLabel4.setBackground(Color.BLACK);
		gameTextLabel4.setForeground(Color.WHITE);
		gameTextLabel4.setHorizontalAlignment(JLabel.CENTER);
		gameTextLabel4.setVerticalAlignment(JLabel.CENTER);
		// Creating gameTextLabel5
		gameTextLabel5 = new JLabel();
		gameTextLabel5.setText(" ");
		gameTextLabel5.setOpaque(true);
		gameTextLabel5.setBackground(Color.BLACK);
		gameTextLabel5.setForeground(Color.WHITE);
		gameTextLabel5.setHorizontalAlignment(JLabel.CENTER);
		gameTextLabel5.setVerticalAlignment(JLabel.CENTER);
		
		// BUILDING TEXT LABELS
		primaryGameText = new JTextArea();
		primaryGameText.setText("BLANK");
		primaryGameText.setOpaque(true);
		primaryGameText.setFont(secondaryFont);
		primaryGameText.setForeground(Color.WHITE);
		primaryGameText.setBackground(Color.BLACK);
		primaryGameText.setLineWrap(true);
		primaryGameText.setWrapStyleWord(true);
		
		// BUILDING STATS PANEL - panel2
		mainGamePanel2 = new JPanel(new GridBagLayout() );
		mainGamePanel2.setBackground(Color.BLACK);
		mainGamePanel2.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1) ); // Adding a border
		
		// BUILDING INTERNAL PANEL 1 - internalPanel1
		internalPanel1 = new JPanel(new GridBagLayout() );
		internalPanel1.setBackground(Color.BLACK);
//		internalPanel1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3) );
		
		// ************************
		// KEEP THIS THING CLEAN!!!
		// ************************
		
		// Adding button 1 to panel 2
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 0;
		primaryGBC.anchor = GridBagConstraints.NORTH; // THIS STATEMENT AND THE ONE BELOW ARE THE CULPRITS FOR SETTING THE PROPER ALIGNMENT OF THE COMPONENTS IN THE CONTAINER. LABEL1, LABEL2, AND BUTTON1 ALL HAVE A SET OF THESE.
		primaryGBC.fill = GridBagConstraints.HORIZONTAL; // THIS STATEMENT MATCHES THE NOTE ABOVE
		mainGamePanel2.add(inventoryButton, primaryGBC); // Adding button 1 to panel 2
		// Adding mapButton to panel 2
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 1;
		primaryGBC.anchor = GridBagConstraints.NORTH; // Tells the component to go to the top of the container - component must have it's fill set to NONE or it will fill the entire container - the weight of the component in the directon of alignment must be at least 1
		primaryGBC.fill = GridBagConstraints.HORIZONTAL; // Tells the component not to resize to fill it's container
		mainGamePanel2.add(mapButton, primaryGBC);
		// Adding hPLabel to panel 2
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 2;
		primaryGBC.anchor = GridBagConstraints.NORTH; // Tells the component to go to the top of the container - component must have it's fill set to NONE or it will fill the entire container - the weight of the component in the directon of alignment must be at least 1
		primaryGBC.fill = GridBagConstraints.NONE; // Tells the component not to resize to fill it's container
		mainGamePanel2.add(hPLabel, primaryGBC);
		// Adding filler label
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 3;
		primaryGBC.weighty = 400;
		primaryGBC.anchor = GridBagConstraints.NORTH; // Tells the component to go to the top of the container - component must have it's fill set to NONE or it will fill the entire container - the weight of the component in the directon of alignment must be at least 1
		primaryGBC.fill = GridBagConstraints.REMAINDER; // Tells the component not to resize to fill it's container
		mainGamePanel2.add(fillerLabel1, primaryGBC);
		// Adding exit game button
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 4;
		primaryGBC.anchor = GridBagConstraints.SOUTH; // Tells the component to go to the top of the container - component must have it's fill set to NONE or it will fill the entire container - the weight of the component in the directon of alignment must be at least 1
		primaryGBC.fill = GridBagConstraints.NONE; // Tells the component not to resize to fill it's container
		mainGamePanel2.add(exitButton, primaryGBC);
		// ***Adding panel 2 to primary panel***
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 0;
		primaryGBC.gridwidth = 1;
		primaryGBC.gridheight = 2;
		primaryGBC.weightx = 0;
		primaryGBC.weighty = 0;
		primaryGBC.fill = GridBagConstraints.VERTICAL;
		primaryMainGamePanel.add(mainGamePanel2, primaryGBC);
		
		// BUILDING SETTINGS, INVENTORY, ETC. PANEL - panel3 - *** NOT CURRENTLY IN THE GAME ***
		mainGamePanel3 = new JPanel();
		mainGamePanel3.setBackground(Color.BLACK);
		mainGamePanel3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1) ); // Adding a border
		primaryGBC.gridx = 1;
		primaryGBC.gridy = 0;
		primaryGBC.gridwidth = 0;
		primaryGBC.gridheight = 1;
		primaryGBC.weightx = 0;
		primaryGBC.weighty = 0;
		primaryGBC.fill = GridBagConstraints.HORIZONTAL;
		mainGamePanel3.add(notifictaionLabel1);
//		primaryMainGamePanel.add(mainGamePanel3, primaryGBC);
		
		// ADDING COMPONENTS TO PANEL1
		// Adding primaryGameText text area
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 0;
		primaryGBC.anchor = GridBagConstraints.NORTH;
		primaryGBC.fill = GridBagConstraints.HORIZONTAL;
		internalPanel1.add(primaryGameText, primaryGBC);
		// Adding fillerLabel3
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 1;
		primaryGBC.fill = GridBagConstraints.HORIZONTAL;
		internalPanel1.add(fillerLabel3, primaryGBC);
		// Adding gameTextLabel1
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 2;
		primaryGBC.fill = GridBagConstraints.HORIZONTAL;
		internalPanel1.add(gameTextLabel1, primaryGBC);
		// Adding gameTextLabel2
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 3;
		primaryGBC.fill = GridBagConstraints.HORIZONTAL;
		internalPanel1.add(gameTextLabel2, primaryGBC);
		// Adding gameTextLabel3
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 4;
		primaryGBC.fill = GridBagConstraints.HORIZONTAL;
		internalPanel1.add(gameTextLabel3, primaryGBC);
		// Adding gameTextLabel4
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 5;
		primaryGBC.fill = GridBagConstraints.HORIZONTAL;
		internalPanel1.add(gameTextLabel4, primaryGBC);
		// Adding gameTextLabel5
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 6;
		primaryGBC.fill = GridBagConstraints.HORIZONTAL;
		internalPanel1.add(gameTextLabel5, primaryGBC);
		// Adding fillerLabel2
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 7;
		primaryGBC.fill = GridBagConstraints.HORIZONTAL;
		internalPanel1.add(fillerLabel2, primaryGBC);
		// Adding gPButton1
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 8;
		primaryGBC.fill = GridBagConstraints.NONE;
		internalPanel1.add(gPButton1, primaryGBC);
		// Adding gPButton2
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 9;
		primaryGBC.fill = GridBagConstraints.NONE;
		internalPanel1.add(gPButton2, primaryGBC);
		// Adding gPButton3
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 10;
		primaryGBC.fill = GridBagConstraints.NONE;
		internalPanel1.add(gPButton3, primaryGBC);
		// Adding gPButton4
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 11;
		primaryGBC.fill = GridBagConstraints.NONE;
		internalPanel1.add(gPButton4, primaryGBC);
		// Adding fillerLabel3 as west buffer/filler
		primaryGBC.gridx = 0;
		primaryGBC.gridy = 0;
		primaryGBC.weightx = 1000;
		primaryGBC.weighty = 1000;
		primaryGBC.anchor = GridBagConstraints.WEST; // Tells the component to go to the top of the container - component must have it's fill set to NONE or it will fill the entire container - the weight of the component in the directon of alignment must be at least 1
		primaryGBC.fill = GridBagConstraints.BOTH; // Tells the component not to resize to fill it's container
		mainGamePanel1.add(westFillerLabel, primaryGBC);
		// Setting up and adding internalPanel1 to mainGamePanel
		primaryGBC.gridx = 1;
		primaryGBC.gridy = 0;
//		primaryGBC.gridheight = 1;
		primaryGBC.fill = GridBagConstraints.BOTH;
		mainGamePanel1.add(internalPanel1, primaryGBC);
		// Adding fillerLabel4 as east buffer/filler
		primaryGBC.gridx = 2;
		primaryGBC.gridy = 0;
		primaryGBC.weightx = 1000;
		primaryGBC.weighty = 1000;
		primaryGBC.anchor = GridBagConstraints.EAST; // Tells the component to go to the top of the container - component must have it's fill set to NONE or it will fill the entire container - the weight of the component in the directon of alignment must be at least 1
		primaryGBC.fill = GridBagConstraints.BOTH; // Tells the component not to resize to fill it's container
		mainGamePanel1.add(eastFillerLabel, primaryGBC);
		
		// Making stuff visible
		primaryMainGamePanel.setVisible(true);
		mainGamePanel1.setVisible(true);
		mainGamePanel2.setVisible(true);
		
		// Hiding stuff
		gameTextLabel1.setVisible(false);
		gameTextLabel2.setVisible(false);
		gameTextLabel3.setVisible(false);
		gameTextLabel4.setVisible(false);
		gameTextLabel5.setVisible(false);
		gPButton1.setVisible(false);
		gPButton2.setVisible(false);
		gPButton3.setVisible(false);
		gPButton4.setVisible(false);
		
		// ADDING REMAINING ITEMS TO THE FRAME
		primaryGameFrame.setContentPane(primaryMainGamePanel); // NOT SURE IF I SHOULD USE THIS OR ADD
		
		primaryGameFrame.pack();
		primaryGameFrame.setVisible(true);
	}


}
