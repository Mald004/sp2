public class GasolinCar extends AFuelCar {

    public GasolinCar(String registrationNumber,String make,String model,int numberOfDoors,int KmPrLitre){
        super(registrationNumber,make,model,numberOfDoors,KmPrLitre);
    }


    public int getRegistrationFee() {
        int KmPrLitree = KmPrLitre;
        int registrationFee = 0;

        if(KmPrLitre<=20&&KmPrLitre>18){
            registrationFee= 660;
        }

        if(KmPrLitre<=18&&KmPrLitre>17){
            registrationFee= 970;
        }

        if(KmPrLitre<=17){
            registrationFee= 1300;
        }
        return registrationFee;
    }


    public String getFuelType() {
        return "Gasolin";
    }

    @Override
    public String toString() {
        return
                "\n" +
                        "GasolinCar: " +
                        "\nKmPrLitre =" + KmPrLitre +
                        "\n" + registrationNumber +
                        "\n make='" + make +
                        "\n model='" + model +
                        "\n numberOfDoors=" + numberOfDoors;
    }

}
