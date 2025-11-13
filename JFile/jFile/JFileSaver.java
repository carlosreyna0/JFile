package jFile;
import java.io.*;

/**
 *A null safe utility package that contains static methods for file saving operations.
 *@author Carlos Reyna
 */
public class JFileSaver
{
    /**
     * @param file
     * The file you want to overwrite
     * @param toSaveAs
     * The file whose contents will overwrite parameter 'file'
     */
    public static void saveAs(File file, File toSaveAs)
    {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            writer.write(JFileLoader.load(toSaveAs).orElse(""));
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * @param file
     * The file to be written to
     * @param contents
     * The contents as a String to be written to parameter 'file'
     */
    public static void write(File file, String contents)
    {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            writer.write(contents);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}