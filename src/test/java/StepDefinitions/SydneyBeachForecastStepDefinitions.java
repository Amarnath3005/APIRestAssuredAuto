package StepDefinitions;

import POJO.BeachWeatherForSixteenDays;
import Utilites.Tools;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.specification.ResponseSpecification;	

public class SydneyBeachForecastStepDefinitions extends Tools {
	Tools t= new Tools();
    private ResponseSpecification res;
	private String baseUri;
	
	@Given("I like to surf beach {string} in Sydney with the {string} and {string}")
	public void I_like_to_surf_beach_in_Sydney_with_the_and(String beach, String postalCode , String countryCode) throws Throwable
	{
		log.info("Hitting the EndPoint URL for "+beach+" beach");
		 baseUri=Tools.getBaseURI();
		 res= Tools.getResponseSpec(postalCode , countryCode);
	}
	
	@When("I looked Upto the weather forecast for next three months")
	public void I_looked_Upto_the_weather_forecast_for_next_three_months()
	{
		wfrSixteen=res.when().get(baseUri).then().assertThat().statusCode(200).extract().response().as(BeachWeatherForSixteenDays.class);
		
	}
	
	@Then("I would like to surf on {string} and those days should be {string} in {string}")
	public void I_would_like_to_surf_on_and_those_days_should_be(String noOfDays, String days, String beach) throws Throwable
	{
		
		t.applyFilterForDays(noOfDays, days, beach);
	}
				
     
       @Then("I prefer the {string} to be {string} for {string}")
       public void I_prefer_the(String factor,String condition, String beach) throws Throwable
       {
    	   //t.applyFilter( factor,condition, beach);
		   applyFilter( factor,condition, beach);
       }
       
	}
	
	
	

