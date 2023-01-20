
/**
* Megha Gaitonde
* Jan 19 2023
* Party Planner
* this file has all the mthods that are called 
* it has the add new person method, search person, assign tables, look up one table, and view party roster
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File; // Import the File class
import java.io.FileNotFoundException;

public class Party {

  Person[][] tabSet;
  public ArrayList<Person> namesList = new ArrayList<Person>();
  // make an array list for each table

  public int table = 10;
  public int numppl = 10;
  public int numgleft = 10;
  public int tablepos = 10;

  /*
   * add person method - this method prompts users if they choose to add a new person to the roster
* it take in the info and should not allow them to add the user if there is already 10 ppl of that company - counter starts at 0 and everytime there is already a person wtih that comapny id it adds to the counter 
   * if the counter is above 10 at the end then it will not add the person
if everything is good then it will create a new person object with their info
   */
  public void addPerson() { 
    for (int i = 0; i <= numgleft; i++) { // for loop that will stop after 10 guests

      Scanner scan = new Scanner(System.in);

      int countg = 0;
      System.out.print("Enter the first name of the guest:");
      String first = scan.nextLine();
      System.out.print("Enter the last name of the guest: ");
      String last = scan.nextLine();
      System.out.print("What company is this guest from (1-15): ");
      int company = scan.nextInt();

      for (Person guest : namesList) {
        if (guest.getComp() == company) {
          countg++;
        } // close if
      } // close for each
      if (countg > 10) {
        System.out.println(
            "Sorry but we can't add that guest. There are already 10 people from that company attending this party.");
      } // close if
      else {
        int ID = i + 101;

        System.out.println("They have been added to the guest list!");
        i++;

        namesList.add(new Person(ID, last, first, company));
      } // closer else
    } // close if yes
    // else {
    // break;
  }// clsoe if yes

  // have to add something here that will chick to make sure not more than 10 ppl
  // per company
  // go through each person in array list and make a counter starting with 0
  // add to counter everytime that number is seen and if number come more than 10
  // times then print out that we cannot add that person

  /*
 the look person method - this method will prompt the user for the first name of the person they are looking for and then report back the info of that person
  */

  public void lookPerson() {
    Scanner scan = new Scanner(System.in);
    System.out.print("What is their first name: ");
    String search = scan.nextLine();
    for (Person guest : namesList) {
      if (guest.getFName().equals(search)) {
        System.out.print(guest); // need to find a way to also print out table number and position
      } // clsoe if search
    } // close for
    // close if
  } // close look person

  /*
method to load the data file into the program and also parse and put it into an array list (namesList) as it reads every line
  */

  public void loadFile() {
    try {
      File myObj = new File("Names.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] arr = data.split(",");
        // creates arr with data
        namesList.add(new Person(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3])));

      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  } // close load

  // need to add 2d aray - 10 x 10 10 seats across by 10 tables down
  // manually put in the person id at each seat
  // then get id of each person in array list and if it matches what im looking
  // for then add it to the table

  /*
set up method will create the 2d array that will represent the 10 tables and 10 table positions and populate it with the Person objects
  */

  public void SetUp() {
    // make 2d array with 10 tables 10 tables
    int i = 0; // starting with 0 (first) in array list

    tabSet = new Person[table][tablepos];
    for (int s = 0; s < tablepos; s++) { // change these
      for (int t = 0; t < table; t++) {
        // while size of arraylist is > (s+1)*10+(t+1)
        // System.out.print(namesList.size());
        // while( ((s+1)*10+(t+1))<=namesList.size() ) {
        tabSet[t][s] = namesList.get(i); // get ID of the person in the array list and assign that to the spot in the
                                         // array
        // could modify their table and seat id of person class
        // namesList.get(i).setTable(t)
        // public set table takes integer and sets in instance variable
        i++;
        // add to the array list of that table
        // }// close while

        // if (tabSet[0][y+1] != namesList.get(i).getComp()) {
        // table1List.add(); // get name
        // remove them from array (this table)

        // if table itterate by one and get companies = same then remove it
      } // close tablepos for
    } // clsoe table for

  } // close forpubli
  // System.out.print(namesList.get(tabSet[2][2]));
  // close set up

  // public void printTable() {
  // could ask use what table they want to print
  // for (int j=0; j<10; j++) {
  // System.out.println(tabSet[2][j]); // adn sotre as varaibela dna put in first
  // one as avariable -1

  /*
  print all tables method will print the 10 tables and each person in it while also printing seat number in front of each person
It itterates through and for each table number goes through all the people in it and prints them
  */

  public void printAllTables() {
    for (int k = 0; k < 10; k++) {
      System.out.println("\nTable: " + (k + 1));
      for (int j = 0; j < 10; j++) {
        System.out.print("Seat " + (j + 1) + ") ");
        System.out.println(tabSet[k][j]); // adn sotre as varaibela dna put in first one as avariable -1
      }
      System.out.print("\n");
    } // close
  }

  /*
ask table will ask the user what table they want to look up the roster for and based on that print out the table and all its people and their seats
  */

  public void askTable() { // need to debug
    // could ask use what table they want to print
    System.out.print("What table would you like to look up: ");
    Scanner scan = new Scanner(System.in);
    int tab = scan.nextInt();
    System.out.println("\nTable: " + tab);
    for (int j = 0; j < 10; j++) {
      System.out.print("Seat " + (j + 1) + ") ");
      System.out.println(tabSet[tab - 1][j]); // adn sotre as varaibela dna put in first one as avariable -1
    } // close ask table
  } // close ask table

  // can you follow @murphy.luath on insta?

  /*
get full list method - prints the full array list of guests 
  */
  public void getFullList() {
    for (Person guests : namesList) {
      System.out.println("\n" + guests);
    } // close for

  } // close full list

  public void compRoster() {
    System.out.print("");
    System.out.print("What Company would you like to print a roster for (1-15): ");
      Scanner scan = new Scanner(System.in);
    int comproster = scan.nextInt();
    System.out.println("Here is all the atendees from company " + comproster);  
    for(Person guest: namesList) {
      if(guest.getComp() ==(comproster)) {
 
      System.out.println("\n" + guest.getName());
      } // close if
    } // close for
  } // close comp roster

  // for(int i=0; i<=table; i++) {
  // if(tabset[i][0] = namesList.get(i).getComp()); // want to go trough each
  // table and get the comp for each and see if its the same as the one next to it


  // close assign guest

  // then do 2d array to desgin table and place at table

} // close party class