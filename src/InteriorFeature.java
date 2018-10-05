public class InteriorFeature implements Feature {

    String interiorFeature;
    public InteriorFeature(){
        interiorFeature = "Generic";
    }

    public InteriorFeature(String interiorFeature){
        this.interiorFeature = interiorFeature;
    }

    public String getFeature(){
        return interiorFeature;
    }

    public void setFeature(String interiorFeature){
        this.interiorFeature = interiorFeature;
    }

    public String toString() {
        return String.format ( "Interior [%s]%n", interiorFeature );
    }

    public static void main (String[] args){
        InteriorFeature genericFeature = new InteriorFeature();
        System.out.println(genericFeature.toString());
        InteriorFeature climateFeature = new InteriorFeature("Climate Control");
        System.out.println(climateFeature.toString());
    }

}
