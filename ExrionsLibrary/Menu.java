package ExrionsLibrary;

import java.util.ArrayList;

/**
* Menu helps to create menu driven programmes easily without typing it out all the time. 
* Personal property of Titus Lim (Exrion)
*
* @author  Titus Lim
* @version 1.0
* @since   2021-05-17
*/

public class Menu {	
	/**
	* Prints a menu
	* @param menu : An ArrayList, preferably from MenuObjects that holds the Strings to be printed
	* @param title : The main title of the menu
	*/
	public static void printMenu(ArrayList<String> menu, String title) {
		Helper.line(40, "=");
		System.out.println(title);
		Helper.line(40, "=");
		for(int i = 0; i < menu.size(); i++) {
			System.out.printf("%d. %s\n", i + 1, menu.get(i));
		}
		Helper.line(40, "-");
	}
}
