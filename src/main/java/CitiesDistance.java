public class CitiesDistance {

    private String city;
    private int distanceWesttoEast = 4313;
    private int distanceNorthtoSouth = 2545;
    private int distanceNorth=0, distanceSouth=0, distanceWest=0, distanceEast=0;



    public void setDistanceNorth(int distanceNorth) {
        this.distanceNorth = distanceNorth;
    }

    public int getDistanceNorth() {
        return distanceNorth;
    }

    public void setDistanceWest(int distanceWest) {
        this.distanceWest = distanceWest;
    }

    public int getDistanceWest() {
        return distanceWest;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return
                "city='" + city + '\'' +
                ", distance from North=" + distanceNorth + "km"+
                ", distance from West=" + distanceWest + "km";
    }

    public int getDistanceSouth(){
        return distanceSouth=distanceNorthtoSouth-distanceNorth;
    }

    public int getDistanceEast()
    {
        return distanceEast=distanceWesttoEast-distanceWest;
    }
}

