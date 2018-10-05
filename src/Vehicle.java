import java.util.Date;


public class Vehicle implements Engine, Chassis {

    private Date vehicleManufacturedDate;
    private String vehicleManufacturer;
    private String vehicleMake;
    private String vehicleModel;
    private Chassis vehicleFrame;
    private String vehicleType;
    private String driveTrain;
    private Engine vehicleEngine;

    public Vehicle() {
        vehicleManufacturedDate = new Date ();
        vehicleManufacturer = "Honda";
        vehicleMake = "Honda";
        vehicleModel = "Prelude";
        vehicleFrame = new VehicleChassis ();
        vehicleType = "null";
        driveTrain = "2WD: Two-Wheel Drive";
        vehicleEngine = new ManufacturedEngine ();
    }

    public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
                   String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,
                   Engine vehicleEngine) {

        this.vehicleManufacturedDate = vehicleManufacturedDate;
        this.vehicleManufacturer = vehicleManufacturer;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleFrame = vehicleFrame;
        this.vehicleType = vehicleType;
        this.driveTrain = driveTrain;
        this.vehicleEngine = vehicleEngine;
    }

    public void setEngineCylinders(int engineCylinders) {
        this.vehicleEngine.setEngineCylinders ( engineCylinders );
    }

    public void setEngineManufacturedDate(Date date) {
        this.vehicleEngine.setEngineManufacturedDate ( date );
    }

    public void setEngineManufacturer(String manufacturer) {
        this.vehicleEngine.setEngineManufacturer ( manufacturer );
    }

    public void setEngineMake(String engineMake) {
        this.vehicleEngine.setEngineMake ( engineMake );
    }

    public void setEngineModel(String engineModel) {
        this.vehicleEngine.setEngineModel ( engineModel );
    }

    public void setDriveTrain(String driveTrain) {
        this.vehicleEngine.setDriveTrain ( driveTrain );
    }

    public void setEngineType(String fuel) {
        this.vehicleEngine.setEngineType ( fuel );
    }

    public void setVehicleDrive(String driveTrain){
        this.driveTrain = driveTrain;
    }

    public void setVehicleManufacturedDate(Date vehicleManufacturedDate) {
        this.vehicleManufacturedDate = vehicleManufacturedDate;
    }

    public void setVehicleManufacturer(String vehicleManufacturer) {
        this.vehicleManufacturer = vehicleManufacturer;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Chassis getChassisType() {
        return vehicleFrame.getChassisType ();
    }

    public void setChassisType(String vehicleChassis) {
        this.vehicleFrame.setChassisType ( vehicleChassis );
    }

    public String toString() {
        return String.format ( "Manufacturer Name   : %s%nManufacturer Date   : %s%nVehicle Make        : %s%n" +
                        "Vehicle Model       : %s%nVehicle Type        : %s%n%s", vehicleManufacturer, vehicleManufacturedDate,
                vehicleMake, vehicleModel, vehicleType, vehicleEngine.toString () );
    }

    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle ();
        System.out.println ( genericVehicle.toString () );

        Vehicle improvedVehicle = new Vehicle ( new Date ( "Tue Jan 03 07:13:19 MST 2015" ), "Honda",
                "Honda", "Prelude", new VehicleChassis (), "88 AKI",
                "2WD: Two-Wheel Drive", new ManufacturedEngine ( "Honda",
                new Date ( "Thu Feb 02 01:38:31 MST 2012" ), "H-series", "H23A1",
                4, "88 AKI", "2WD: Two-Wheel Drive" ) );

        System.out.println ( improvedVehicle.toString () );
    }
}
