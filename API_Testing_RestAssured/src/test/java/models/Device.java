package models;

/**
 * This class represents a device with basic information such as the name and its data.
 * It encapsulates device properties and provides methods to access and modify these properties.
 */
public class Device {
    // The name of the device
    private String name;

    // The data related to the device, such as year, price, CPU model, and hard disk size
    private DeviceData data;

    /**
     * Constructor to initialize a new device with a name and its associated data.
     *
     * @param name The name of the device.
     * @param data The detailed data of the device (year, price, CPU, etc.).
     */
    public Device(String name, DeviceData data) {
        this.name = name;
        this.data = data;
    }

    // Getter for the device name
    public String getName() {
        return name;
    }

    // Setter for the device name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the device data (year, price, CPU model, etc.)
    public DeviceData getData() {
        return data;
    }

    // Setter for the device data
    public void setData(DeviceData data) {
        this.data = data;
    }
}
