# **Shopping Cart Management System**
# ![shoppingcart](https://github.com/sugu0312/ShoppingCartManagement/assets/139035083/348b81b3-34bf-441f-8f9c-5acd2e438a37)
# Spring Boot Project | Shopping Cart Management System |Spring Boot Data | MySql | Postman | 




- The aim of the project is to perform the basic CRUD operations, Like add, getById, getAll, delete and update. 
- and also Provided the Exception handler class to update about the Exceptions.


- Spring initializer war used to create a spring boot application project.

# ![springio](https://github.com/sugu0312/ShoppingCartManagement/assets/139035083/4fdd1e26-59ae-44a4-8ab1-cd2a28c4ca5b)


# Tools & Technologies used  :

- Java
- Spring Boot
- Postman
- MySql

# Dependency Used : 
- Spring web
- Spring Boot Dev Tool
- My Sql
- Spring Data JPA

# ![dependenciesz](https://github.com/sugu0312/ShoppingCartManagement/assets/139035083/073c0a81-7256-4438-96dc-3ec63b557c33)

# Data Flow 
## _Controller Layer :_ ##
- It consists of UserController class which basically control the flow of data.
- @RestController annotation is used to make the UserController class as controller layer.
- @GetMapping , @PostMapping , @PutMapping , @DeleteMapping annotations are used to perform the CRUD operations.
# ![controller](https://github.com/sugu0312/ShoppingCartManagement/assets/139035083/dda16bc1-1a41-4b5a-af42-8ed0cdc05acc)

## _Service Layer :_ ##
- It consists of UserService class which helps us to write the business functionalities.
- @Service annotation is used to make the class as a service layer.
# ![service](https://github.com/sugu0312/ShoppingCartManagement/assets/139035083/1086f024-80cf-47b3-9426-ae3f6c6d6532)


## _Repositary Layer :_ ##
- It consists of UserDao which is used to manage the datas.
- @Repository annotation is used to make the class repository layer.
# ![repo](https://github.com/sugu0312/ShoppingCartManagement/assets/139035083/7fdcbcf6-3ec5-42f8-86f2-d20d3227aa7d)


## _Entity Layer :_ ##
- It consists of a User class which consists of Entity's used to model our data application.
- For each of our data , constructors , getters and setters are created.
# ![entity](https://github.com/sugu0312/ShoppingCartManagement/assets/139035083/f50b6d8a-bbaa-4778-9303-57dc56355183)

## _Exception Layers :_ ##
- 
- @ExceptionHandler annotation provided by Spring Boot can be used to handle exceptions in particular Handler classes or Handler methods.
# ![exceptionhandler](https://github.com/sugu0312/ShoppingCartManagement/assets/139035083/3888d317-181f-4a27-8530-f1039aff984d)


# API Reference 
## Add Item
> ```http://localhost:8080/add```
# ![add book](https://github.com/sugu0312/BookStoreManagement/assets/139035083/d87df00b-7742-487e-9827-a2dbe8d2c7cc)

## Get All Items
> ```http://localhost:8080/getall```
# ![getll all books](https://github.com/sugu0312/BookStoreManagement/assets/139035083/8424b4e6-15ac-4508-8f28-bb4489bc8f0f)

## Update Item
> ```http://localhost:8080/update/{id}```
# ![edit book](https://github.com/sugu0312/BookStoreManagement/assets/139035083/6b7fc6c3-db07-4ac0-bddd-505a334b5197)

## Get Item By ID
> ```http://localhost:8080/mylist/{id}```
# ![getbyID](https://github.com/sugu0312/BookStoreManagement/assets/139035083/fafc4880-21f7-4e8e-9c36-e839cde6c9d3)

## Delete Item
> ```http://localhost:8080/deleteMyList/{id}```
# ![deletebook](https://github.com/sugu0312/BookStoreManagement/assets/139035083/cc2ac053-8127-4b5a-8900-aeda77da5b75)

