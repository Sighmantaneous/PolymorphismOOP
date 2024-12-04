package ie.atu.productv4;

public class TV extends Product {

    private String ScreenSize;
    private String Manufacturer;
    protected static int count = 0;

    public TV(){
        super();
        ScreenSize = "";
        Manufacturer = "";
        count++;
    }
    public String getScreenSize() {
        return ScreenSize;
    }
    public void setScreenSize(String screenSize) {
        ScreenSize = screenSize;
    }
    public String getManufacturer() {
        return Manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }
    public static int getCount() {
        return count;
    }
    @Override
    public String toString() {return super.toString()+" "+ScreenSize+"'' "+" by "+Manufacturer;
    }
}

