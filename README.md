# SpringBoot
## Description
This is a simplified Watchlist web app with complete CRUD functionalities including form management allowing users to add movies to their watchlist. The user is able to provide movie title, review, watchlist priority and comments. The movie title is then checked with IMDB database of movies. If the movie is already listed in IMDB, then its information are fetched using REST along with JSON object. The user provided review is then replaced with the review obtained from IMDB.

## Skills Acquired
### Software Development
The development of this web app was an opportunity to develop competencies with Spring Boot using the MVC design and the three tier-architecture of software design. It was also an opportunity to develop custum validation classes for form entries including cross-field and cross-record validations. 
Furthermore, I was able to familiarize with build in tools such as Maven to build and configure the application using it for the following tasks:

  •  Compiling source code
  
  •  Running tests
  
  •  Packaging the result into  .jar  (or  .war) files
  
  •  Deploying the results to a server
  
To display dynamic frontend pages, I used Thymeleaf engine to turn provided static HTML pages into dynamic templates that are displayed to the user.

### Quality Assurance and Testing
Used dependency injections to achieve a loose decoupling of the classes which also facilitates the unit testings. For the unit testing, mock instances were used for the methods that are refactored to achieve loose decoupling at the time of testing. Then automated unit tests were developed using JUnit and Mockito, and checked to ensure that the app is providing the expected outputs.
