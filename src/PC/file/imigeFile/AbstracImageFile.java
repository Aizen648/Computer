package PC.file.imigeFile;

import PC.file.AbstractFile;
import PC.file.FileType;

public abstract class AbstracImageFile extends AbstractFile{
    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }

    protected AbstracImageFile(String name, int size) {
        super(name,size);
    }

}
