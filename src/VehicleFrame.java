public class VehicleFrame implements Chassis {

    String vehicleFrameType;

    public VehicleFrame() {
        this.vehicleFrameType = "Unibody";
    }

    public VehicleFrame(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    public Chassis getChassisType() {
        return this;
    }

    public void setChassisType(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    public String toString() {
            return String.format ( "Chassis Name     : %s%nVehicle Frame    : %s%n", CHASSIS, vehicleFrameType);
    }

    public static void main(String[] args) {
        VehicleFrame fordFrame = new VehicleFrame ();

        System.out.println ( fordFrame.toString () );

        VehicleFrame hondaFrame = new VehicleFrame ( "Ladder Frame" );

        System.out.println ( hondaFrame.toString () );
    }
}

