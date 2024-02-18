# **Shopping Cart Management System**
Spring Boot Project | Shopping Cart Management System |Spring Boot Data | MySql | Postman | 

- The aim of the project is to perform the basic CRUD operations, Like add, getById, getAll, delete and update. 
- and also Provided the Exception handler class to update about the Exceptions.


- Spring initializer war used to create a spring boot application project.

# ![springio](https://github.com/sugu0312/ShoppingCartManagement/assets/139035083/4fdd1e26-59ae-44a4-8ab1-cd2a28c4ca5b)


# Tools & Technologies used  :

+ Java
- Spring Boot
- Postman
- MySql

# Dependency Used : 
- Spring web
- Spring Boot Dev Tool
- My Sql
- Spring Data JPA

# ![dependenciesz](https://github.com/sugu0312/ShoppingCartManagement/assets/139035083/073c0a81-7256-4438-96dc-3ec63b557c33)










# 

# Data Flow 
## _Controller Layer :_ ##
- It consists of UserController class which basically control the flow of data.
- @RestController annotation is used to make the UserController class as controller layer.
- @GetMapping , @PostMapping , @PutMapping , @DeleteMapping annotations are used to perform the CRUD operations.
# ![controller](https://github.com/sugu0312/BookStoreManagement/assets/139035083/1c439709-e6a1-4928-8d4a-970b917431bc)
## _Service Layer :_ ##
- It consists of UserService class which helps us to write the business functionalities.
- @Service annotation is used to make the class as a service layer.
# ![service](https://github.com/sugu0312/BookStoreManagement/assets/139035083/d66c7e50-c425-40cf-b9e4-e5e6208fa109)

## _Repositary Layer :_ ##
- It consists of UserDao which is used to manage the datas.
- @Repository annotation is used to make the class repository layer.
# ![repo](https://github.com/sugu0312/BookStoreManagement/assets/139035083/cafb0523-ff78-4f79-bbaf-a60af22c92c1)

## _Entity Layer :_ ##
- It consists of a User class which consists of Entity's used to model our data application.
- For each of our data , constructors , getters and setters are created.
# ![Entity](https://github.com/sugu0312/BookStoreManagement/assets/139035083/e912987f-500b-48c3-bf39-a142659c6123)

# API Reference 
## Add book
> ```http://localhost:8080/book_register```
# ![add book](https://github.com/sugu0312/BookStoreManagement/assets/139035083/d87df00b-7742-487e-9827-a2dbe8d2c7cc)

## Get All Book
> ```http://localhost:8080/available_books```
# ![getll all books](https://github.com/sugu0312/BookStoreManagement/assets/139035083/8424b4e6-15ac-4508-8f28-bb4489bc8f0f)

## Update Book
> ```http://localhost:8080/editBook/{id}```
# ![edit book](https://github.com/sugu0312/BookStoreManagement/assets/139035083/6b7fc6c3-db07-4ac0-bddd-505a334b5197)

## Get Book By ID
> ```http://localhost:8080/mylist/{id}```
# ![getbyID](https://github.com/sugu0312/BookStoreManagement/assets/139035083/fafc4880-21f7-4e8e-9c36-e839cde6c9d3)


## Delete Book
> ```http://localhost:8080/deleteMyList/{id}```
# ![deletebook](https://github.com/sugu0312/BookStoreManagement/assets/139035083/cc2ac053-8127-4b5a-8900-aeda77da5b75)

