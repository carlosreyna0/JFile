package jFile;
import java.io.*;
import java.util.Optional;

/**
 *A null safe utility package that contains static methods for file loading operations.
 *@author Carlos Reyna
 */
public class JFileLoader
{
    /**
     * @param file
     * The file to read
     * @return The contents of parameter 'file' as an Optional of generic type String
     */
    public static Optional<String> load(File file) {
        try(BufferedReader reader = new BufferedReader(new FileReader(file)))
        {
            String text = "", currentLine;
            while((currentLine = reader.readLine()) != null)
            {
                text += currentLine + '\n';
            }

            return Optional.of(text);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}