public class Main {
    public static void main(String[] args) {
        ACar electricCar = new ElectricCar("2EAY3FF","Tesla","Series 7000",4,13,491);
        AFuelCar gasolinCar = new GasolinCar("AM765DE","Mercedes","2000",4,20);
        AFuelCar dieselCar = new DieselCar("YO546EL","Audi","R8 Coupe V10",4,8,true);

        FleetOfCars fleet = new FleetOfCars();
        fleet.addCar(gasolinCar);
        fleet.addCar(dieselCar);
        fleet.addCar(electricCar);

        System.out.println(fleet);
        fleet.getTotalRegistrationFeeForFleet();



    }
}