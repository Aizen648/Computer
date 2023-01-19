package PC.file.imigeFile;

public class JPGImageFile extends AbstracImageFile {
    private final int compression;

    public JPGImageFile(String name, int size, int compression) {
        super(name, size);
        this.compression = compression;
    }
    public int getCompression() {
        return compression;
    }
    public void DisplayImage(){
        System.out.println("funny JPG");
    }
}
