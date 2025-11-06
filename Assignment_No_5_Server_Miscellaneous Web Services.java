=package com.mit.services;
import java.time.LocalTime;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;
public class Assignment5Server 
{
	
	// SET A1
	public String greetUser(String name) {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        String greeting;

        if (hour < 12) {
            greeting = "Good Morning";
        } else if (hour < 18) {
            greeting = "Good Afternoon";
        } else {
            greeting = "Good Evening";
        }
        return greeting + ", " + name + "!";
    }

	// SET A2
    public double celsiusToFahrenheit(double celsius) 
    {
        return (celsius * 9/5) + 32;
    }

	// SET B1
    public String validateEmail(String email) 
    {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            return "Valid Email ID: " + email;
        } else {
            return "Invalid Email ID: " + email;
        }
    }
    
	// SET B2  
    public String validateMobile(String mobile) 
    {
        String regex = "^[0-9]{10}$";  // exactly 10 digits
        if (mobile != null && mobile.matches(regex)) {
            return "Valid Mobile Number: " + mobile;
        } else {
            return "Invalid Mobile Number: " + mobile;
        }
    }
    
	// SET C1    
    public double convertFromRupees(double amount, String currency) 
    {
        double result = 0.0;

        switch(currency.toLowerCase())
         {
            case "dollar":
            case "usd":
                result = amount / 83.0;   // Approx: 1 USD = 83 INR
                break;

            case "euro":
                result = amount / 90.0;   // Approx: 1 EUR = 90 INR
                break;

            case "pound":
            case "gbp":
                result = amount / 105.0;  // Approx: 1 GBP = 105 INR
                break;

            default:
                throw new IllegalArgumentException("Unsupported currency: " + currency);
        }
        return result;
    }
    
	// SET C2
    public String[] getSuggestions(String keyword)
     {
        List<String> suggestions = new ArrayList<>();
        if (keyword == null || keyword.trim().isEmpty())
         {
            return new String[]{"No keyword entered"};
        }
        keyword = keyword.toLowerCase();
        if (keyword.startsWith("java")) {
            suggestions.add("Java Programming");
            suggestions.add("Java Web Services");
            suggestions.add("Java Spring Boot");
        } else if (keyword.startsWith("py")) {
            suggestions.add("Python Basics");
            suggestions.add("Python Data Science");
            suggestions.add("Python Machine Learning");
        } else if (keyword.startsWith("web")) {
            suggestions.add("Web Development");
            suggestions.add("Web Services");
            suggestions.add("Web Security");
        } else {
            suggestions.add("No suggestions found for: " + keyword);
        }
        return suggestions.toArray(new String[0]);
    }
    
    
 }
