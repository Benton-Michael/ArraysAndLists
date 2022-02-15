import java.util.ArrayList;

class ArraysAndLists {
    
    public static void main (String[] args) {

        int[] myArray = new int[5];

        // Cannot be primitive types - use wrapper classes. Integer instead of int
        ArrayList<Integer> myList = new ArrayList<Integer>();

        myList.add(10);
        myList.add(11);
        System.out.println(myList);

        // Getters and Setters
        Integer num = myList.get(0);
        System.out.println(num);

        myList.set(0, 9);
        System.out.println(myList);

        // capital "O" on object to denote wrapper class not primitive type
        ArrayList<Object> things = new ArrayList<Object>();
        things.add(10);
        things.add("Hello");
        things.add(new ArrayList<Integer>());
        things.add(12.5);
        System.out.println(things);
    }
}

