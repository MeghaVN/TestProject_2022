package class9;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GithubCreateRepoPojo {
	private String name;
	private String description;
	public boolean isPrivateVal() {
		return privateVal;
	}
	public void setPrivateVal(boolean privateVal) {
		this.privateVal = privateVal;
	}
	@JsonProperty("private")
	private boolean privateVal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
