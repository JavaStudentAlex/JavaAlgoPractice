package LinearSearch;

import java.util.Random;

public class Randomizer {

    private Random randmElemsFactory;

    public Randomizer(){
        randmElemsFactory = new Random();
    }

    public Randomizer(long seed){
        randmElemsFactory = new Random(seed);
    }

    public int[] getIntRandArray(int numbersCount){
        int[] resultArray = new int[numbersCount];
        for(int i=0;i<resultArray.length;++i){
            resultArray[i] = randmElemsFactory.nextInt();
        }
        return resultArray;
    }
}
