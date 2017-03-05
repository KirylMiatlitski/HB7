package by.epam.course.basic.main;



import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Literature—ollection{
	
	
	
	
	private Set <LiteratureWork> collection = new TreeSet<>();
	private String type;
	
	public Literature—ollection(String type) {
		this.type=type;
	}
	
	public String getType() {
		return type;
	}
	
	public Set<LiteratureWork>  getCollection() {
		return collection;
	}

	
	
	public void addWork(LiteratureWork work){
		collection.add(work);
	}
	
	public boolean existInCollection(LiteratureWork work){
		LiteratureWork[] array;
		array = this.collection.toArray(new LiteratureWork[this.collection.size()]);
		for (int i = 0; i < array.length; i++){
			if (array[i].equals(work)){
				return true;
			}
		}
		return false;
	}
	
	public void show(){
		Iterator<LiteratureWork> iterator = this.collection.iterator();
		
		
		while (iterator.hasNext()) {
			LiteratureWork item = iterator.next();
		    System.out.println(item.show());
		}
	}
	
	
	public void sortByName(){
		ComparatorLIteratureWork_ByName comp = new ComparatorLIteratureWork_ByName();
		Set <LiteratureWork> myCollection = new TreeSet<LiteratureWork>(comp);
		myCollection.addAll(this.getCollection());
		Iterator<LiteratureWork> iterator = myCollection.iterator();
		System.out.println(this.getType() + " Sorted by Name");
		
		while (iterator.hasNext()) {
			LiteratureWork item = iterator.next();
		    System.out.println(item.show());
		}
	}
	
	public void sortByYear(){
		ComparatorLiteratureWork_ByYear comp = new ComparatorLiteratureWork_ByYear();
		Set <LiteratureWork> myCollection = new TreeSet<LiteratureWork>(comp);
		myCollection.addAll(this.getCollection());
		Iterator<LiteratureWork> iterator = myCollection.iterator();
		System.out.println(this.getType() + " Sorted by Year");
		
		while (iterator.hasNext()) {
			LiteratureWork item = iterator.next();
			System.out.println(item.show());
		}
	}
	
	public void sortByAuthorName(){
		ComparatorLiteratureWork_ByAuthorName comp = new ComparatorLiteratureWork_ByAuthorName();
		Set <LiteratureWork> myCollection = new TreeSet<LiteratureWork>(comp);
		myCollection.addAll(this.getCollection());
		Iterator<LiteratureWork> iterator = myCollection.iterator();
		System.out.println(this.getType() + " Sorted by Author Name");
		
		while (iterator.hasNext()) {
			LiteratureWork item = iterator.next();
			System.out.println(item.show());
		}
	}
	

}
