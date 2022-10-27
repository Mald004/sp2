public class DieselCar extends AFuelCar {
    boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int KmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, KmPrLitre);
        this.particleFilter = particleFilter;
    }

    public int getRegistrationFee() {
        int KmPrLitree = KmPrLitre;
        int registrationFee = 0;

        if(KmPrLitre >= 20){
            registrationFee = 34;
        }
        if (KmPrLitre <= 20 && KmPrLitre > 18) {
            registrationFee = 660;
        }

        if (KmPrLitre <= 18 && KmPrLitre > 17) {
            registrationFee = 970;
        }

        if (KmPrLitre <= 17) {
            registrationFee = 1300;
        }
        return registrationFee;
    }


    public String getFuelType() {
        return "Diesel";
    }

    boolean hasParticleFilter() {

        if (true) {
            System.out.println("Nice");
        }
        return false;
    }

    @Override
    public String toString() {
        return
                "\n" +
                        "\nDieselCar: " +
                        "\nparticleFilter=" + particleFilter +
                        "\n KmPrLitre=" + KmPrLitre +
                        "\nregistrationNumber='" + registrationNumber +
                        "\n make='" + make +
                        "\n model='" + model +
                        "\nnumberOfDoors=" + numberOfDoors;
    }


}
