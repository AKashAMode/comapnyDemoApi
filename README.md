
# Spring Boot comapnyDemoApi

A RESTful API for managing products and categories with one-to-many relationships, built with Spring Boot and JPA/Hibernate.

## Features

✅ Complete CRUD operations for Products and Categories  
✅ One-to-Many relationship (Category → Products)  
✅ Server-side pagination  
✅ MySQL database integration  
✅ Proper error handling  

## Requirements Implemented

- [x] Spring Boot
- [x] REST Controllers
- [x] MySQL RDB configuration
- [x] Annotation-based configuration
- [x] JPA & Hibernate

## API Endpoints

### Category Operations

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/api/categories?page={page}&size={size}` | Get paginated categories |
| POST   | `/api/categories` | Create new category |
| GET    | `/api/categories/{id}` | Get category by ID |
| PUT    | `/api/categories/{id}` | Update category |
| DELETE | `/api/categories/{id}` | Delete category |

### Product Operations

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/api/products?page={page}&size={size}` | Get paginated products |
| POST   | `/api/products` | Create new product |
| GET    | `/api/products/{id}` | Get product with category details |
| PUT    | `/api/products/{id}` | Update product |
| DELETE | `/api/products/{id}` | Delete product |


