
package triptec.logic;


public class Place {
    private int lon,lat,Price,internationalPhone;
    private String address,name,description,activities,type,rating,schedule,website;
    // add image;

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getStayCost() {
        return Price;
    }

    public void setStayCost(int stayCost) {
        this.Price = stayCost;
    }

    public int getInternationalPhone() {
        return internationalPhone;
    }

    public void setInternationalPhone(int internationalPhone) {
        this.internationalPhone = internationalPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    //constructor using lat and lon
    public Place(int lon, int lat, int Price, String name, String description, String activities) {
        this.lon = lon;
        this.lat = lat;
        this.Price = Price;
        this.name = name;
        this.description = description;
        this.activities = activities;
    }

    //constructor using address

    public Place(int Price, String address, String name, String description, String activities) {
        this.Price = Price;
        this.address = address;
        this.name = name;
        this.description = description;
        this.activities = activities;
    }

    public Place(int lon, int lat, int Price, int internationalPhone, String address, String name, String description, String activities, String type, String rating, String schedule, String website) {
        this.lon = lon;
        this.lat = lat;
        this.Price = Price;
        this.internationalPhone = internationalPhone;
        this.address = address;
        this.name = name;
        this.description = description;
        this.activities = activities;
        this.type = type;
        this.rating = rating;
        this.schedule = schedule;
        this.website = website;
    }
    
    
    
    
    
    
    

    @Override
    public String toString() {
        return "Place{" + "lon=" + lon + ", lat=" + lat + ", stayCost=" + Price + ", internationalPhone=" + internationalPhone + ", address=" + address + ", name=" + name + ", description=" + description + ", activities=" + activities + ", type=" + type + ", rating=" + rating + ", schedule=" + schedule + ", website=" + website + '}';
    }
    
    
    
}
