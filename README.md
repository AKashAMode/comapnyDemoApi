Product Catalog API
A Spring Boot application implementing a product catalog with categories and products, featuring CRUD operations, pagination, and one-to-many relationships.

Features
✅ Category Management: Full CRUD operations for product categories

✅ Product Management: Full CRUD operations for products

✅ Relationships: One-to-many relationship between categories and products

✅ Pagination: Server-side pagination for all list endpoints

✅ API Documentation: Clear endpoint specifications

Technologies
Java 17

Spring Boot 3.x

Spring Data JPA

Hibernate

MySQL (or other RDBMS)

Maven

API Endpoints
Category Endpoints
Method	Endpoint	Description
GET	/api/categories?page={page}&size={size}	Get paginated list of categories
POST	/api/categories	Create a new category
GET	/api/categories/{id}	Get category by ID
PUT	/api/categories/{id}	Update category
DELETE	/api/categories/{id}	Delete category
Product Endpoints
Method	Endpoint	Description
GET	/api/products?page={page}&size={size}	Get paginated list of products
POST	/api/products	Create a new product
GET	/api/products/{id}	Get product by ID (includes category details)
PUT	/api/products/{id}	Update product
DELETE	/api/products/{id}	Delete product
Request/Response Examples
Create Category
json
POST /api/categories
{
    "name": "Electronics"
}
Create Product
json
POST /api/products
{
    "productName": "Smartphone",
    "description": "Latest model",
    "price": 799.99,
    "category": {
        "id": 1
    }
}
Get Product Response
json
{
    "id": 1,
    "productName": "Smartphone",
    "description": "Latest model",
    "price": 799.99,
    "category": {
        "id": 1,
        "name": "Electronics"
    }
}
Setup Instructions
Prerequisites:

Java 17

MySQL 8.x

Maven

Database Setup:

Create a MySQL database

Update application.properties:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
Build and Run:

bash
mvn clean install
mvn spring-boot:run
Pagination
All list endpoints support pagination:

page: Page number (0-based)

size: Items per page (default=10)

Example:

GET /api/products?page=0&size=5
Testing
Test the API using Postman or curl:

bash
# Get all products
curl http://localhost:8080/api/products

# Create a product
curl -X POST -H "Content-Type: application/json" \
-d '{"productName":"Laptop","description":"High performance","price":1299.99,"category":{"id":1}}' \
http://localhost:8080/api/products
Project Structure
src/
├── main/
│   ├── java/
│   │   └── com/example/demo/
│   │       ├── controller/       # REST controllers
│   │       ├── dto/              # Data Transfer Objects
│   │       ├── entity/           # JPA entities
            ├── Exception/        # Handle Exceptions
│   │       ├── repository/       # Spring Data repositories
│   │       ├── service/          # Business logic
│   │       └── DemoApplication.java
│   └── resources/
│       └── application.properties # Configuration
