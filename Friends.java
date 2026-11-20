import java.util.*;
// Represent a person's name with three components, a first name,
// a middle name, and a last name.

public class Friends {
        Name b = new Name("Coraline", "b", "White");
        Name c = new Name("Jeff", "c", "Elle");

        ArrayList<Name> friends = new ArrayList<Name>();
        Random r = new Random();
   // declare and initialize the ArrayList; it holds Name objects
   // declare and initialize the Random class
   
   // the constructor
   public Friends () {
    friends.add(new Name("sean", "morris"));
    friends.add(new Name("jesse", "al"));
    friends.add(new Name("Joe", "bre"));
    friends.add(new Name("Al", "ol"));

           // add three names to the ArrayList
   }
   
   public Name getRandomFriend(){
        int x = (int)Math.random() * (friends.size());
        // int x = r.nextInt(friends.size());
        // String s = names.get(x).fullName();
        return friends.get(x);
    }
   
  
}