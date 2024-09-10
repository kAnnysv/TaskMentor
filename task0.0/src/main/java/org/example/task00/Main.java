package org.example.task00;


public class Main {
    public static void main(String[] args) {
        Car car = new Car("ee");

        System.out.println(car.getMotor().getDurability());

        car.startMove(1900);
        car.startMove(3000);
        car.startMove(1900);


        System.out.println(car.getMotor().getDurability());
        Service service = new Service();
        service.setCar(car);
        service.repairEngine();
        System.out.println(car.getMotor().getDurability());

//        Генерим массив авто
        Car[] cars = new Car[10];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car("car_" + i);
            cars[i].getMotor().setDurability((int) (Math.random() * 100));
            System.out.println(cars[i]);

        }

        System.out.println("Fist Service" + service.repairEngine(cars));

    }
}