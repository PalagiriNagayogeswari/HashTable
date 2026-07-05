
//created a class MyMapNode to implement hashtable using linkedlist.
class MyMapNode {

    String key;
    int value;
    MyMapNode next;

    public MyMapNode(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

//created MyHashTable to implement the main functionality
class MyHashTable {

    private static final int SIZE = 10;

    MyMapNode[] table = new MyMapNode[SIZE]; //created an array of linkedlist to implement hashtable.

    //getting the index of current key using hashcode function.
    private int getIndex(String key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    //add function to add a key to the hashtable.
    public void add(String key) {

        int index = getIndex(key);

        if (table[index] == null) {
            table[index] = new MyMapNode(key, 1);
            return;
        }

        MyMapNode curr = table[index];

        while (curr != null) {

            if (curr.key.equals(key)) {
                curr.value++;
                return;
            }

            if (curr.next == null)
                break;

            curr = curr.next;
        }

        curr.next = new MyMapNode(key, 1);
    }

    //printing the hashtable.
    public void print() {

        for (int i = 0; i < SIZE; i++) {

            if (table[i] != null) {

                System.out.println("Bucket " + i);

                MyMapNode curr = table[i];

                while (curr != null) {
                    System.out.println(curr.key + " -> " + curr.value);
                    curr = curr.next;
                }

                System.out.println();
            }
        }
    }
}

//main class to implement the hashtable completely.
public class HashTable {

    public static void main(String[] args) {

        String paragraph =
                "Paranoids are not paranoid because they are paranoid " +
                        "but because they keep putting themselves deliberately " +
                        "into paranoid avoidable situations";

        paragraph = paragraph.toLowerCase();

        String[] words = paragraph.split(" ");

        MyHashTable table = new MyHashTable();

        for (String word : words) {
            table.add(word);
        }

        table.print();
    }
}