package com.example.demo;

public class CalcService {

	public Double add(Double number1, Double number2) {
        Double sum = number1 + number2;
        return sum;
    }

    public String additionDescription() {
        return "Metoden /addition [GET] adderar två tal";
    }

    public Double sub(Double number1, Double number2) {
        Double sum = number1 - number2;
        return sum;
    }

    public String subtractionDescription() {
        return "Metoden /subtraction [GET] subtraherar två tal";
    }

    public Double multi(Double number1, Double number2) {
        Double sum = number1 * number2;
        return sum;
    }

    public String multiplicationDescription() {
        return "Metoden /multiplication [GET] multiplicerar två tal";
    }

    public Double div(Double number1, Double number2) {
        Double sum = number1 / number2;
        return sum;
    }

    public String divisionDescription() {
        return "Metoden /division [GET] dividerar två tal";
    }

    public String Description() {
        return additionDescription() + "\r\n" 
                + subtractionDescription() + "\r\n" 
                + multiplicationDescription() + "\r\n"
                + divisionDescription();
    }
}