package assignment3;

public enum EnumEx {
	yahoo("yahoo", "has good features"),
	gmail("gmail", "can connect with g+");
	

	private final String nameE;
	private final String whyF;
	
	EnumEx(String nameEmail, String whyFeatures){
		nameE = nameEmail;
		whyF =whyFeatures;
	}
	public String getnameE(){
		return nameE;
	}
	public String getwhyF(){
		return whyF;
	}
}
