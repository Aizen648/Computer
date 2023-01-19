package PC.USB;

public class MemoryStick implements USBDevice {
    private final String name;
    private boolean ejected=false;
    public MemoryStick(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("MemoryStick connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        if(!ejected){
            System.out.println("First use metod ejected");
            return false;
        } else {
            System.out.println("MemoryStick disconnected");
            return true;
        }
    }
    public void eject(){
        ejected=true;
        System.out.println("Ejecting memoryStick");
    }

    @Override
    public String getName() {
        return name;
    }
}
