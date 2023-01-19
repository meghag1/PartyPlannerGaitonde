import java.util.ArrayList;
import java.util.Scanner;
import java.io.File; // Import the File class
import java.io.FileNotFoundException;

public class Party {

  public ArrayList<Person> namesList = new ArrayList<Person>();

  public int table = 10;
  public int numppl = 10;
  public int add1 = 0;
  public int add2 = 0;
  public int add3 = 0;
  public int add4 = 0;
  public int add5 = 0;
  public int add6 = 0;
  public int add7 = 0;
  public int add8 = 0;
  public int add9 = 0;
  public int add10 = 0;
  public int add11 = 0;
  public int add12 = 0;
  public int add13 = 0;
  public int add14 = 0;
  public int add15 = 0;
  public int numgleft = 10;
  public int tablepos = 10;

  public void addPerson() {
    while (numgleft >= 0) {
      System.out.println("Would you like to add a new guest? (y/n)");
      Scanner scan = new Scanner(System.in);
      String answer = scan.nextLine();

      if (answer.equals("y")) {
        System.out.print("Enter the first name of the guest:");
        String first = scan.nextLine();
        System.out.print("Enter the last name of the guest: ");
        String last = scan.nextLine();
        System.out.print("What company is this guest from (1-15): ");
        int company = scan.nextInt();
        // have to add something here that will chick to make sure not more than 10 ppl
        // per company
        namesList.add(new Person(last, first, company));
      } // close if
    } // close while

  } // clsoe add person

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

  //need to add 2d aray - 10 x 10
  public void AssignGuests() {
  int guests [] [] = new int[table][tablepos];
    
  } // close assign guest 

  public void assignComp1() {
    ArrayList<String> comp1List = new ArrayList<String>();

    while (add1 <= numppl) {
      for (Person guest : namesList) { // change to for loop nameList.get(i).getComp() == nameList.get(i+1).getComp()
        if (guest.getComp() == 1) {
          comp1List.add(guest.getName());
          add1++;
        } // clsoe if
          // get company number and if comany number is not same then add to array list
      } // close for
        // 2d array with table number and name
    } // clsoe while
  }

  public void assignComp2() {
    ArrayList<String> comp2List = new ArrayList<String>();

    while (add2 <= numppl) {
      for (Person guest : namesList) { // change to for loop nameList.get(i).getComp() == nameList.get(i+1).getComp()
        if (guest.getComp() == 2) {
          comp2List.add(guest.getName());
          add2++;
        } // clsoe if
          // get company number and if comany number is not same then add to array list
      } // close for
        // 2d array with table number and name
    } // clsoe while
  }

  public void assignComp3() {
    ArrayList<String> comp3List = new ArrayList<String>();

    while (add3 <= numppl) {
      for (Person guest : namesList) { // change to for loop nameList.get(i).getComp() == nameList.get(i+1).getComp()
        if (guest.getComp() == 3) {
          comp3List.add(guest.getName());
          add3++;
        } // clsoe if
          // get company number and if comany number is not same then add to array list
      } // close for
        // 2d array with table number and name
    } // clsoe while
  }

  public void assignComp4() {
    ArrayList<String> comp4List = new ArrayList<String>();

    while (add4 <= numppl) {
      for (Person guest : namesList) { // change to for loop nameList.get(i).getComp() == nameList.get(i+1).getComp()
        if (guest.getComp() == 4) {
          comp4List.add(guest.getName());
          add4++;
        } // clsoe if
          // get company number and if comany number is not same then add to array list
      } // close for
        // 2d array with table number and name
    } // clsoe while
  }

  public void assignComp5() {
    ArrayList<String> comp5List = new ArrayList<String>();

    while (add5 <= numppl) {
      for (Person guest : namesList) { // change to for loop nameList.get(i).getComp() == nameList.get(i+1).getComp()
        if (guest.getComp() == 5) {
          comp5List.add(guest.getName());
          add5++;
        } // clsoe if
          // get company number and if comany number is not same then add to array list
      } // close for
        // 2d array with table number and name
    } // clsoe while
  } // clse method

  public void assignComp6() {
    ArrayList<String> comp6List = new ArrayList<String>();

    while (add6 <= numppl) {
      for (Person guest : namesList) { // change to for loop nameList.get(i).getComp() == nameList.get(i+1).getComp()
        if (guest.getComp() == 6) {
          comp6List.add(guest.getName());
          add6++;
        } // clsoe if
          // get company number and if comany number is not same then add to array list
      } // close for
        // 2d array with table number and name
    } // clsoe while
  }

