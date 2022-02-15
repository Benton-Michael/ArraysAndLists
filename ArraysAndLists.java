class ArraysAndLists {
    
    public static void main (String[] args) {

        int[] myArray;
        myArray = new int[5];
        myArray[0] = 4;
        myArray[1] = 8;
        myArray[2] = 8;
        myArray[3] = 5;
        myArray[4] = 9;


        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        String [] fruits = {"banana", "pear", "papya", "kiwi"};
        String temp = fruits[0];
        // because a zero-based/ zero indexed array we can get the last item using -1
        fruits[0] = fruits[fruits.length - 1];
        fruits[fruits.length - 1] = temp;

        for(int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }


    }

}

