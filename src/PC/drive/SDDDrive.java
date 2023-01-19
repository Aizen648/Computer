package PC.drive;

import PC.file.File;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SDDDrive implements Drive{
    private Map<String, File> fileMap=new HashMap<>();
    @Override
    public void addFile(File file) {
        fileMap.put(file.name(),file);
    }

    @Override
    public void listFiles() {
        Collection<File> values = fileMap.values();
        for (File file:values){
            System.out.println(file.name());
        }

    }

    @Override
    public File findFile(String name) {
        return fileMap.get(name);
    }
}
