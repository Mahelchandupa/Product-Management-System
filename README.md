# Simple Product Management Application

This is a simple product management application built using Java. The application showcases basic CRUD (Create, Read, Update, Delete) operations, allowing users to manage a list of products. It is designed to be a straightforward example of how to handle product-related data in a Java application.

## Description

The Product Management Application is designed to help users manage a list of products with ease. It provides functionalities to add new products, retrieve existing products by various criteria, update product details, and delete products. The application is divided into three main components:

<ol>
  <li>Main Class: The entry point of the application that demonstrates the use of the product management functionalities.</li>
  <li>ProductService Class: Contains the business logic for managing products, including methods to add, retrieve, update, and delete products.</li>
  <li>Product Class: Represents the product entity with attributes such as ID, name, type, place, and warranty.</li>
</ol>

## Features

<ul>
  <li>Add Products: Users can add new products to the list by providing details such as name, type, place, and warranty.</li>
  <li>Retrieve Products: Users can retrieve products by ID, name, or by matching any of the attributes (name, type, or place).</li>
  <li>Update Products: Users can update the details of an existing product.</li>
  <li>Delete Products: Users can delete a product from the list by its ID.</li>
  <li>List All Products: Users can view a list of all products currently in the system.</li>
</ul>

## Example Usage

<b> Upon running the application, the following operations are performed:</b>

<ol>
  <li>Several products are added to the list.</li>
  <li>The list of all products is displayed.</li>
  <li>A product is retrieved by its ID.</li>
  <li>A product is retrieved by its name.</li>
  <li>Products are retrieved by a search term that matches the name, type, or place.</li>
  <li>A product is updated.</li>
  <li>A product is deleted.</li>
  <li>The list of all products is displayed again after the update and delete operations.</li>
</ol>

## Installation and Usage

<ol>
<li>Clone the repository:</li>
  
```
git clone https://github.com/yourusername/product-management-app.git
cd product-management-app
```

<li>Clone the repository:</li>

```
javac Main.java service/ProductService.java entity/Product.java
```

<li>Run the application:</li>

```
java Main
```
</ol>

