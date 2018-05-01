package socialmaps;

public class Coordinates {
    double latitude;
    double longitude;

    public Coordinates(){

    }

    public double getLatitude(){
        return latitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public void setLatitude(double latIN){
        this.latitude =latIN;
    }

    public void setLongitude(double longIN){
        this.longitude = longIN;
    }
}
