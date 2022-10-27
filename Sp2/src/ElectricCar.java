public class ElectricCar extends ACar {
    int batteryCapacity;
    int maxRangeKm;
    int WhPrKm;


    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRangeKm) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRangeKm = maxRangeKm;
    }


    public int getRegistrationFee() {
        WhPrKm = batteryCapacity/maxRangeKm;
        int convertToKmPrLitre = (WhPrKm / 91) / 100;
        int registrationFee = 0;

        if (convertToKmPrLitre >= 20) {
            registrationFee = 340;
        }

        if (convertToKmPrLitre <= 20 && convertToKmPrLitre > 18) {
            registrationFee = 660;
        }

        if (convertToKmPrLitre <= 18 && convertToKmPrLitre > 17) {
            registrationFee = 970;
        }

        if (convertToKmPrLitre <= 17) {
            registrationFee = 1300;
        }


        return registrationFee;
    }

    public int getBatteryCapacityKwh() {
        return batteryCapacity;
    }


    public int getMaxRangeKm() {
        return maxRangeKm;
    }

    public int getWhPrKm() {
        this.WhPrKm = batteryCapacity/maxRangeKm;

        return WhPrKm;
    }

    @Override
    public String toString() {
        return
                "\n"+
                "\nElectricCar: " +
                "\nbatteryCapacity = " + batteryCapacity +
                "\n maxRangeKm = " + maxRangeKm +
                "\n registrationNumber='" + registrationNumber +
                "\n make = " + make +
                "\n model = " + model +
                "\n numberOfDoors = " + numberOfDoors;
    }
}
