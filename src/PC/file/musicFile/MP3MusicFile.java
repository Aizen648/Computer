package PC.file.musicFile;

import PC.file.AbstractFile;
import PC.file.FileType;

public class MP3MusicFile extends AbstractMusicFile {
    private final int quality;
    public MP3MusicFile(String name, int size, String bandName, String title,int quality) {
        super(name, size, bandName, title);
        this.quality=quality;
    }


    @Override
    public void play() {
        System.out.println("playing beautiful music MP3");
    }

    public int getQuality() {
        return quality;
    }
}
