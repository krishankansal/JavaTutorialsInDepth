public class Car extends Vehical {

    void engine() {
        System.out.println("twelve piston engine");
    }

    void ac() {
        System.out.println("ac in provided");
    }

    public static void main(String[] args) {
        // The variable of super class can always refer
        // to the object of subclass
        Vehical veh = new Car();
        veh.accelerator();
        veh.breaks();
        veh.driverSeat();
        veh.engine();
        //veh.ac();

    }
}
