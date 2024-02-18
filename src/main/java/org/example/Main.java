package org.example;



public class Main {


    public static void main(String[] args) {

        Car car = new Car("BMW", "X1", 2018);
        Motorcycle motorcycle = new Motorcycle("Honda", "NoName", 2014);

        System.out.println("У автомобиля " + car.getCompany() + " "
                + car.getModel() + " " + car.getYearRelease() + " "
                + car.getNumWheels() + " колеса");

        car.testDrive();
        System.out.println("Скорость при тестировании автомобиля не должан быть более "
                + car.getSpeed() +" км/ч" );

        car.park();
        System.out.println("Автомобиль припарков, скорость на приборах "
                + car.getSpeed() +" км/ч" );

        System.out.println();

        System.out.println("У мотоцикла " + motorcycle.getCompany() + " "
                + motorcycle.getModel() + " " + motorcycle.getYearRelease() + " "
                + motorcycle.getNumWheels() + " колеса");

        motorcycle.testDrive();
        System.out.println("Скорость при тестировании автомобиля не должан быть более "
                + motorcycle.getSpeed() +" км/ч" );

        motorcycle.park();
        System.out.println("Автомобиль припарков, скорость на приборах "
                + motorcycle.getSpeed() +" км/ч" );
    }
}