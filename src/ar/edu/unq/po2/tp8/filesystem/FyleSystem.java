package ar.edu.unq.po2.tp8.filesystem;

public interface FyleSystem {
    public int totalSize();
    public void printStructure();
    public FileSystem lastModified();
    public FileSystem oldestElement();    
}
