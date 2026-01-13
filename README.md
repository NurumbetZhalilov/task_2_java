<h1>Second Java Project</h1>
<h2>Overview</h2>
<p>A fully functional RESTful API for managing a Product catalog, built with Spring Boot and integrated with an H2 database.</p>
<h3>Key Accomplishments</h3>
<ol>
  <li>Layered Architecture: Implemented Controller, Service, Repository, and Domain layers.</li>
  <li>CRUD Operations: Full support for Creating, Reading, Updating, and Deleting products.</li>
  <li>Persistence: Migrated from in-memory Maps to Spring Data JPA with an H2 SQL database.</li>
  <li>Error Handling: Global Exception Handler (@ControllerAdvice) for custom 404 error messages.</li>
  <li>Documentation: Interactive API testing via Swagger UI.</li>
</ol>

<h5>How to test</h5>
<ol>
  <li>Run the application in IntelliJ IDEA.</li>
<li>API Documentation: Go to http://localhost:8080/swagger-ui/index.html</li>
<li>Database Console: Go to http://localhost:8080/console (JDBC URL: jdbc:h2:mem:testdb, User: sa).</li>
</ol>

<h3>My work in screenshots</h3>
Here I am using method POST to create id 1 with my name
<img width="1920" height="1080" alt="Снимок экрана (4)" src="https://github.com/user-attachments/assets/03afa497-5984-4948-ab52-a6b835f1eade" />

Using GET I check if the id 1 with name Nurumber was created and output is status 200 which means i was created successfully
<img width="1920" height="1080" alt="Снимок экрана (5)" src="https://github.com/user-attachments/assets/271e6af3-39cc-41a1-af06-52e94c17d6ce" />

On this screenshot with method PUT we can change the created name, I am chenging Nurumbet to another name: Azimbek
<img width="1920" height="1080" alt="Снимок экрана (6)" src="https://github.com/user-attachments/assets/899a7135-5137-4304-ba5c-79cf84fc505f" />

And here with method DELETE we can delete created id which shows us status 204 which means "No Content" to display
<img width="1920" height="1080" alt="Снимок экрана (7)" src="https://github.com/user-attachments/assets/2d143cde-6c67-48c8-9f5f-457466906c86" />

Also we added Operation with summary - To find all products and on this screen we see all ids and names I created
<img width="1920" height="1080" alt="Снимок экрана (8)" src="https://github.com/user-attachments/assets/49cd61b7-cd3b-444e-9ffb-fc7aa31b96a1" />


And finally, because we added databases it means that we can keep all created products in our base and using SELECT * FROM PRODUCTS we can see every product in table
<img width="1920" height="1080" alt="Снимок экрана (9)" src="https://github.com/user-attachments/assets/52914132-486a-4ce5-8f47-60282d01358a" />


<h2>Conclusion</h2>
<p>This project demonstates the core principles of building a modern backend application with Spring Boot. Also I enjoyed doing it because working with statuses and databases fully relates to fiels that I would like to learn in IT sphere.</p>








