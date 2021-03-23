import java.util.*;

public class Shopping {

	// storage for an arbitrary nu,ber of items
	private ArrayList<String> shoppingList;

	// initialise the shopping class
	public Shopping() {

		shoppingList = new ArrayList<String>();

	}

	// add an item to the list
	public void addItem(String item) {
		shoppingList.add(item);
	}

	// return the size of the array
	public int length() {
		return shoppingList.size();
	}

}