import java.util.ArrayList;
import java.util.Scanner;
import java.io.File; // Import the File class
import java.io.FileNotFoundException;

public class Party {

  Person[][] tabSet;
  public ArrayList<Person> namesList = new ArrayList<Person>();
  // make an array list for each table 
  public ArrayList<String> table1List = new ArrayList<String>();
  public ArrayList<String> table2List = new ArrayList<String>(); 
  public ArrayList<String> table3List = new ArrayList<String>();
  public ArrayList<String> table4List = new ArrayList<String>();
  public ArrayList<String> table5List = new ArrayList<String>(); 
    

  public int table = 10;
  public int numppl = 10;
  public int numgleft = 10;
  public int tablepos = 10;
   

  public void addPerson() {
   for (int i =0; i<=numgleft; i++) { // for loop that will stop after 10 guests
      
      Scanner scan = new Scanner(System.in);
    
         int countg = 0;
        System.out.print("Enter the first name of the guest:");
        String first = scan.nextLine();
        System.out.print("Enter the last name of the guest: ");
        String last = scan.nextLine();
        System.out.print("What company is this guest from (1-15): ");
        int company = scan.nextInt();
        
        for(Person guest: namesList) {
          if(guest.getComp() == company) {
            countg++;
          } // close if
        } // close for each
          if (countg > 10) {
            System.out.println("Sorry but we can't add that guest. There are already 10 people from that company attending this party.");
        } // close if
        else{
        int ID = i+101;
        
          System.out.println("They have been added to the guest list!");
        i++;
        
        namesList.add(new Person(ID, last, first, company));
        } // closer else 
      } // close if yes
     //else {
      // break;
     }// clsoe if yes
        
        // have to add something here that will chick to make sure not more than 10 ppl per company
    // go through each person in array list and make a counter starting with 0
    // add to counter everytime that number is seen and if number come more than 10 times then print out that we cannot add that person

    

  

  public void lookPerson() {
    Scanner scan = new Scanner(System.in);
      System.out.print("What is their first name: ");
      String search = scan.nextLine();
      for (Person guest: namesList) {
        if(guest.getFName().equals(search)) {
         System.out.print(guest); 
        } // clsoe if search 
      } // close for 
     // close if 
  } // close look person

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
  //
  public void SetUp() {
    // make 2d array with 10 tables 10 tables 
    int i = 0; // starting with 0 (first) in array list  
    
    tabSet = new Person[table][tablepos];
    for (int s = 0; s<tablepos; s++) { // change these 
      for (int t = 0; t<table; t++) {
       //while size of arraylist is > (s+1)*10+(t+1)
       // System.out.print(namesList.size());
        //while( ((s+1)*10+(t+1))<=namesList.size() ) {
            tabSet[t][s] = namesList.get(i); // get ID of the person in the array list and assign that to the spot in the array 
        //could modify their table and seat id of person class
        //namesList.get(i).setTable(t)
        // public set table takes integer and sets in instance variable 
            i++;
           // add to the array list of that table 
       // }// close while

        
        //if (tabSet[0][y+1] != namesList.get(i).getComp()) {
        //  table1List.add(); // get name 
          // remove them from array (this table)
        

        // if table itterate by one and get companies = same then remove it 
      } // close tablepos for 
    } // clsoe table for 

  
      
    } // close forpubli
   // System.out.print(namesList.get(tabSet[2][2]));
     // close set up 

//public void printTable() {
  // could ask use what table they want to print
   // for (int j=0; j<10; j++) {
    //  System.out.println(tabSet[2][j]); // adn sotre as varaibela dna put in first one as avariable -1
   
public void printAllTables() {
for (int k=0; k<10; k++) {
    System.out.println("\nTable: " + (k+1));
    for (int j=0; j<10; j++) {
      System.out.print("Seat " + (j+1) + ") ");
      System.out.println(tabSet[k][j]); // adn sotre as varaibela dna put in first one as avariable -1
    } 
  System.out.print("\n");
}// close
}
  public void askTable() { // need to debug
    // could ask use what table they want to print
    System.out.print("What table would you like to look up: ");
    Scanner scan = new Scanner(System.in);
    int tab = scan.nextInt();
    System.out.println("\nTable: " + tab);
    for (int j=0; j<10; j++) {
      System.out.print("Seat " + (j+1) + ") ");
      System.out.println(tabSet[tab-1][j]); // adn sotre as varaibela dna put in first one as avariable -1
  } // close ask table 
  } // close ask table
 
//can you follow @murphy.luath on insta?

 public void getFullList() {
    for(Person guests: namesList) {
      System.out.println("\n" + guests);
    }// close for
    
  } // close full list
    
 

   // for(int i=0; i<=table; i++) {
    // if(tabset[i][0] = namesList.get(i).getComp()); // want to go trough each table and get the comp for each and see if its the same as the one next to it

  // print guest method that will print the guest array list 
   public void printGuest() {
     System.out.print(namesList);
   }   
    
   
  // close assign guest

  // then do 2d array to desgin table and place at table

} // close party class