package rizvi.ognl;

public class RootObjectImpl {
	
 private String name;
 
 public String getName() {
	return name;
}
 public void setName(String name) {
	this.name = name;
}
	public  int sum(int no1,int no2) {
		return no1+no2;
	}
	
	public String welcome(String amir) {
		
		return "welcome to " +amir;
	}

}
