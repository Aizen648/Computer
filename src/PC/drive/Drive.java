package PC.drive;

import PC.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
