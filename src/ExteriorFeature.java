public class ExteriorFeature implements Feature {
    String exteriorFeature;

    public ExteriorFeature() {
        exteriorFeature = "Generic";
    }

    public ExteriorFeature(String exteriorFeature) {
        this.exteriorFeature = exteriorFeature;
    }

    public String getFeature() {
        return this.exteriorFeature;
    }

    public void setFeature(String exteriorFeature) {
        this.exteriorFeature = exteriorFeature;
    }

    public String toString() {
        return String.format ( "Exterior [%s]%n", exteriorFeature );
    }

    public static void main(String[] args) {
        ExteriorFeature genericExterior = new ExteriorFeature ();
        System.out.println ( genericExterior.toString () );
        ExteriorFeature fogExterior = new ExteriorFeature ( "Fog Lamps" );
        System.out.println ( fogExterior.toString () );
    }
}
