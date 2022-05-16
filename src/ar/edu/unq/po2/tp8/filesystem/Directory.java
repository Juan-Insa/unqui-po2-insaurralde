package ar.edu.unq.po2.tp8.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystem{
	List<FileSystem> files = new ArrayList<FileSystem>();

	@Override
	public int totalSize() {
		int totalSize = 0;
		for (FileSystem file : files) {
			totalSize += file.totalSize();
		}
		return totalSize;
	}

	@Override
	public void printStructure() {
		for (FileSystem file : files) {
			file.printStructure();
		}
	}

	/*
	 * recorre todos los archivos del directorio y devuelve el más recientemente modificado
	 */
	@Override
	public FileSystem lastModified() {
		List<File> files = this.getAllEndFiles();
		if (! this.files.isEmpty()) {
			FileSystem newestFile = files.get(0);
		
		for (FileSystem currentFile : files) {
			newestFile = newestOf(newestFile, currentFile);
		}
		return newestFile;
		}
	}
	
	FileSystem newestOf(FileSystem f1, FileSystem f2) {
		if (f1.lastModified().isAfter){
			
		}
			return null;
	}


    /*
     * devuelve la lista de todos los archivos (sin directorios) del directorio
     */
	private List<File> getAllEndFiles() {
		List<FileSystem> files = new ArrayList<FileSystem>();
		for (FileSystem fileS : this.files) {
			if (fileS instanceof File) {
				files.add(fileS);
			}
		}
		return files;
	}

	@Override
	public FileSystem oldestElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFile(FileSystem file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFile(FileSystem file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FileSystem getFile(int nbr) {
		// TODO Auto-generated method stub
		return null;
	}

}
