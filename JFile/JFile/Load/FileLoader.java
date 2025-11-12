package JFile.Load;
import java.io.*;
import java.util.Optional;

public class FileLoader
{
    public File file;
    public FileLoader(File file)
    {
        this.file = file;
    }
    public FileLoader(){}

    public Optional<String> load()
    {
        String text = null;
        try(BufferedReader reader = new BufferedReader(new FileReader(this.file)))
        {
            String currentLine = reader.readLine();
            text = currentLine;

            while((currentLine = reader.readLine()) != null)
            {
                text += currentLine += '\n';
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Optional.ofNullable(text);
    }
    public static Optional<String> load(File f)
    {
        return new FileLoader(f).load();
    }
}