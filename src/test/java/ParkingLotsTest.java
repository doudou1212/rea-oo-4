import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sunjing on 10/20/16.
 */
public class ParkingLotsTest {
    @Test
    public void shouldHasSpaceWhenNoCarParking() throws Exception {
        ParkingLots parkingLots = new ParkingLots(2);
        assertTrue(parkingLots.hasSpace());
    }

    @Test
    public void shouldHasNoSpaceWhenCapacityIs0() throws Exception{
        ParkingLots parkingLots = new ParkingLots(0);
        assertFalse(parkingLots.hasSpace());
    }

    @Test
    public void shouldAddCarWhenHasSpace() throws Exception {
        ParkingLots parkingLots = new ParkingLots(1);
        assertTrue(parkingLots.hasSpace());
        Car car = new Car("ANB29767");
        parkingLots.addCar(car);
        assertFalse(parkingLots.hasSpace());
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenAddCarButNoSpace() throws Exception {
        ParkingLots parkingLots = new ParkingLots(0);
        Car car = new Car("ANB29767");
        parkingLots.addCar(car);
    }

    @Test
    public void shouldDeteleCarWhenHasCar() throws Exception {
        ParkingLots parkingLots = new ParkingLots(1);
        Car car = new Car("ANB29767");
        parkingLots.addCar(car);
        assertFalse(parkingLots.hasSpace());
        parkingLots.deleteCar(car);
        assertTrue(parkingLots.hasSpace());
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenDeleteCarButNoCar() throws Exception {
        ParkingLots parkingLots = new ParkingLots(0);
        Car car = new Car("ANB29767");
        parkingLots.deleteCar(car);
    }

    @Test
    public void shouldNotDeleteCarWhenDeleteCarButCarNotInParkingLots() throws Exception {
        ParkingLots parkingLots = new ParkingLots(1);
        Car car1 = new Car("ANB29767");
        Car car2 = new Car("no car");
        parkingLots.addCar(car1);
        parkingLots.deleteCar(car2);
        assertFalse(parkingLots.hasSpace());
    }
}