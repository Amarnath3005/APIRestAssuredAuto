Feature: Beach Weather forecast for surfing of the Top beaches
@forecast
Scenario Outline: As a choosey surfer wanting to visit "<beach>" on Monday and Tuesday in next sixteen Days "<Scenario>" - "<Description>"
Given I like to surf beach "<beach>" in Sydney with the "<postalCode>" and "<country>"
When I looked Upto the weather forecast for next three months
Then I would like to surf on "<noOfDays>" and those days should be "<days>" in "<beach>"
And I prefer the "<value2>" to be "<tempRange>" for "<beach>"
And I prefer the "<value3>" to be "<uvIndex>" for "<beach>"

Examples:
|beach    |postalCode|country|noOfDays|days                    | tempRange| uvIndex|value2    | value3|Scenario    |Description                       |
#POSITIVE SCENARIOS - WHEN THE DAYS ARE MONDAY OR FRIDAY
|CurlCurl   |2096      |AU     |2       |monday friday         | 12and30  |12       |temperature|uv      |POSITIVE |  Best Day to visit Curl Curl             |
|DeeWhy   |2099      |AU     |2       |monday friday         | 12and30  |12       |temperature|uv      |POSITIVE |  Best Day to visit Dee Why             |
|Shelly   |2261      |AU     |2       |monday friday         | 12and30  |12      |temperature|uv      |POSITIVE |  Best Day to visit Shelly             |
|Bondi    |2026      |AU     |2       |monday friday         | 12and30  |12       |temperature|uv      |POSITIVE |  Best Day to visit Bondi            |
|Balmoral    |2088      |AU     |2       |monday friday         | 12and30  |12       |temperature|uv      |POSITIVE |  Best Day to visit Balmoral			|
# NEGATIVE SCENARIO - WHEN THE DAYS ARE NOT MONDAY OR FRIDAY  
|Shelly   |2261      |AU     |2       |tuesday thursday         | 12and30  |12      |temperature|uv      |POSITIVE |  ITS NOT A MONDAY OR FRIDAY             |
# NEGATIVE SCENARIO - WHEN THE NUMBER OF DAYS IS NOT EQUAL TO 2
|Balmoral    |2088      |AU     |3       |monday friday         | 12and30  |12       |temperature|uv      |POSITIVE |  NUMBER OF DAYS IS MORE THAN 3			|
