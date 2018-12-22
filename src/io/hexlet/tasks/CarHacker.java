package io.hexlet.tasks;

public  class CarHacker {

    public static Car1 car1 = new Car1();
    public static Car2 car2 = new Car2();

    //BEGIN (write your solution here). Мое решение
    public void mixer() {

        String tempBrend = car1.getBrand();
        Car1.setBrand(Car2.getBrand(car2));
        car2.setBrand(tempBrend);

        int tempMaxSpeed = Car1.getMaxSpeed();
        car1.setMaxSpeed(car2.getMaxSpeed());
        car2.setMaxSpeed(tempMaxSpeed);

        int tempMinSpeed = Car1.getMinSpeed();
        car1.setMinSpeed(car2.getMinSpeed());
        car2.setMinSpeed(tempMinSpeed);

        int tempEngineNumber = Car1.getEngineNumber();
        car1.setEngineNumber(car2.getEngineNumber());
        car2.setEngineNumber(tempEngineNumber);

        String tempDriverName = Car1.getDriverName();
        car1.setDriverName(Car2.getDriverName(car2));
        Car2.setDriverName(car2, tempDriverName);

//        // Решение Хекслета
//        public static void mixer() {
//            String tempBrand = car1.getBrand();
//            Integer tempMaxSpeed = Car1.getMaxSpeed();
//            Integer tempMinSpeed = Car1.getMinSpeed();
//            Integer tempEngineNumber = Car1.getEngineNumber();
//            String TempDriverName = Car1.getDriverName();
//
//            car2ToCar1();
//
//            car2.setBrand(tempBrand);
//            car2.setMaxSpeed(tempMaxSpeed);
//            car2.setMinSpeed(tempMinSpeed);
//            car2.setEngineNumber(tempEngineNumber);
//            Car2.setDriverName(car2, TempDriverName);
//        }
//
//        private static void car2ToCar1() {
//            Car1.setBrand(Car2.getBrand(car2));
//            car1.setMaxSpeed(car2.getMaxSpeed());
//            car1.setMinSpeed(car2.getMinSpeed());
//            car1.setEngineNumber(car2.getEngineNumber());
//            car1.setDriverName(Car2.getDriverName(car2));
//        }
    }
    //END
}
