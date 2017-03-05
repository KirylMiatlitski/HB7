package by.epam.course.basic.main;



public class LiteratureWork  implements Comparable<LiteratureWork> {
	private String name;
	private int year;
	private String authorName;
	
	public LiteratureWork(String name, int year, String authorName) {
		super();
		this.name = name;
		this.year = year;
		this.authorName = authorName;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public String getAuthorName() {
		return authorName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LiteratureWork other = (LiteratureWork) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		 if (year !=other.year)
			return false;
		return true;
	}
	
	public String show(){
		return "Литреатурное произведение "+this.name+" ("+this.year+"), автора: "+ this.authorName;
	}
	
	// Comparable
	// compare by name
	public int compareTo(LiteratureWork obj){
			
		return this.name.compareTo(obj.getName());
		
	}
	

}
