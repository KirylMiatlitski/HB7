package by.epam.course.basic.main;

public class Story extends LiteratureWork{
	
	private int chapterCount;

	public Story(String name, int year, String authorName, int chapterCount) {
		super(name, year, authorName);
		this.chapterCount = chapterCount;
	}

	public int getChapterCoung() {
		return chapterCount;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * super.hashCode();
		if (chapterCount != 0){
			result = result + prime * chapterCount;
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
		Story story = (Story) obj;
		if (chapterCount == 0){
			if (story.chapterCount != 0){
				return false;
			}
		} else if (chapterCount != story.chapterCount){
			return false;
		}		
		return true;
	}
	
}
