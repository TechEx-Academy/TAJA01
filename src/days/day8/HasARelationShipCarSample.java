package days.day8;

import java.util.ArrayList;

public class HasARelationShipCarSample {

}

class Car{
    ArrayList<Tyre> tyres;
    Driver driver;
    ArrayList<Passanger> passangers;

    public Car() {
        this.passangers = new ArrayList<>();
        this.tyres = new ArrayList<>();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void addTyre(Tyre t){
        this.tyres.add(t);
    }

    public ArrayList<Tyre> getTyres(){
        return this.tyres;
    }

    public void addPassanger(Passanger p){
        this.passangers.add(p);
    }

    public ArrayList<Passanger> getPassengers(){
        return this.passangers;
    }

}

class Tyre{
    private String brandName;
    private int size;

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public String getBrandName(){
        return this.brandName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

interface Person{
}

class Driver implements Person{
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Passanger implements Person{
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}