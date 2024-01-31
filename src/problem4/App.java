package problem4;

import problem4.abstracts.Vehicle;
import problem4.entities.AutomaticCar;
import problem4.entities.FreightTrain;
import problem4.entities.ManualCar;
import problem4.entities.PassengerTrain;

public class App {
    
    public static void main(String[] args) {
        
        Vehicle menualCar = new ManualCar("10가1234", "blue", false, 0);
        Vehicle automaticCar = new AutomaticCar("10가1234", "blue", false);
        Vehicle passengerTrain = new PassengerTrain("KTX001", "서울", "부산", false, 200);
        Vehicle freightTrain = new FreightTrain("Cargo001", "부산", "구미", true, 100.0);



        String string = "";
    }

}
