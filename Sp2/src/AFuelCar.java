public abstract class AFuelCar extends ACar {
 int KmPrLitre;

    public AFuelCar(String registrationNumber,String make,String model,int numberOfDoors,int KmPrLitre){
    super(registrationNumber,make,model,numberOfDoors);
    this.KmPrLitre = KmPrLitre;
    }

    public abstract String getFuelType();


}