  public void assignComp7() {
    ArrayList<String> comp7List = new ArrayList<String>();

    while (add7 <= numppl) {
      for (Person guest : namesList) { // change to for loop nameList.get(i).getComp() == nameList.get(i+1).getComp()
        if (guest.getComp() == 7) {
          comp7List.add(guest.getName());
          add7++;
        } // clsoe if
          // get company number and if comany number is not same then add to array list
      } // close for
        // 2d array with table number and name
    } // clsoe while
  }

  public void assignComp8() {
    ArrayList<String> comp8List = new ArrayList<String>();

    while (add8 <= numppl) {
      for (Person guest : namesList) { // change to for loop nameList.get(i).getComp() == nameList.get(i+1).getComp()
        if (guest.getComp() == 8) {
          comp8List.add(guest.getName());
          add8++;
        } // clsoe if
          // get company number and if comany number is not same then add to array list
      } // close for
        // 2d array with table number and name
    } // clsoe while
  }

  public void assignComp9() {
    ArrayList<String> comp9List = new ArrayList<String>();

    while (add9 <= numppl) {
      for (Person guest : namesList) { // change to for loop nameList.get(i).getComp() == nameList.get(i+1).getComp()
        if (guest.getComp() == 9) {
          comp9List.add(guest.getName());
          add9++;
        } // clsoe if
          // get company number and if comany number is not same then add to array list
      } // close for
        // 2d array with table number and name
    } // clsoe while
  }

  public void assignComp10() {
    ArrayList<String> comp10List = new ArrayList<String>();

    while (add10 <= numppl) {
      for (Person guest : namesList) { // change to for loop nameList.get(i).getComp() == nameList.get(i+1).getComp()
        if (guest.getComp() == 10) {
          comp10List.add(guest.getName());
          add10++;
        } // clsoe if
          // get company number and if comany number is not same then add to array list
      } // close for
        // 2d array with table number and name
    } // clsoe while
  }

  public void assignComp11() {
    ArrayList<String> comp11List = new ArrayList<String>();

    while (add11 <= numppl) {
      for (Person guest : namesList) { // change to for loop nameList.get(i).getComp() == nameList.get(i+1).getComp()
        if (guest.getComp() == 11) {
          comp11List.add(guest.getName());
          add11++;
        } // clsoe if
          // get company number and if comany number is not same then add to array list
      } // close for
        // 2d array with table number and name
    } // clsoe while
  }

  public void assignComp12() {
    ArrayList<String> comp12List = new ArrayList<String>();

    while (add12 <= numppl) {
      for (Person guest : namesList) { // change to for loop nameList.get(i).getComp() == nameList.get(i+1).getComp()
        if (guest.getComp() == 12) {
          comp12List.add(guest.getName());
          add12++;
        } // clsoe if
          // get company number and if comany number is not same then add to array list
      } // close for
        // 2d array with table number and name
    } // clsoe while
  }

  public void assignComp13() {
    ArrayList<String> comp13List = new ArrayList<String>();

    while (add13 <= numppl) {
      for (Person guest : namesList) { // change to for loop nameList.get(i).getComp() == nameList.get(i+1).getComp()
        if (guest.getComp() == 13) {
          comp13List.add(guest.getName());
          add13++;
        } // clsoe if
          // get company number and if comany number is not same then add to array list
      } // close for
        // 2d array with table number and name
    } // clsoe while
  }

  public void assignComp14() {
    ArrayList<String> comp14List = new ArrayList<String>();

    while (add14 <= numppl) {
      for (Person guest : namesList) { // change to for loop nameList.get(i).getComp() == nameList.get(i+1).getComp()
        if (guest.getComp() == 14) {
          comp14List.add(guest.getName());
          add14++;
        } // clsoe if
          // get company number and if comany number is not same then add to array list
      } // close for
        // 2d array with table number and name
    } // clsoe while
  }

  public void assignComp15() {
    ArrayList<String> comp15List = new ArrayList<String>();

    while (add15 <= numppl) {
      for (Person guest : namesList) { // change to for loop nameList.get(i).getComp() == nameList.get(i+1).getComp()
        if (guest.getComp() == 15) {
          comp15List.add(guest.getName());
          add15++;
        } // clsoe if
          // get company number and if comany number is not same then add to array list
      } // close for
        // 2d array with table number and name
    } // clsoe while
  }

//public void tabcomp1() {
 // double p1 = Math.floor(Math.random() * table) + 1; 
 // double p1set = Math.floor(Math.random() * tablepos) + 1;
    // String [table numbr][table postiton]
  //Double [] [] comp1 = new Double[p1] [p1set]; 
  // creat 2d array for each person why giving error how do I make random int 
    
  //for (String att : comp1List) {
    // for each person in the company list assign them a random table and place at table 
   // String compan1[] =
  // close for


  // then do 2d array to desgin table and place at table

} // close party class