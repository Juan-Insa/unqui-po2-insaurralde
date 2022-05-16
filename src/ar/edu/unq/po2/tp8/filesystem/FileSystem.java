package ar.edu.unq.po2.tp8.filesystem;

public abstract class FileSystem implements FyleSystem{
	private String name;

	public abstract int totalSize();
    public abstract void printStructure();
    public abstract FileSystem lastModified();
    public abstract FileSystem oldestElement(); 
    public abstract void addFile(FileSystem file);
    public abstract void removeFile(FileSystem file);
    public abstract FileSystem getFile(int nbr);
    
    /*
     * dados dos archivos devuelve el más nuevo.
     */
    String getName() {
    	return this.name;
    }
    
    void setName(String name) {
    	this.name = name;
    }
    
}
