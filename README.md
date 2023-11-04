#Scenario
You are working for a company located in Toronto, Canada, that schedules hotel reservations. As a software developer, your job is to modify the Landon Hotel scheduling application to meet new requirements under new management. You will choose any application user you would like.

##A.   Create a private external GitLab repository named “yourstudentID_D387” and do the following:

•   Push the code from the IDE to the repository.

•   Add “WGU-Evaluation” as a member with reporter access to your repository on GitLab.

•   Commit with a message and push when you complete each requirement listed in parts C1, C2, C3, D2, and D3.


Note: You may commit and push whenever you want to back up your changes, even if a requirement is not yet complete.


•   Submit a copy of the GitLab repository URL and a copy of the repository branch history created following the completion of all task requirements and retrieved from your repository, which must include the commit messages and dates.


##B.   Create a README file that includes the following:

1.   Include notes describing where in the code to find the changes you made for each requirement in parts C1, C2, C3, D2, and D3. Each note should include the label for the task requirement (e.g., C1, C2), file name, line number, and change.

2.   Include the URL to the GitLab repository.


##C.   Modify the Landon Hotel scheduling application for localization and internationalization by doing the following:

1.   Install the Landon Hotel scheduling application in your integrated development environment (IDE). Modify the Java classes of application to display a welcome message by doing the following:

a.   Build resource bundles for both English and French (languages required by Canadian law). Include a welcome message in the language resource bundles.

b.   Display the welcome message in both English and French by applying the resource bundles using a different thread for each language.


Note: You may use Google Translate for the wording of your welcome message.


2.   Modify the front end to display the price for a reservation in currency rates for U.S. dollars ($), Canadian dollars (C$), and euros (€) on different lines.


Note: It is not necessary to convert the values of the prices.


3.   Display the time for an online live presentation held at the Landon Hotel by doing the following:

a.   Write a Java method to convert times between eastern time (ET), mountain time (MT), and coordinated universal time (UTC) zones.

b.   Use the time zone conversion method from part C3a to display a message stating the time in all three times zones in hours and minutes for an online, live presentation held at the Landon Hotel. The times should be displayed as ET, MT, and UTC.


Note: Remember to update your README file after every requirement.


##D.   Explain how you would deploy the Spring application with a Java back end and an Angular front end to cloud services and create a Dockerfile using the attached supporting document “How to Create a Docker Account” by doing the following:

1.   Build the Dockerfile to create a single image that includes all code, including modifications made in parts C1 to C3. Commit and push the final Dockerfile to GitLab.

2.   Test the Dockerfile by doing the following:

•   Create a Docker image of the current multithreaded Spring application.

•   Run the Docker image in a container and give the container a name that includes D387_[student ID].

•   Submit a screenshot capture of the running application with evidence it is running in the container.

3.   Describe how you would deploy the current multithreaded Spring application to the cloud. Include the name of the cloud service provider you would use.


Note: Remember to commit and push your changes to GitLab.


##E.   Export your project from the IDE as a compressed file.


Note: You will submit the compressed file with the repository branch history file and the URL to the GitLab repository that contains the Dockerfile. Make sure both the Angular front end and the multithreaded Spring application are both submitted.


##F.   Demonstrate professional communication in the content and presentation of your submission.





##Section A:

working-branch made and pushed.

##Section B:

README file created

##Section C1:

Created two resource bundles named en_US and fr_CA. Made a folder named il8n to house all files related to language translation.

Created class DisplayMessage in package il8n that will go through the languages resource bundle and return the welcome message

Created a WelcomeController that will provide frontend with API endpoint for each welcome message

Imported DisplayMessage class and Locale to Main() method. Created two instances of it running on two seperate threads.

Updated file ApiConfig to allow Angular app to make requests to the API from a different domain or port without encountering cross-origin issues

In component.ts, created HTTP GET request to call the API endpoints of the WelcomeController

Updated the component.HTML file to show the result of the GET request and show two welcome messages.

##Section C2:
Added variables PriceCAD and PriceEUR to room interface in component.ts file

Added to onSubmit() function in component.ts to calculate conversion from usd to cad and eur and assign values to above variables

Edited component.html to display new prices below existing usd price.

##Section C3:

Created TimeConversion class in il8n folder. Made method that returned a string for the time zone conversions of ET,MT and UTC

Created a REST Controller TimeConversionController to provide an API endpoint

Added a GET request method to request the API endpoint of the above controller in the component.ts file

Added to the components HTML file to display the converted times

Added some CSS styling in the components CSS file to make the time display look better

##Section D2:

Created Docker Image

Ran Docker image in a container

##Section D3:

To deploy this Spring application to the cloud, I would begin by containerizing it using Docker. This ensures that my application and its dependencies are self-contained and consistent across different environments.

Once the containerization is done, I can upload the Docker image to a container registry like Amazon Elastic Container Registry.

After that, I would then set up a managed Kubernetes cluster using Amazon Elastic Kubernetes Service. 

I'd deploy my application to the EKS cluster, configuring environment variables, network settings, and scaling policies as needed. 

This approach provides a streamlined way to manage my application's deployment and resources in the cloud. 

##Final Touches:

Moved docker image "app.jar" to root of project folder

Ran mvn clean and deleted UI/node_modules to remove 3rd party dependencies to lower file size
