package PC;

import PC.USB.Keyboard;
import PC.USB.MemoryStick;
import PC.USB.Mouse;
import PC.drive.Drive;
import PC.drive.HDDDrive;
import PC.drive.SDDDrive;
import PC.file.File;
import PC.file.imigeFile.GIFImageFile;
import PC.file.imigeFile.JPGImageFile;
import PC.file.musicFile.MP3MusicFile;

public class Main {
    public static void main(String[] arg){

        Monitor monitor = new Monitor();
        Drive hddDrive = new HDDDrive();
        Drive sddDrive = new SDDDrive();
        Computer computer = new Computer(monitor, hddDrive);

        GIFImageFile gif = new GIFImageFile("beautiful gif", 14);
        JPGImageFile jpg = new JPGImageFile("jpg with cat", 23, 23);
        MP3MusicFile mp3 = new MP3MusicFile("classic music", 12, "Jackson", "bad 25", 23);

        hddDrive.addFile(gif);
        hddDrive.addFile(jpg);
        hddDrive.addFile(mp3);

        sddDrive.addFile(gif);
        sddDrive.addFile(jpg);
        sddDrive.addFile(mp3);

        hddDrive.listFiles();
        sddDrive.listFiles();

        File jpg_with_cat = hddDrive.findFile("jpg with cat");
        System.out.println("Type of file: "+jpg_with_cat.name()+" is " +jpg_with_cat.getType());
        File jpg_with_cat1 = sddDrive.findFile("jpg with cat");
        System.out.println("Type of file: "+jpg_with_cat1.name()+" is " +jpg_with_cat1.getType());

        MemoryStick memoryStick = new MemoryStick("pendrive");
        Mouse mouse = new Mouse("myszka");
        Keyboard keyboard = new Keyboard("klawiatura");

        computer.addUSBDevices(memoryStick);
        computer.addUSBDevices(mouse);
        computer.addUSBDevices(keyboard);

        memoryStick.eject();
        computer.removeUSBDevices(memoryStick);
        computer.removeUSBDevices(mouse);
        computer.removeUSBDevices(keyboard);

    }
}
