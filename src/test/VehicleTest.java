import org.example.Car;
import org.example.Motorcycle;
import org.example.Vehicle;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;



public class VehicleTest {

    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);

        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testMotorcycleIsInstanceOfVehicle(){
        Motorcycle motorcycle = new Motorcycle("Kavaski", "Ninja",2012);

        assertInstanceOf(Vehicle.class, motorcycle);
    }

    @Test
    public void carCreat4Wheels(){
        Car car = new Car("Dodge", "Ram", 2010);

        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void motorcycleCreat4Wheels(){
        Motorcycle motorcycle = new Motorcycle("Yamaha", "R1", 2015);

        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public  void carSpeedTestDrive(){
        Car car = new Car("Lada", "Vesta", 2023);

        car.testDrive();

        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    public void motorCycleSpeedTestDrive(){
        Motorcycle motorcycle = new Motorcycle("Minsk", "Jupiter5", 1980);

        motorcycle.testDrive();

        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }


    @Test
    public void voidCarSpeedAndStop(){
        Car car = new Car("Lada", "Niva", 2000);

        car.testDrive();

        assertThat(car.getSpeed()).isEqualTo(60);

        car.park();

        assertThat(car.getSpeed()).isEqualTo(0);
        }



    @Test
    public void voidMotorcycleSpeedAndStop(){
        Motorcycle motorcycle = new Motorcycle("Ij", "Izdelie1", 1980);

        motorcycle.testDrive();

        assertThat(motorcycle.getSpeed()).isEqualTo(60);

        motorcycle.park();

        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }


    }





