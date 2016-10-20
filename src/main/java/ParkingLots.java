import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunjing on 10/20/16.
 */
public class ParkingLots {
    private Map<String, Car> parkingPlace;
    private int parkingNumber;

    ParkingLots(int parkingNumber) {
        this.parkingNumber = parkingNumber;
        this.parkingPlace = new HashMap<String, Car>();
    }

    public boolean hasSpace() {
        return this.parkingPlace.size() >= this.parkingNumber ? false : true;
    }

    public void addCar(Car car) throws Exception {
        if (this.parkingPlace.size() >= this.parkingNumber)
            throw new Exception("this is no parking lot");
        this.parkingPlace.put(car.getCarNumber(), car);
    }

    public void deleteCar(Car car) throws Exception {
        try {
            if (this.parkingPlace.size() <= 0)
                throw new Exception("your car is not in the parkin lot");
            this.parkingPlace.remove(car.getCarNumber());
        }
        catch (Exception e) {
            System.out.println("delete car failed");
            throw new Exception("delete car failed");
        }
    }
}
