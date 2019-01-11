package LinearSearch;

public class Main {

    public static void main(String[] args) {
        Randomizer rand = new Randomizer(-5);
        printArray(rand.getIntRandArray(10));
    }

    private static void printArray(int[] numbersArray){
        for (int number : numbersArray) {
            System.out.println(number);
        }
    }
}
