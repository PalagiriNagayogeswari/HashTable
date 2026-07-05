
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

//MyHashTable class to implement hashtable.
class MyHashTable {

    MyMapNode head;

    public void add(String key) {

        if (head == null) {
            head = new MyMapNode(key, 1);
            return;
        }

        MyMapNode curr = head;

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

    public void print() {

        if (head == null) {
            System.out.println("Table is Empty");
            return;
        }

        MyMapNode curr = head;

        while (curr != null) {
            System.out.println(curr.key + " -> " + curr.value);
            curr = curr.next;
        }
    }
}

//Main class implementing the hashtable 
public class HashTable {

    public static void main(String[] args) {

        String sentence = "To be or not to be";

        String[] words = sentence.split(" ");

        MyHashTable hashTable = new MyHashTable();

        for (String word : words) {
            hashTable.add(word);
        }

        hashTable.print();
    }
}