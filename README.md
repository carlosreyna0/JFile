# JFile
JFile is a null safe utility package that makes it quick and easy to do file IO in Java. Once you add the jar *(JFile.jar)* to your java project, you can import it as <code>import JFile.Load.FileLoader;</code> and <code>import JFile.Save.FileSaver;</code>

# Static loading
To load statically, you can call the static method <code>JFile.Load.FileLoader.load(File file);</code> which returns a <code>java.util.Optional</code> of generic type <code>String</code>.
# Instance loading
To load with an instance of <code>JFile.Load.FileLoader</code>, you can create a variable with the constructor <code>JFile.Load.FileLoader loader = new JFile.Load.FileLoader(File f);</code> and then call <code>loader.load();</code> which returns a <code>java.util.Optional</code> of generic type String. <code>loader</code>'s file can be changed by the public variable <code>file</code>, for example <code>loader.file = new File("path\file");</code>.
# Static saving
To statically save one file as another file you can use the static method <code>JFile.Save.FileSaver.saveAs(File file, File toSaveAs);</code> That will write the contents of file to be the contents of toSaveAs.
To statically save a file by writing a String to it, you can use the static method <code>JFile.Save.FileSaver.save(File file, String contents);</code>
# Instance saving
To create a variable of <code>JFile.Save.FileSaver</code> you can use the constructor <code>JFile.Save.FileSaver saver = new JFile.Save.FileSaver(File f);</code> and then call it's <code>save(String contents)</code> method to write a String to the file, or it's <code>saveAs(File f)</code> method to set the saver's contents to File f.
