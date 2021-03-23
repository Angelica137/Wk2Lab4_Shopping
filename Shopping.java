import java.net.PasswordAuthentication;
import java.util.*;

public class Shopping {

	// storage for an arbitrary nu,ber of items
	private ArrayList<String> shoppingList;

	// initialise the shopping class
	public Shopping() {

		shoppingList = new ArrayList<String>();

	}

	// add an item to the list
	public void addItem(String celeb) {
		shoppingList.add(celeb);
	}

	// return the size of the array
	public int numberOfItems() {
		return shoppingList.size();
	}

	// display one iteam in a given index
	public void showItem(int itemNumber) {

		if (itemNumber < 0) {
			// pass
		} else if (itemNumber < numberOfItems()) {
			System.out.println(shoppingList.get(itemNumber));

		} else {
			System.out.println("This item does not exist");
		}

	}

	// print contents of array
	public void showList() {
		int i = 0;
		while (i < shoppingList.size()) {
			System.out.println(shoppingList.get(i));
			i++;
		}
	}

}