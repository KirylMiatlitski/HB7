package by.epam.course.basic.main;

import java.util.Comparator;

public class ComparatorLIteratureWork_ByName implements Comparator<LiteratureWork>{
	
	public int compare(LiteratureWork obj1, LiteratureWork obj2){
		
		String name1 = obj1.getName();
		String name2 = obj2.getName();
		
		return name1.compareTo(name2);
	}

}
