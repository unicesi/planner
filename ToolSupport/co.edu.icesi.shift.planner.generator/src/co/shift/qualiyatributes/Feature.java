package co.shift.qualiyatributes;

public class Feature {

	private String id;
	private String name;
	private int value;
	private String type;
	
	public Feature(String id, String name, int value, String type){
		this.id = id;
		this.name = name;
		this.value = value;
		this.setType(type);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
