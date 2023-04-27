import java.util.Arrays;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 1, max = 49, slots = 6;

        int[] loterryArray = new int[slots];
        boolean isRepeated;
        int randomNumber = 0;

        for (int i = 0; i < slots; i++){
            do {
                isRepeated = false;
                randomNumber = rand.nextInt(max + 1 - min);
                //check for repeated number against
                // the filled non-zero elements
                for(int k = 0; k <= i; k++){
                    //check against each filled non-zero elements
                    //hope that none repeats the random number
                    if(loterryArray[k] == randomNumber){
                        isRepeated = true;
                        break;
                    }
                }
            } while (isRepeated);
            loterryArray[i] = randomNumber;
        }
        Arrays.sort(loterryArray);
        System.out.println("The result of the loterry: ");
        for(int i = 0; i < slots; i++){
            System.out.println(loterryArray[i]);
        }
    }
}

