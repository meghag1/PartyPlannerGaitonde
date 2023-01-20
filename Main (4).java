/**
* Megha Gaitonde
* Jan 19 2023
* Party Planner
* Main file that will call the methods based on the main user prompt/s
*/






// 100 ppl and 10 tables each seating 10 ppl and 16 companies total 
// array - people fixed at table 
// csv or txt file (copy names)
// check theres no more than 10 ppl from a company
// allow extra ppl to attend (10) - add them
//place ppl at tables
//methods to print roster
//getter method to find a person and their table #

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errorsx
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

class Main {

  public static void main(String[] args) {

    Party p1 = new Party();

    p1.loadFile();
    //welcome prompt to user and asking them for options
    System.out.println("Hello, Welcome to the Party Planner!");
    System.out.print(
        "Would you like to... 1) View the current party roster, 2) Look up a table roster, 3) View the current party guest list, 4) Search up a party guest, 5) Add a party guest, 6) Print roster by company: ");
    Scanner scan = new Scanner(System.in);
    String res1 = scan.nextLine();

    // need to add some sort of functionality that will allow the methods to come back to the main question above after it finishes instead of just terminating

    /*
if statements that will call the methods from part based on what they choose
    */
    if (res1.equals("1")) {
      p1.SetUp();
      p1.printAllTables();

    }
    // close if 1

    if (res1.equals("2")) {
      p1.SetUp();
      p1.askTable();
    } // close if 2

    if (res1.equals("3")) {
      p1.getFullList();

    } // close if 3

    if (res1.equals("4")) {
      p1.lookPerson();
    } // close if 4

    if (res1.equals("5")) {
      p1.addPerson();
    } // close if 5

    if (res1.equals("6")) {
      p1.compRoster();

    } // close if 6
  } // clsoe main method
}
// close main
