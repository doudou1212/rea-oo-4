/**
 * Created by sunjing on 10/20/16.
 */
public class Car {
    private String carNumber;

    Car(String carNumber) {
        this.carNumber = carNumber;
    }

    public void drive() {
        System.out.println("driving car");
    }

    public void stop() {
        System.out.println("parking car");
    }

    public String getCarNumber() {
        return carNumber;
    }

}
