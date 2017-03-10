package week1;
//Enum presents a set of constrain
public class EnumType {
	public enum COLOUR{
		RED, BLUE, YELLOW
	};
	
	public enum Gender {
		MALE("M","MALE"),FEMALE("F","FEMALE");
		private String code;
		private String text;
		private Gender(String code, String text) {
			this.code = code;
			this.text = text;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		
	public static Gender getGenderbyCode(String code){
		for(Gender gender: Gender.values()){
			if (gender.code.equals(code)){
				return gender;
			}
		}
		return null;
	}
		
	}
	public static void main(String[] args){
		
		//get by value
		Gender marryGender = Gender.FEMALE;
		System.out.println("Code: " + marryGender.getCode());
		System.out.println("Text: " + marryGender.getText());
		System.out.println("Ordinal: "+ marryGender.ordinal());
		
		//list all
		System.out.println("Values of Gender:");
		for (Gender gender : Gender.values()){
			System.out.println(gender.getText());
		}
		
		//get by code
		String code = "M";
		Gender gender = Gender.getGenderbyCode(code);
		System.out.println("Gender by code: " + gender);
		
		//Example 2: Colour
		System.out.println(COLOUR.BLUE);
		System.out.println(COLOUR.RED);
		COLOUR c = COLOUR.RED;
		System.out.println(c);
		System.out.println(c.YELLOW);
		if (c == COLOUR.YELLOW){
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
	
	
}
