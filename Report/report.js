$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/sample.feature");
formatter.feature({
  "name": "To validate the login functionality of facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "Cucumber4ch.launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login of facebook",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "To launch the url of fb",
  "keyword": "When "
});
formatter.match({
  "location": "Cucumber4ch.to_launch_the_url_of_fb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the email in \"\u003ccucmber@gmail.com\u003e\" email field",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber4ch.to_pass_the_email_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the password \"\u003cpassworddatas\u003e\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber4ch.to_pass_the_password_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber4ch.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Cucumber4ch.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User has to login fb",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User has to launch url",
  "keyword": "When "
});
formatter.step({
  "name": "User has to pass \"\u003cemaildatas\u003e\" the email",
  "keyword": "And "
});
formatter.step({
  "name": "User has to pass \"\u003cpassworddatas\u003e\" the password",
  "keyword": "And "
});
formatter.step({
  "name": "User has to click login",
  "keyword": "And "
});
formatter.step({
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emaildatas",
        "passworddatas"
      ]
    },
    {
      "cells": [
        "vinoth123@gmail.com",
        "12345678"
      ]
    },
    {
      "cells": [
        "vijay321@gmail.com",
        "87654321"
      ]
    },
    {
      "cells": [
        "abcd123@gmail.com",
        "vvvvvvvv"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "Cucumber4ch.launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User has to login fb",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User has to launch url",
  "keyword": "When "
});
formatter.match({
  "location": "Cucumber4ch.user_has_to_launch_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass \"vinoth123@gmail.com\" the email",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber4ch.user_has_to_pass_the_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass \"12345678\" the password",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber4ch.user_has_to_pass_the_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click login",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber4ch.user_has_to_click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Cucumber4ch.user_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "Cucumber4ch.launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User has to login fb",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User has to launch url",
  "keyword": "When "
});
formatter.match({
  "location": "Cucumber4ch.user_has_to_launch_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass \"vijay321@gmail.com\" the email",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber4ch.user_has_to_pass_the_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass \"87654321\" the password",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber4ch.user_has_to_pass_the_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click login",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber4ch.user_has_to_click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Cucumber4ch.user_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "Cucumber4ch.launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User has to login fb",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User has to launch url",
  "keyword": "When "
});
formatter.match({
  "location": "Cucumber4ch.user_has_to_launch_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass \"abcd123@gmail.com\" the email",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber4ch.user_has_to_pass_the_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass \"vvvvvvvv\" the password",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber4ch.user_has_to_pass_the_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click login",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber4ch.user_has_to_click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Cucumber4ch.user_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});