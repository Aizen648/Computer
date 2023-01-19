package PC.drive;

import PC.file.File;

import java.util.ArrayList;
import java.util.List;

public class HDDDrive implements Drive{
    private List<File> files = new ArrayList<>();
    @Override
    public void addFile(File file) {
        files.add(file);
    }
    @Override
    public void listFiles() {
        files.forEach(file -> System.out.println(file.name()));
    }

    @Override
    public File findFile(String name) {
        return files.stream().filter(file -> file.name().equals(name)).findFirst().orElseThrow();
    }
}
