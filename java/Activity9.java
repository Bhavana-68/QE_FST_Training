<<<<<<< HEAD
package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Black");
        myList.add("White");
        myList.add("Red");
        myList.add("Purple");
        myList.add("Green");
        System.out.println("All names in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("\n3rd name in the list: " + myList.get(2));

        String nameToCheck = "Red";
        if (myList.contains(nameToCheck)) {
            System.out.println("\nThe name " + nameToCheck + " exists in the list.");
        } else {
            System.out.println("\nThe name " + nameToCheck + " does not exist in the list.");
        }
        System.out.println("\nNumber of names in the list: " + myList.size());
        myList.remove("Purple");
        System.out.println("\nName 'Purple' removed.");
        System.out.println("Number of names in the list after removal: " + myList.size());
    }
}
=======
package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Black");
        myList.add("White");
        myList.add("Red");
        myList.add("Purple");
        myList.add("Green");
        System.out.println("All names in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("\n3rd name in the list: " + myList.get(2));

        String nameToCheck = "Red";
        if (myList.contains(nameToCheck)) {
            System.out.println("\nThe name " + nameToCheck + " exists in the list.");
        } else {
            System.out.println("\nThe name " + nameToCheck + " does not exist in the list.");
        }
        System.out.println("\nNumber of names in the list: " + myList.size());
        myList.remove("Purple");
        System.out.println("\nName 'Purple' removed.");
        System.out.println("Number of names in the list after removal: " + myList.size());
    }
}
>>>>>>> 1b212e018afe4005821d6af533a4466626af9bdc
