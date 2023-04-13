package day01;

public class Lamp {

    /*     States    */
    byte watts;  //-128 to 127
    short height, baseDiameter, width, voltage, avgHours, lumens; //-32,768 to 32,767
    //int: -2,147,483,648 to 2,147,483,647
    String model, type, brand, bulbShape, bulbBaseType, filament;
    float price;
    boolean isSmart;

    /*     Constructor    */
    public Lamp(byte watts, short height, short baseDiameter, short width, short voltage, short avgHours, short lumens, String model, String type, String brand, String bulbShape, String bulbBaseType, String filament, float price, boolean isSmart) {
        this.watts = watts;
        this.height = height;
        this.baseDiameter = baseDiameter;
        this.width = width;
        this.voltage = voltage;
        this.avgHours = avgHours;
        this.lumens = lumens;
        this.model = model;
        this.type = type;
        this.brand = brand;
        this.bulbShape = bulbShape;
        this.bulbBaseType = bulbBaseType;
        this.filament = filament;
        this.price = price;
        this.isSmart = isSmart;
    }

    /*     Behavior    */

}
