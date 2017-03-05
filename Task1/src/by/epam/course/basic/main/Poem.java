package by.epam.course.basic.main;

public class Poem extends LiteratureWork{

	private String poemType;

	public Poem(String name, int year, String authorName, String poemType) {
		super(name, year, authorName);
		this.poemType = poemType;
	}

	public String getPoemType() {
		return poemType;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result=1;
		result = prime * result + super.hashCode();
		if (poemType != null){
			result = prime * result + prime * poemType.hashCode();
		}				
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if (this == obj){
			return true;
		}
		if (!super.equals(obj)){
			return false;
		}
		if (this.getClass() != obj.getClass()){
			return false;
		}
		
		Poem poem = (Poem) obj;
		if (poemType == null) {
			if (poem.poemType != null){
				return false;
			}
		} else if (!poemType.equals(poem.poemType)){
			return false;
		}		
		
		return true;
	}
	
	
	
}
