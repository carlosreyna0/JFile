package JFile.Save;
import JFile.Load.FileLoader;
import java.io.*;

public class FileSaver
{
    public File file;
    public FileSaver(File file)
    {
        this.file = file;
    }

    public void saveAs(File file)
    {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            writer.write(FileLoader.load(file).orElse(""));
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public void save(String contents)
    {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            writer.write(contents);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void saveAs(File file, File toSaveAs)
    {
        new FileSaver(file).saveAs(toSaveAs);
    }

    public static void save(File file, String contents)
    {
        new FileSaver(file).save(contents);
    }
}