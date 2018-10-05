import java.util.Date;

public class ManufacturedEngine implements Engine {

    private String engineManufacturer;
    private Date engineManufacturedDate;
    private String engineMake;
    private String engineModel;
    private int engineCylinders;
    private String engineType;
    private String driveTrain;

    public ManufacturedEngine() {

        engineManufacturer = "Generic";
        engineManufacturedDate = new Date ();
        engineMake = "Generic";
        engineModel = "Generic";
        engineCylinders = 0;
        engineType = "85 AKI";
        driveTrain = "2WD: Two-Wheel Drives";
    }

    public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
                              String engineMake, String engineModel, int engineCylinder,
                              String engineType, String driveTrain) {

        this.engineManufacturer = engineManufacturer;
        this.engineManufacturedDate = engineManufacturedDate;
        this.engineMake = engineMake;
        this.engineModel = engineModel;
        this.engineCylinders = engineCylinder;
        this.engineType = engineType;
        this.driveTrain = driveTrain;
    }

    public void setEngineCylinders(int engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    public void setEngineManufacturedDate(Date date) {
        this.engineManufacturedDate = date;
    }

    public void setEngineManufacturer(String manufacturer) {
        this.engineManufacturer = manufacturer;
    }

    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    public void setEngineType(String fuel) {
        this.engineType = fuel;
    }

    public String toString() {
        return String.format ( "Engine Manufacturer : %s%nEngine Manufactured : %s%nEngine Make         : %s%n" +
                "Engine Model        : %s%nEngine Type         : %s%nEngine Cylinders    : %d%nDrive Train" +
                "         : %s%n", engineManufacturer, engineManufacturedDate, engineMake, engineModel, engineType, engineCylinders, driveTrain );
    }

    public static void main(String[] args) {
        ManufacturedEngine genericEngine = new ManufacturedEngine ();
        System.out.println ( genericEngine.toString () );
        ManufacturedEngine hondaEngine = new ManufacturedEngine ( "Honda", new Date ( "Tue Jan 03 07:13:19 MST 2012" ), "H-series", "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive" );
        System.out.println ( hondaEngine.toString () );

    }
}
