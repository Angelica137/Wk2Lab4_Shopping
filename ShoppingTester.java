import java.util.*;

public class ShoppingTester {

	public static void main(String[] args) {

		// initialise a s hopping lsit
		Shopping s = new Shopping();
		// add chocolate to the list
		s.addItem("chocolate");
		s.addItem("wine");
		s.showList();
		s.showItem(1);

	}

}