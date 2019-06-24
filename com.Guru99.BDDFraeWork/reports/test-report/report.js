$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Work/eclipse-workspace/com.Guru99.BDDFraeWork/Features/gurubankLoginWithExcel.feature");
formatter.feature({
  "line": 1,
  "name": "Guru bank smoke scenarios",
  "description": "",
  "id": "guru-bank-smoke-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login to GuruBank",
  "description": "",
  "id": "guru-bank-smoke-scenarios;login-to-gurubank",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Gurubank LOgin page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title is GuruBank",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enetr usename and password",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user clickis login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click on new customer link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user landed on add new customer page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user creating new customers with the input data present at \"C:\\Work\\eclipse-workspace\\com.Guru99.BDDFraeWork\\TestData\\GuruBankCustomer_Details.xlsx\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGuruBankWithExcel.gurubank_LOgin_page()"
});
formatter.result({
  "duration": 23279147394,
  "status": "passed"
});
formatter.match({
  "location": "LoginGuruBankWithExcel.title_is_GuruBank()"
});
formatter.result({
  "duration": 16365341,
  "status": "passed"
});
formatter.match({
  "location": "LoginGuruBankWithExcel.user_enetr_usename_and_password()"
});
formatter.result({
  "duration": 330637471,
  "status": "passed"
});
formatter.match({
  "location": "LoginGuruBankWithExcel.user_clickis_login_button()"
});
formatter.result({
  "duration": 6162320297,
  "status": "passed"
});
formatter.match({
  "location": "LoginGuruBankWithExcel.user_click_on_new_customer_link()"
});
formatter.result({
  "duration": 4110926460,
  "status": "passed"
});
formatter.match({
  "location": "LoginGuruBankWithExcel.user_landed_on_add_new_customer_page()"
});
formatter.result({
  "duration": 10505508,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\Work\\eclipse-workspace\\com.Guru99.BDDFraeWork\\TestData\\GuruBankCustomer_Details.xlsx",
      "offset": 60
    }
  ],
  "location": "LoginGuruBankWithExcel.user_creating_new_customers_with_the_input_data_present_at(String)"
});
formatter.result({
  "duration": 84378614805,
  "status": "passed"
});
});