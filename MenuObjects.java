package ExrionsLibrary;

import java.util.ArrayList;

/**
* MenuObjects stores ArrayLists of menus to be printed.
* Personal property of Titus Lim (Exrion)
*
* @author  Titus Lim
* @version 1.0
* @since   2021-05-17
*/

public class MenuObjects {
	private static ArrayList<String> optionList = new ArrayList<String>();
	/**
	* Adds an option to the stored ArrayList
	* @param option : String value to be stored in the ArrayList
	*/
	public static void addOption(String option) {
		optionList.add(new String(option));
	}

	/**
	* Returns the stored ArrayList
	*/
	public ArrayList<String> getOptionList() {
		return optionList;
	}
}
