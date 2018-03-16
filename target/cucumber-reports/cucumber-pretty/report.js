$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myfeatures/LoginTest.Feature");
formatter.feature({
  "line": 1,
  "name": "Update Profile",
  "description": "As an employee of the company\r\nI want to be able to update my name, projects, email, and phone numbers on my profile\r\nIn order to share my contact information with my colleagues",
  "id": "update-profile",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 6,
      "value": "#@tag1"
    }
  ],
  "line": 7,
  "name": "",
  "description": "",
  "id": "update-profile;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I am on the \"\u003cpageName\u003e\" page on URL \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "comments": [
    {
      "line": 10,
      "value": "#@tag1"
    }
  ],
  "line": 11,
  "name": "",
  "description": "",
  "id": "update-profile;;",
  "rows": [
    {
      "cells": [
        "aaa",
        "ccc"
      ],
      "line": 12,
      "id": "update-profile;;;1"
    }
  ],
  "keyword": "Examples"
});
formatter.examples({
  "comments": [
    {
      "line": 14,
      "value": "#@tag2"
    }
  ],
  "line": 15,
  "name": "",
  "description": "",
  "id": "update-profile;;",
  "rows": [
    {
      "cells": [
        "pageName",
        "url"
      ],
      "line": 16,
      "id": "update-profile;;;1"
    },
    {
      "cells": [
        "ddd",
        "fff"
      ],
      "line": 17,
      "id": "update-profile;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 558066,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "",
  "id": "update-profile;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I am on the \"ddd\" page on URL \"fff\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "ddd",
      "offset": 13
    },
    {
      "val": "fff",
      "offset": 31
    }
  ],
  "location": "StepDefinitions.i_am_on_the_page_on_URL(String,String)"
});
formatter.result({
  "duration": 119294269,
  "status": "passed"
});
formatter.after({
  "duration": 118560,
  "status": "passed"
});
});