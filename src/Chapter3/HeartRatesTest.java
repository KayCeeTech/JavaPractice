package Chapter3;

public class HeartRatesTest {
    public static void main(String[] args) {
        HeartRates rate = new HeartRates("Cosmos","Kingsley",new DateOfBirth("05","10","1989"));
        rate.targetHeartRateRange();
    }
}
