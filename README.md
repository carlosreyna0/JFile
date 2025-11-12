# JFile
JFile is a null safe utility package that makes it quick and easy to do file IO in Java. 

# Static loading
To load statically, you can call the static method <code>JFile.Load.FileLoader.load(File file);</code> which returns a <code>java.util.Optional</code> of generic type <code>String</code>.
# Instance loading
To load with an instance of <code>JFile.Load.FileLoader</code>, you can create a variable with the constructor <code>JFile.Load.FileLoader loader = new JFile.Load.FileLoader(File f);</code> and then call <code>loader.load();</code> which returns a <code>java.util.Optional</code> of generic type String. <code>loader</code>'s file can be changed by the public variable <code>file</code>, for example <code>loader.file = new File("path\file");</code>.
# Static saving
To statically save one file as another file you can use the static method <code>JFile.Save.FileSaver.saveAs(File file, File toSaveAs);</code> That will write the contents of file to be the contents of toSaveAs.
# Instance saving
