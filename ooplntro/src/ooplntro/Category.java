package ooplntro;

public class Category {
	private int id;
	private String name;
	
	
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		
		return this.id;
		
	}
	public void setId(int id) { //bi�ey yapmayaca��m
		this.id =id;
}
	
	
	
	
	public String getName() {
		return name+"!";
	}
	public void setName(String name) {
		this.name=name;
	}
	
}