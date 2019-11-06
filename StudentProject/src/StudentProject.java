
public class StudentProject {
	
	public static class Location{
		
		private String name;
		
		private int difficulty;
		
		private Character[] population;
		
		public Location() {
			
		}
		
		public Location(String name, int difficulty) {
			
			this.name = name;
			this.difficulty = difficulty;
		}
		
		public String getName() {
			
			return name;
		}
		
		public void setName(String name) {
			
			this.name = name;
		}
		
		public int getDifficulty() {
			
			return difficulty;
		}
		
		public void setDifficulty(int difficulty) {
			
			this.difficulty = difficulty;
		}
		
		public String toString() {
			
			return "name='" + name + "\n" + ",difficulty=" + difficulty;
		}
		
		public static void main(String[] args) {
			
			//StudentProject StudentProject = new StudentProject();
			
			Location obj = new Location("location name here",1);
			
			System.out.println(obj);
		}
	}

}
