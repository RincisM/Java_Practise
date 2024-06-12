import java.util.Hashtable;

public class XVI_Hash_Table {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>(); //Default Initial Capacity is 11 and load factor of 0.75
        // load factor of 0.75 denotes, when 75% of elements are filled, this hash table dynamically expand to fill more elements.

        // Add an element to the hash table
        table.put("100", "Alice");
        table.put("123", "John");
        table.put("321", "Paul");
        table.put("555", "Harry");
        table.put("777", "Zack");

        // // TO remove an element
        // table.remove(777);

        // To access the element
        for(String key: table.keySet()) {
            System.out.println(key.hashCode() % 11 + "\t" + key + "\t" + table.get(key));
        }
    }
}
