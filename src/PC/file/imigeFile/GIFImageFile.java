package PC.file.imigeFile;

public class GIFImageFile extends AbstracImageFile {
    public GIFImageFile(String name, int size) {
        super(name,size);

    }
    public void showAnimation(){
        System.out.println("Funny Gif");
    }
}
