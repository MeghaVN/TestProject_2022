package class8;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
//for Particular object to ignore
@JsonIgnoreProperties(value = { "support" })

public class Root1 {
	Data DataObject;

	Support SupportObject;

	// Getter Methods

	public Data getData() {
		return DataObject;
	}

	public Support getSupport() {
		return SupportObject;
	}

	// Setter Methods

	public void setData(Data dataObject) {
		this.DataObject = dataObject;
	}

	public void setSupport(Support supportObject) {
		this.SupportObject = supportObject;
	}

}
