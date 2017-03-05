package by.epam.course.basic.main;

import java.util.Comparator;

public class ComparatorLiteratureWork_ByAuthorName implements Comparator<LiteratureWork> {
	
	public int compare(LiteratureWork obj1, LiteratureWork obj2){
		
		String name1 = obj1.getAuthorName();
		String name2 = obj2.getAuthorName();
			
		return name1.compareTo(name2);
	}

}
