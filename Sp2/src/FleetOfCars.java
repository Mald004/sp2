import java.util.ArrayList;

public class FleetOfCars {
ArrayList<Car>fleet = new ArrayList<>();

    public FleetOfCars(){

    fleet = new ArrayList<>();
    }

    void addCar(Car car){
     fleet.add(car);
    }

    int getTotalRegistrationFeeForFleet(){
        int totalregistrationFee = 0;

        for (int i = 0; i <fleet.size() ; i++) {
          totalregistrationFee += fleet.get(i).getRegistrationFee();
        }
        System.out.println("\nThis is your total registrationfee: "+totalregistrationFee);
       return totalregistrationFee;
    }

    @Override
    public String toString() {
        return "\n" +
                "Your fleet of cars = " + "\n"+fleet;
    }
}



