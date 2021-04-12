Project:

RestAssured API Automation

The Mission:

To implement a test to automate the following acceptance criteria (in the form of a BDD)

TECH/Framework Used:

1.) Java
2.) RestAssured
3.) Maven
4.) Cucumber
5.) Maven-Cucumber-Reporting


Features:

1.)RestAssured is used for API Testing
2.)POJO classes are used for Serialization and deserialization (setter and getter method)
3.)Request and Response Builders , POJO classes are used for reuseability of the code
4.)Maven - Build management tool and Project Management tool is used for projects build, dependency and documentation.
5.)The End Point URL's and key is maintained in global Properties files for reuseablility purposes
6.)Setup and Teardown is added for every test and is captured in logs.
7.)Basic Maven Cucumber reporting tool has been integrated.


Installation:

Java
Maven

Execution:

To run the script from a Terminal/Command Prompt 

Open the terminal/Command Prompt and navigate to the folder where the scripts are. They are in the workspace/folder. Navigate till 'BeachWeatherForecastAPIAutomation'. eg., /Users/amarnathvattigunta/Desktop/autotoauto/BeachWeatherForecastAPIAutomation

Then type the following command and click on enter.

mvn test verify -Dcucumber.options="--tags @forecast"


Reports:

Navigate to project and reports can be found in below location.
/AustraliaBeachesWeatherForecast/target/report/cucumber-html-reports/report-feature_3620947105.html

Logs:

BeachWeatherForecastAPIAutomation/src/test/java/Logs/APILog.log


Assumptions:

1.)The response for GET request provides one location at a time.Therefore validation is performed on one location at a time
2.)The weather forecast is for the next 16 days based on the API response
3.)The days surfer wants to visit the beach is Monday and Friday
4.)The preferred forecast for the surfer on Monday and Friday are temperature is between 12 -30 and UV is less than or equal to 12.
5.)Validating for beaches around Sydney based on the above parameters  days of the week, temperature, UV and number of days





