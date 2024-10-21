#Auteur zribi 
Feature: loguin pages OrangeHRM

Background: 
Given Admin in loguin page 

Scenario: loguin with valid credentials 

When Admin enter correct username "Admin" and correct password "admin123"
Then Admin is redirected to the Home page 

Scenario: login with invalid credentials 

When Admin enter incorrect username "Ad12min" and incorrect password "admi23"
Then Admin is in the loguin page that contains message "Invalid credentials"