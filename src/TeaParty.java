public class TeaParty {
	 public String welcome(String name, boolean isWoman, boolean isKnighted){
		
		this.name=name;
		this.isWoman=isWoman;
		this.isKnighted=isKnighted;
		return name;
		
		
     }
	 
	 private String name;
	 private boolean isWoman;
	 private boolean isKnighted;
	public String name() {
		return name;
	}
	public boolean isWoman() {
		return true;
	}
	 public boolean isKnighted() {
		 return true;
	 }
}
