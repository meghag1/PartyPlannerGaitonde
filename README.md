# PartyPlannerGaitonde
Ap CompSci Project

In this project, there is a pre-determined guest list that has been imported and loaded into the program as a txt file. The user is then able to gain different outputs from methods involving the guest list. 
They are able to:
- Print the party roster (all the tables and seats)
- View a singular table's roster
- View the complete party guest list
- Look up a party guest and have their name, company, table, and table seat number printed out
- Add a party guest
- Print a roster of guests by a company

I approached this project by loading the data into an array list of person objects which included all ther attributes (name, company, id, and later table and seat ID). I then created a 10x10 2D array which I populated with the person objects. To print the party roster, I have it travers through the list and print out each table as well as a seat number for each person. It also checks to make sure that no 2 people from the same company are at a table and if they are, it emptys the seat (null). After that, each method was created involving either traversing through the 2D array or array list of the total party guest.
