package by.epam.course.basic.main;

import java.util.Comparator;

public class ComparatorLiteratureWork_ByYear implements Comparator<LiteratureWork>{
	
	public int compare(LiteratureWork obj1, LiteratureWork obj2){
		int year1 = obj1.getYear();
		int year2 = obj2.getYear();
		return year1-year2;
	}

}
