package models;

/**
 * This class represents detailed information about a device, such as its year of production,
 * price, CPU model, and hard disk size.
 * It provides methods to access and modify each property of the device data.
 */
public class DeviceData {
    // The production year of the device
    private int year;

    // The price of the device
    private double price;

    // The CPU model used in the device
    private String CPUModel;

    // The size of the hard disk in the device (e.g., "1 TB")
    private String hardDiskSize;

    /**
     * Constructor to initialize device data with year, price, CPU model, and hard disk size.
     *
     * @param year          The production year of the device.
     * @param price         The price of the device.
     * @param CPUModel      The CPU model of the device.
     * @param hardDiskSize  The hard disk size of the device (e.g., "1 TB").
     */
    public DeviceData(int year, double price, String CPUModel, String hardDiskSize) {
        this.year = year;
        this.price = price;
        this.CPUModel = CPUModel;
        this.hardDiskSize = hardDiskSize;
    }

    // Getter for the production year
    public int getYear() {
        return year;
    }

    // Setter for the production year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter for the price
    public double getPrice() {
        return price;
    }

    // Setter for the price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for the CPU model
    public String getCPUModel() {
        return CPUModel;
    }

    // Setter for the CPU model
    public void setCPUModel(String CPUModel) {
        this.CPUModel = CPUModel;
    }

    // Getter for the hard disk size
    public String getHardDiskSize() {
        return hardDiskSize;
    }

    // Setter for the hard disk size
    public void setHardDiskSize(String hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }
}
