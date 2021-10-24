public class PrintArray {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double [] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'a', 'b', 'c'};
        PrintArray.toPrint(intArray);
        PrintArray.toPrint(doubleArray);
        PrintArray.toPrint(charArray);

    }
   public static <E> void toPrint(E[] inputarray){
       for(E element : inputarray){
           System.out.println(element);
       }
       System.out.println();
   }


}
