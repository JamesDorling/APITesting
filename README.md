# API Testing

This project is for a testing framework, created for testing the
current weather section of the openweather api.

## Contents
* ### [How to use](#how-to-use)
* ### [Connection Manager](#connection-manager)
* ### [DTO](#DTO)
* ### [Testing](#testing)
* ### [Team Management](#Team-management)
* ### [Resources Used](#resources-used)
* ### [What we have learned](#what-have-we-learned)

## How To Use
To use this framework, download the project and try writing tests
using the CurrentWeatherDTO.

## Connection Manager
The connection manager contains multiple methods to allow for different parameters to be passed in the connection,
for example latitude and longitude rather than city name and country code.

These methods also allow for parameters such as the measurement system used for measurements such as the temperature
(Metric, Imperial)

## DTO
The DTO contains getters for all data provided by the api; some data comes in their own DTOs, but those DTOs are also
accessible through the CurrentWeatherDTO.

The DTOs are designed to provide numerous alternative access points to data, without the need to calculate things in 
the tests. For example, the calculations for the length of a key, or if any of the data provided is null, there are
methods to work that out for you. All that you need to do is wrap it in an assertion/assumption.

## Testing


## Team Management
Our team was managed in a scrum group using a board on trello. This board is available to read from this link:

https://trello.com/b/dPkGRqEJ/api-testing-framework

Our scrum master was Pavle, and our team members were both James. The sprints lasted one day, and a small retrospective
was held at the end of each day.

## What Have We Learned
This project taught us about the cost of making a testing framework, as well as allowed us to experiment with
the restAssured framework. It also taught us the benefits of having a testing framework, as we could experiment with
our own framework, and see how much it improved the efficiency of our own test writing.
