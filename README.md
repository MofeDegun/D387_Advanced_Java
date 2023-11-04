Section A:
working-branch made and pushed.
URL for Repository: https://gitlab.com/wgu-gitlab-environment/student-repos/kennaheng19/d387-advanced-java/-/tree/working_branch?ref_type=heads
Section B:
README file created
URL for Repository: https://gitlab.com/wgu-gitlab-environment/student-repos/kennaheng19/d387-advanced-java/-/tree/working_branch?ref_type=heads
Section C1:
Created two resource bundles named en_US and fr_CA. Made a folder named il8n to house all files related to language translation.
Created class DisplayMessage in package il8n that will go through the languages resource bundle and return the welcome message
Created a WelcomeController that will provide frontend with API endpoint for each welcome message
Imported DisplayMessage class and Locale to Main() method. Created two instances of it running on two seperate threads.
Updated file ApiConfig to allow Angular app to make requests to the API from a different domain or port without encountering cross-origin issues
In component.ts, created HTTP GET request to call the API endpoints of the WelcomeController
Updated the component.HTML file to show the result of the GET request and show two welcome messages.
Section C2:
Added variables PriceCAD and PriceEUR to room interface in component.ts file
Added to onSubmit() function in component.ts to calculate conversion from usd to cad and eur and assign values to above variables
Edited component.html to display new prices below existing usd price.
Section C3:
Created TimeConversion class in il8n folder. Made method that returned a string for the time zone conversions of ET,MT and UTC
Created a REST Controller TimeConversionController to provide an API endpoint
Added a GET request method to request the API endpoint of the above controller in the component.ts file
Added to the components HTML file to display the converted times
Added some CSS styling in the components CSS file to make the time display look better
Section D2:
Created Docker Image
Ran Docker image in a container
Section D3:
To deploy this Spring application to the cloud, I would begin by containerizing it using Docker. This ensures that my application and its dependencies are self-contained and consistent across different environments. Once the containerization is done, I can upload the Docker image to a container registry like Amazon Elastic Container Registry.
After that, I would then set up a managed Kubernetes cluster using Amazon Elastic Kubernetes Service. I'd deploy my application to the EKS cluster, configuring environment variables, network settings, and scaling policies as needed. This approach provides a streamlined way to manage my application's deployment and resources in the cloud. 
Final Touches:
Moved docker image "app.jar" to root of project folder
Ran mvn clean and deleted UI/node_modules to remove 3rd party dependencies to lower file size
