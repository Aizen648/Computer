package PC.USB;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
