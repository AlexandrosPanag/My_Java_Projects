/**
 * An easy solution of how we can create randomly generated numbers within a specific range
 * can also be used as a dice rolling game
 *
 * @author AlexandrosPanag
 * @version 17/10
 */



/**
 * An easy solution of how we can create randomly generated numbers within a specific range
 * can also be used as a dice rolling game
 *
 * @author AlexandrosPanag
 * @version 17/10
 */


import java.util.concurrent.*;

public class twoDice{
public static void main(String[] args){
    int min_one=1;
    int min_two=1;
    int max_one=6;
    int max_two=6;
    int randomNum_one = ThreadLocalRandom.current().nextInt(min_one, max_one);
    System.out.println("The number that was rolled on the first dice was: "+randomNum_one);
    
    int randomNum_two = ThreadLocalRandom.current().nextInt(min_two, max_two);
    System.out.println("The number that was rolled on the second dice was: "+randomNum_two);
    
 }
}