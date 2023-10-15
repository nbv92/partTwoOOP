import service.ServiceStation;
import transport.Bicycle;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("UAZ",4);
        Truck truck = new Truck("truck1",6);
        Bicycle bicycle = new Bicycle("bicycle1",2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(bicycle);
        station.check(truck);
    }
}