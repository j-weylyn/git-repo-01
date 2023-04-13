package day01;

public class TV {

    /*     States    */
    byte usbPortCount, lanPortCount;  //-128 to 127
    short diagonal, width, height, screenSize, refreshRateHz, nits, inputLag; //-32,768 to 32,767
    //int: -2,147,483,648 to 2,147,483,647
    float responseTime, price;
    String model, displayPanel, resolution, OS, hdmiInput;
    boolean isHDR, isSmartTV, hasHeadphoneJack;

    /*     Constructor    */
    public TV(byte usbPortCount, byte lanPortCount, short diagonal, short width, short height, short screenSize, short refreshRateHz, short nits, short inputLag, float responseTime, float price, String model, String displayPanel, String resolution, String OS, String hdmiInput, boolean isHDR, boolean isSmartTV, boolean hasHeadphoneJack) {
        this.usbPortCount = usbPortCount;
        this.lanPortCount = lanPortCount;
        this.diagonal = diagonal;
        this.width = width;
        this.height = height;
        this.screenSize = screenSize;
        this.refreshRateHz = refreshRateHz;
        this.nits = nits;
        this.inputLag = inputLag;
        this.responseTime = responseTime;
        this.price = price;
        this.model = model;
        this.displayPanel = displayPanel;
        this.resolution = resolution;
        this.OS = OS;
        this.hdmiInput = hdmiInput;
        this.isHDR = isHDR;
        this.isSmartTV = isSmartTV;
        this.hasHeadphoneJack = hasHeadphoneJack;
    }

    /*     Behavior    */


}
