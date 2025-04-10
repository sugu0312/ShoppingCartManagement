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
- @ExceptionHandler annotation provided by Spring Boot can be used to handle exceptions in particular Handler classes or Handler methods.
-  We have an Shopping Cart Managament System. It contains an API to fetch an Item by ID. ShoppingService throws the exception ProductNotFoundException if an Item is not found.
# ![exceptionhandler](https://github.com/sugu0312/ShoppingCartManagement/assets/139035083/3888d317-181f-4a27-8530-f1039aff984d)


# API Reference 
## Add Item
> ```http://localhost:8080/add```
# ![add](https://github.com/sugu0312/ShoppingCartManagement/assets/139035083/a53d8c30-91ec-49c7-9ce8-3cdae4390e4e)


## Get All Items
> ```http://localhost:8080/getall```
# ![getall](https://github.com/sugu0312/ShoppingCartManagement/assets/139035083/f77d1218-ec0d-4efb-8c74-13c0570eef51)


## Update Item
> ```http://localhost:8080/update/{id}```
# 

## Get Item By ID
> ```http://localhost:8080/mylist/{id}```
# ![getbyid](https://github.com/sugu0312/ShoppingCartManagement/assets/139035083/8e0b03cb-9c7c-432a-9d0a-d6b835e65c4d)


## Delete Item
> ```http://localhost:8080/deleteMyList/{id}```
#

