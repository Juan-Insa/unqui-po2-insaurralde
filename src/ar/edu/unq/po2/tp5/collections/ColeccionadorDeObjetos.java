package ar.edu.unq.po2.tp5.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ColeccionadorDeObjetos {
	
	
	public Object getFirstFrom(LinkedList<Object> collection) {
		return collection.get(0);
	}
	
	public void addLast (Object element, LinkedList<Object> collection ) {
		collection.add(element);
	}
	
	public Collection getSubCollection(LinkedList<Object> collection, int from, int to) {
		return collection.subList(from,to);
	}
	
	public boolean containsElement(LinkedList<Object> collection, Object element) {
		return collection.contains(element);
	}

}

