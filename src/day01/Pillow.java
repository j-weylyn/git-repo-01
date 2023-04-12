package day01;

public class Pillow {

    /*     States    */
    short width, length, height, weight; //-32,768 to 32,767
    //int: -2,147,483,648 to 2,147,483,647
    String model, type, fabric, fillingMaterial;
    boolean moistureWicking;

    /*     Constructor    */
    public Pillow(short width, short length, short height, short weight, String model, String type, String fabric, String fillingMaterial, boolean moistureWicking) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.weight = weight;
        this.model = model;
        this.type = type;
        this.fabric = fabric;
        this.fillingMaterial = fillingMaterial;
        this.moistureWicking = moistureWicking;
    }

    /*     Behavior    */


}
