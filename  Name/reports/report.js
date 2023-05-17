$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Sindhuja/OneDrive/Documents/Projects/Demo/src/test/java/Feature File/DemoQA.feature");
formatter.feature({
  "name": "Validate the Text box fields",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Enter the Valid datas",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch the url",
  "keyword": "Given "
});
formatter.match({
  "location": "TextboxStepDefn.launch_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Full Name, Email and Current Address",
  "keyword": "When "
});
formatter.match({
  "location": "TextboxStepDefn.enter_Full_Name_Email_and_Current_Address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "TextboxStepDefn.click_submit_button()"
});
formatter.result({
  "status": "passed"
});
});