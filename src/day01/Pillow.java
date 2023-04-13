package day01;

public class Pillow {

    /*     States    */
    short width, length, height, weight; //-32,768 to 32,767
    //int: -2,147,483,648 to 2,147,483,647
    String model, type, brand, fabric, fillingMaterial;
    float price;
    boolean hasMoistureWicking;

    /*     Constructor    */
    public Pillow(short width, short length, short height, short weight, String model, String type, String brand, String fabric, String fillingMaterial, float price, boolean hasMoistureWicking) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.weight = weight;
        this.model = model;
        this.type = type;
        this.brand = brand;
        this.fabric = fabric;
        this.fillingMaterial = fillingMaterial;
        this.price = price;
        this.hasMoistureWicking = hasMoistureWicking;
    }

    /*     Behavior    */


}
