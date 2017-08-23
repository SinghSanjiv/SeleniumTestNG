package MpPackage;

public class ExtractNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "00 My 123 Name 456 is 789 Sanjeev 88";
		// first method to remove nos from string
		String numbersOnly= str.replaceAll("[^0-9]", "");
		System.out.println(numbersOnly);
		// 2nd method to remove nos from string
		String digits="";
		for (int i = 0; i < str.length(); i++) {
            char chrs = str.charAt(i);              
            if (Character.isDigit(chrs))
                digits = digits+chrs;
        }
        System.out.println(digits);
		// 3rd method to remove nos from string
        digits="";
		for (int i = 0; i < str.length(); i++) {
            char chrs = str.charAt(i);
            int val = (int) chrs;
            if(val>=48 && val<=57)
                {digits = digits+chrs;}
        }
		System.out.println(digits);
	}

}
