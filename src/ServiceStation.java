public class ServiceStation {
    public void check(MotorTechnic technic) {
        printService(technic);
        updateTyres(technic);
        if (technic.getClass().equals(Car.class)) {
            Car car = (Car) technic;
            car.checkEngine();
        } else if (technic.getClass().equals(Truck.class)) {
            Truck truck = (Truck) technic;
            truck.checkEngine();
            truck.checkTrailer();
        }
    }
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            printService(car);
            updateTyres(car);
            car.checkEngine();
        }
        if (truck != null) {
            printService(truck);
            updateTyres(truck);
            truck.checkEngine();
            truck.checkTrailer();
        }
        if (bicycle != null) {
            printService(bicycle);
            updateTyres(bicycle);
            }
    }


    private void printService(MotorTechnic technic){
        System.out.println("Обслуживаем " + technic.getModelName());
    }
    private void updateTyres(MotorTechnic technic){
        for (int i = 0; i < technic.getWheelsCount(); i++) {
            technic.updateTyre();
        }
    }
}
