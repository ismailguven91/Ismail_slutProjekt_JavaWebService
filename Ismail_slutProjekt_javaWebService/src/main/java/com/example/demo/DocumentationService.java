package com.example.demo;

public class DocumentationService {
	
	//***************Documentation: Calculator***************
	public String addDescription() {
		return "[GET] Endpoint /calc/add?number1=x&number2=y \r\n"
					+ "! Counts two numbers in addition \r\n"
					+ "> Query parameter number1 [String] \r\n"
					+ "> Query parameter number2 [String] \r\n"
					+ "< Returns Json => { \"result\": answer } \r\n"
					+ "/* /calc/add?number1=1&number2=1 => 2 */";
	}
		
	public String subDescription() {
		return "[GET] Endpoint /calc/sub?number1=x&number2=y \r\n"
					+ "! Counts two numbers in subtraction \r\n"
					+ "> Query parameter number1 [String] \r\n"
					+ "> Query parameter number2 [String] \r\n"
					+ "< Returns Json => { \"result\": answer } \r\n"
					+ "/* /calc/sub?number1=2&number2=2 => 0 */";
	}	
	
	public String multiDescription() {
		return "[GET] Endpoint /calc/multi?number1=x&number2=y \r\n"
					+ "! Counts two numbers in multiplication \r\n"
					+ "> Query parameter number1 [String] \r\n"
					+ "> Query parameter number2 [String] \r\n"
					+ "< Returns Json => { \"result\": answer } \r\n"
					+ "/* /calc/multi?number1=3&number2=3 => 6 */";
	}
		
	public String divDescription() {
		return "[GET] Endpoint /calc/div?number1=x&number2=y \r\n"
					+ "! Counts two numbers in division \r\n"
					+ "> Query parameter number1 [String] \r\n"
					+ "> Query parameter number2 [String] \r\n"
					+ "< Returns Json => { \"result\": answer } \r\n"
					+ "/* /calc/div?number1=4&number2=4 => 1 */";
	}
	
	public String CalcDescription() {
		return "Calculator Documentation: \r\n\n"
					+ addDescription() + "\r\n\n" 
					+ subDescription() + "\r\n\n" 
					+ multiDescription() + "\r\n\n"
					+ divDescription();
	}
	//***************Documentation: Calculator***************
	
	//***************Documentation: Rock, Paper, Scissors***************
	public String RSPPostDescription() {
		return "[POST] Endpoint /RPS \r\n"
				+ "! Make a move \r\n"
				+ "! compares the user's choice with the computer's and selects winners \r\n"
				+ "> header: Content-Type = application/x-www-form-urlencoded \r\n"
				+ "> body parameter: choice [String] - valid values are Stone, Scissors, Paper \r\n"
				+ "< Returns Json => { \"Player_Move\": value, \"Computer_Move\": value, \"Winner\": value } \r\n"
				+ "/* choice [rock]  => returns { \"Player_Move\": rock, \"Computer_Move\": paper, \"Winner\": Player } */";
	}
	
	public String SspGetDescription() {
		return "[GET] Endpoint /RPS \r\n"
				+ "! Visar resultat av pågående match/matcher \r\n"
				+ "> Inga parametrar \r\n"
				+ " < Returns Json =>"
				+ "{"+ 
				"\"Total_Games\": \"Value"+ 
				"\"," +
				"\"Player\":" + 
					"[{"+
						"\"Total_Wins\":" + "\"value"+ "\""+ 
						"," +
						"\"Total_Losses\":" + "\"value"+ "\""+ 
						"," +
						"\"Total_Ties\":" + "\"value" + "\""+
					"}]"+
				"," +
				"\"Computer\":" + 
					"[{"+
						"\"Total_Wins\":" + "\"value" + "\""+ 
						"," +
						"\"Total_Losses\":" + "\"value" + "\""+ 
						"," +
						"\"Total_Ties\":" + "\"value" + "\""+
					"}]"+
				"} \r\n" 
					
				+" { \"Player_Move\": rock, \"Computer_Move\": paper, \"Winner\": Player } => returns: "
				+ "{"+ 
				"\"Total_Games\": \"1"+ 
				"\"," +
				"\"Player\":" + 
					"[{"+
						"\"Total_Wins\":" + "\"1"+ "\""+ 
						"," +
						"\"Total_Losses\":" + "\"0"+ "\""+ 
						"," +
						"\"Total_Ties\":" + "\"0" + "\""+
					"}]"+
				"," +
				"\"Computer\":" + 
					"[{"+
						"\"Total_Wins\":" + "\"0" + "\""+ 
						"," +
						"\"Total_Losses\":" + "\"1" + "\""+ 
						"," +
						"\"Total_Ties\":" + "\"0" + "\""+
					"}]"+
				"}" ;
	}
	
	public String RPSDescription() {
		return 	"RPS Documentation: \r\n\n"
		+ RSPPostDescription() + "\r\n\n" 
		+ SspGetDescription();
	}
	
	//***************Documentation: Rock, Paper, Scissors***************
	
	//***************Documentation: CSV fileReader***************
	
	public String ShowCsvDescription() {
		return "[GET] Endpoint /showCsvFile \r\n"
				+ "! Reads a CSV file and returns in json format \r\n"
				+ "> No parameters \r\n"
				+ "< Returns Json => { } \r\n"
				+ "/* shows a list of orders with different parameters */";
	}
	
	//***************Documentation: CSV fileReader***************
	
	//***************Documentation: Random IMG***************
	
	public String ImgDescription() {
		return "[GET] Endpoint /img \r\n"
				+ "! Selects a random image and displays it on the screen \r\n"
				+ "> No parameters \r\n"
				+ "< Returns image \r\n";
	}
	//***************Documentation: Random IMG***************
	
	public String totalDescription(){
		
		return 
				CalcDescription() + "\r\n\n" 
				+ RPSDescription() + "\r\n\n" 
				+ ShowCsvDescription() + "\r\n\n"
				+ ImgDescription();
	}


}