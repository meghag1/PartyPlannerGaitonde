/**
* Megha Gationde
* Jan 19 2023
* Party Planner
* This file has the person object decletarations and getter methods 
*/





class Person{
  
  private String Fname;
  private String Lname;
  private int comp;
  private double posID;
  private double tabID;
  private int personID;
  public int posit = 10;
  public int table = 10; 

  // create person object 
  public Person(int personID, String lname, String fname, int comp) {
    this.Fname = fname;
    this.Lname = lname;
    this.comp = comp;
    this.personID = personID;
    // give posID and tabID to each person constructor 
    //then when I go through and see which table id they have then put them into that table 
  } // close person constructor

  // getter methods that get return multiple aspects of the person object
  public String getName() {
    return Fname + " " + Lname;
  } // clsoe get name 
  
  public String getFName() {
    return Fname;
  } // clsoe fname
  public int getComp() {
    return comp;
  } // clsoe get comp 

  public int getID() {
    return personID;
  } // clsoe get id

  public void setTable(int tabID) {
    this.tabID = tabID;
  }

  // to string method to print out person object
public String toString() {
  return (Fname + " " + Lname + " is an atendee from company " + comp);
}

  
} // close class person
