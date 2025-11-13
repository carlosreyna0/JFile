# JFile
JFile is a null safe utility package for file IO in java. Start by importing it after adding the jar to your project with <code>import jFile.*;</code> to get access to the <code>JFileLoader</code> and <code>JFileSaver</code> classes.
# JFileLoader
<code>JFileLoader</code> contains 1 static method for loading files. It is <code>load(File file)</code> and returns an <code>Optional</code> of generic type String.
# JFileSaver
<code>JFileSaver</code> contains 2 static methods for saving files. They are: <code>write(File file, String contents)</code> and <code>saveAs(File file, File toSaveAs)</code>.
