package package02;

public class Player {

	int[][] inventory;
	
	public Player() {
		
		inventory = new int[7][2]; // Array has a slot (sub-array) for each item and one slot for gold. Each sub-array has a slot for a 0 or 1 that indicates if the item is possessed or not and a slot for how may of the item the player has. 
	}

}
