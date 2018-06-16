public class TeaParty {
	 public String welcome(String name, boolean isWoman, boolean isKnighted){
		
		this.name=name;
		this.isWoman=isWoman;
		this.isKnighted=isKnighted;
		String title;
		if(isWoman&&isKnighted) {
			title="Lady ";
		} else if(isWoman&&!isKnighted) {
			title="Ms. ";
		} else if(!isWoman&&isKnighted) {
			title="Sir ";
		} else {
			title="Mr. ";
		}
		
		String greeting = ("Hello "+ title + name);
		
		
		return greeting;


     }
	 
	 private String name;
	 private boolean isWoman;
	 private boolean isKnighted;

}
