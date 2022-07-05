$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyFirstTest.feature");
formatter.feature({
  "line": 1,
  "name": "Reset functionality on login page of Application",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verification of Reset button",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the Firefox and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the Username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Reset the credential",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("Orange.feature");
formatter.feature({
  "line": 1,
  "name": "Login to HRM Application",
  "description": "",
  "id": "login-to-hrm-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login-to-hrm-application;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@ValidCredentials"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on HRMLogin page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters username as \"Admin\" and password as \"admin123\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should be able to login sucessfully and new page open",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});