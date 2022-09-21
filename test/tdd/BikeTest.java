package tdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BikeTest {


 @Test
 void testThatMyBikeIsOff(){
  //given
  Bike myBike = new Bike();
  //action
  myBike.setIsOff(true);
  //assert
  assertTrue(myBike.getIsOff());
 }

 @Test
  public void testThatMyBikeCanTurnOn(){
   //given
   Bike myBike = new Bike();
   //action
   myBike.setIsOn(true);
   //assert
   assertTrue(myBike.getIsOn());
 }

}
