package PC;

import PC.USB.USBDevice;
import PC.drive.Drive;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;
    private Drive drive;
    private List<USBDevice> usbDevices = new ArrayList<>();

    public Computer(Monitor monitor, Drive drive) {
        this.monitor = monitor;
        this.drive = drive;
    }
    public void addUSBDevices(USBDevice usbDevice){
        boolean isConnected = usbDevice.connect();
        if(isConnected){
            usbDevices.add(usbDevice);
        }
    }
    public void removeUSBDevices(USBDevice usbDevice){
        boolean isDisConnected = usbDevice.disconnect();
        if(!isDisConnected){
            System.out.println("Forcibly removed USB Devices");
        }
        usbDevices.remove(usbDevice);
    }
    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public List<USBDevice> getUsbDevices() {
        return usbDevices;
    }

}
