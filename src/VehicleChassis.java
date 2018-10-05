public class VehicleChassis implements Chassis {

    String chassisName;

    public VehicleChassis() {
        this.chassisName = CHASSIS;
    }

    VehicleChassis(String chassisName) {
        this.chassisName = chassisName;
    }


    public Chassis getChassisType() {
        return this;
    }

    public void setChassisType(String vehicleChassis) {
        this.chassisName = vehicleChassis;
    }


    public String toString() {
        return String.format ( "Chassis Name     : %s%n%n", chassisName );
    }

    public static void main(String[] args) {
        VehicleChassis genericChassis = new VehicleChassis ();
        System.out.println ( genericChassis.toString () );
        VehicleChassis hondaChassis = new VehicleChassis ( "Backbone" );
        System.out.println ( hondaChassis.toString () );
    }
}
