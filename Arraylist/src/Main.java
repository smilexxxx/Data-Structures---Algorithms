public class Main {
    public static void main(String[] args)  {

        DynamicArray dynamicArray = new DynamicArray();

        //add
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("E");
        dynamicArray.add("F");

        //insert
        dynamicArray.insert(3, "D");

        //delete
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

        //search
        dynamicArray.search("C");
        dynamicArray.search("G");

        System.out.println(dynamicArray);
        System.out.println("empty: " + dynamicArray.isEmpty());
         if (!dynamicArray.isEmpty()){
             System.out.println("capacity: "+ dynamicArray.capacity);
             System.out.println("size: "+ dynamicArray.size);
         }
    }
}