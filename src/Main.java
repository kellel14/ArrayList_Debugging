import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {

            // Create an arraylist
            ArrayList al = new ArrayList();
            System.out.println("Initial size of al: " + al.size());

            // Add elements to the arraylist
            al.add("C");
            al.add("A");
            al.add("E");
            al.add("B");
            al.add("D");
            al.add("F");
            al.add(1, "A2"); //this adds another  element 'A2' to index 1
            //changed al.sizes() to al.size()
            System.out.println("Size of al after additions: " + al.size());

            // Display the arraylist
            System.out.println("Contents of al: " + al);

            // Removes elements from the arraylist
            al.remove("F");
            al.remove("G");
            al.remove(2);
            //changed al.sizes() to al.size()
            System.out.println("Size of al after deletions: " + al.size());
            System.out.println("Contents of al: " + al);
        }
}
