package by.epam.course.basic.main;

public class Novel extends LiteratureWork{
	
	private String mainCharacterName;

	public Novel(String name, int year, String authorName, String mainCharacterName) {
		super(name, year, authorName);
		this.mainCharacterName = mainCharacterName;
	}

	public String getMainCharacterName() {
		return mainCharacterName;
	}
	
	@Override
	public int hashCode(){
		int result = 1;
		final int prime = 31;
		result = prime * super.hashCode();
		if (mainCharacterName != null){
			result = result + prime * mainCharacterName.hashCode();
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
		Novel novel = (Novel) obj;
		if (mainCharacterName == null){
			if (novel != null) {
				return false;
			}
		} else if (!mainCharacterName.equals(novel.mainCharacterName)) {
			return false;
		}
		return true;
	}
}
