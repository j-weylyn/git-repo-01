package day01;

public class TV {

    /*     States    */
    byte usbPortCount;  //-128 to 127
    short diagonal, width, height, screenSize, refreshRateHz, nits, inputLag; //-32,768 to 32,767
    //int: -2,147,483,648 to 2,147,483,647
    float responseTime;
    String model, displayPanel, resolution, OS, hdmiInput;
    boolean HDR, smartTV, lanPort, headphoneJack;

    /*     Constructor    */
    public TV(byte usbPortCount, short diagonal, short width, short height, short screenSize, short refreshRateHz, short nits, float responseTime, short inputLag, String model, String displayPanel, String resolution, String OS, String hdmiInput, boolean HDR, boolean smartTV, boolean lanPort, boolean headphoneJack) {
        this.usbPortCount = usbPortCount;
        this.diagonal = diagonal;
        this.width = width;
        this.height = height;
        this.screenSize = screenSize;
        this.refreshRateHz = refreshRateHz;
        this.nits = nits;
        this.responseTime = responseTime;
        this.inputLag = inputLag;
        this.model = model;
        this.displayPanel = displayPanel;
        this.resolution = resolution;
        this.OS = OS;
        this.hdmiInput = hdmiInput;
        this.HDR = HDR;
        this.smartTV = smartTV;
        this.lanPort = lanPort;
        this.headphoneJack = headphoneJack;
    }

    /*     Behavior    */


}
