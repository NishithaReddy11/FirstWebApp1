package project1;

import java.util.Arrays;
import java.util.List;

public class Details {

	
	private String name;
	private String gender;
	private List<String> lang=Arrays.asList();
	private String country;
	
	public Details()
	{
		
	}
	
	
	public Details(String name, String gender, List<String> lang, String country) {
		super();
		this.name = name;
		this.gender = gender;
		this.lang = lang;
		this.country = country;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public List<String> getLang() {
		return lang;
	}


	public void setLang(List<String> lang) {
		this.lang = lang;
	}


	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Details [name=" + name + ", gender=" + gender + ", lang=" + lang + ", country=" + country + "]";
	}

	
}


