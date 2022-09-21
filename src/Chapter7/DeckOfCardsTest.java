package Chapter7;
 import  java.security.SecureRandom;
 import java.util.Scanner;

public class DeckOfCardsTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        for (int i = 1; i <= 52; i++){
            System.out.printf("%-19s",myDeckOfCards.dealCard());
            if (i % 4 == 0){
                System.out.println();
            }
        }


    }


}
