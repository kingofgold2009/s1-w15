import java.util.*;
// Represent a person's name with three components, a first name,
// a middle name, and a last name.

public class Friends {

        Name a = new Name("Joseph", "a", "Frank");
        Name b = new Name("Coraline", "b", "White");
        Name c = new Name("Jeff", "c", "Elle");

        ArrayList<Name> names = new ArrayList<Name>();
        Random rand = new Random();
   // declare and initialize the ArrayList; it holds Name objects
   // declare and initialize the Random class
   
   // the constructor
   public Friends () {
    names.add(a);
    names.add(b);
    names.add(c);
           // add three names to the ArrayList
   }
   
   public void printRandomFriend(){
        System.out.println(names.get(rand.nextInt(names.size() - 1))); //need to get fullname
       // print out the fullname of a random name in the arraylist
    }
   
  
}