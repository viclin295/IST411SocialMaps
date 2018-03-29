# IST411SocialMaps
spring application that creates a map that displays social media information

# IST 411 Project Proposal
1. Project Description - What is the high level idea of your project? This should
be similar to your daily log submission (but could have changed).

****Please read: So the strikeout does not seem to be showing up on the git pages. Starting with the /*~~ and ending with */ is like a comment block.  

!!NEW PROJECT: Using Twitter API and Facebook API alongside Google Maps API to create some kind of data visualization. For example, in the phone application Snapchat, you can zoom out on the screen to show "hotspots" on a map. The "hotspots" are determined by the amount of activity a certain location has. In my case, I want to use Twitter's hastags and tweets, to display them onto Google maps. The user can search for a specific hashtag or keyword and it will display it onto Google maps. 

2. Project Design - lower-level description.
What technologies will you use, how will they integrate?
The technologies that this project will utilize will be SpringMVC/SpringBoot, Slack API, MongoDB, TomcatApache, and possible Google Firebase. I put down both MongoDB and Firebase, because there is a possiblity that the technologies could change depending on the functionailitiess of my project. There is a very good chance that if there is a framework or technology that is easier to use and accesible, I will likely to switch over. Obviously, towards the late stages of the project, this will not happen. 

In addition to the newly proposed project, I will also be incorporating the use of Twitter's API and Google Maps API...Possibily Facebook and other social media APIs. 

  a. What are the project’s use cases?
  Use Case 1:
  Set up basic login and authentication UI as well as basic home page UI
  
  Use Case 2:  
  Communicate with Twiiter's API and get back information such as images, text, location(long, lat), etc... Format data using JSON
  or some form of of a mark up language.
  
  Use Case 3:
  
  Plot data and information onto Google Maps using the geolocation from Twitter's endpoints. Create visuals for the users on the Google   Maps. Show hotspots from the data
  
  Use Case 4:  
  
  Implement other social media APIs so that the end users are able to have access to more information. As well as implementing the APIs 
  onto the maps.
  
  Implement 
  
  Use Case 5 (if there is time):
 
  
  Use Case 6 (if there is time):
  
  
  b. Any other design docs that are necessary for me to understand your project?
  This project will be using the SpringMVC and I will most likely be using the agile method. Many of technologies listed does require extensive research. Some of the design docs come from well made chatrooms already. Examples include: 
  https://api.slack.com/
  
  https://firebase.google.com/docs/reference/
  
  https://spring.io/
  
  https://www.mongodb.com/
  
  https://developer.twitter.com/en/docs
  
  
3. Project Schedule - what will you have done at each checkpoint? What will the
final project look like?
Each checkpoint involves one or two use cases and I will try to move ahead of schedule if possible. 
Checkpoint 1:
Complete the first use case if possible second use case. The project will have a some kind of UI that displays the login and the home page after the authentication. Then continue moving on to adding messaging functionality.

Checkpoint 2:
Complete the third use case.

Checkpoint 3:
Complete the fourth use case.

Final deliverable:
Deploying the final product and put it into use. The phase before deployment will involve code clean up and fixing any bugs an errors in the program.  

4. Project Justification - why is your project interesting?
Novelty - why is your project different than existing applications, and why should people use it?

Social media have become a huge part of our daily lives and they provide more than just personal status updates, but also current events and information. I want to create some kind of web service that streamlines the information from Twitter and Facebook and showcase the highlights from the internet. Sort of like a webpage with a dashboard where the user is able to see what they want to see. In terms of novelty, it has been done before but less well known. For instance, Google created something called iGoogle which is a homepage where the users and place or pin certain webpages onto their own Google homepage. Wether its the newspaper companies or the weather, the user can place them on there. This project targets people who are social media "junkies" or anyone who browses a lot on their phones. 

