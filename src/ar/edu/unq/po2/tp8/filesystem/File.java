package ar.edu.unq.po2.tp8.filesystem;

import java.time.LocalDateTime;

public class File extends FileSystem{
	private int size;
	private LocalDateTime lastModified;
	
    /*
     * constructor de archivo, pasa el nombre y peso
     */
	public File(int size, String name) {
		super();
		this.setSize(size);
		this.setName(name);
		this.setLastModified(LocalDateTime.now());
	}

	/*
	 * getter de última modificacion
	 */
	LocalDateTime getLastModified() {
		return lastModified;
	}

	/*
	 * seter de última modificación
	 */
	void setLastModified(LocalDateTime lastModified) {
		this.lastModified = lastModified;
	}

	
	void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public int totalSize() {
		return this.size; 
	}

	@Override
	public void printStructure() {
		System.out.println(" " + this.getName());
	}

	@Override
	public FileSystem lastModified() {
		return null;
	}

	@Override
	public FileSystem oldestElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFile(FileSystem file) {}

	@Override
	public void removeFile(FileSystem file) {}

	@Override
	public FileSystem getFile(int nbr) {return null;}

}
