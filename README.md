# DoorRush Delivery
## Introduction
• Developed a food delivery website with a client-side order system and a backstage management system with **Vue**, **Spring-
Boot** and **MyBatis-Plus**\
• Reduced database calls by adding menu data into **Redis** with **Spring Cache**\
• Improved overall system performance by reducing the load of the primary database through read/write splitting\
• Improved scalability by separating the front-end and back-end into different servers, specifically, using **Nginx** to serve static
resources on one server, and deploy the **SpringBoot** application on Tomcat server
## Backstage Management System
### User Login
![Screen Shot 2023-02-02 at 5 55 58 PM](https://user-images.githubusercontent.com/49115822/216674969-1ca234b9-656f-4faa-8bb9-64cc226fe278.png)
### Employee Management System (Home Page)
This page shows the information of all employees, including their username, name, phone number, and status (active or deactivated).
You can add a new employee or search by name or edit or deactivate/active employees in this page.\
![Screen Shot 2023-02-02 at 5 56 19 PM](https://user-images.githubusercontent.com/49115822/216675161-a2cd6584-f319-48bc-a2f5-af5a352402f3.png)
#### Login Filter
If a user has not logged in, but still want to visit page other than the login page, we will redirect him to login page.
#### Adding New Employee
![Screen Shot 2023-02-02 at 6 33 05 PM](https://user-images.githubusercontent.com/49115822/216681899-a286e072-8346-4f2b-94a0-fc65f9135f36.png)

### Category Management System
Category name can be splited into two parts: Dish Category and Combo Category. Dish Category, for example, includes Beef, Chicken, and etc, while Lunch Set, and Kids Meal belongs to Combo Category.
All the categories are ordered by ranking.\
Functions including edit, delete, search, and add are implemented in this page.\
![Screen Shot 2023-02-02 at 5 56 31 PM](https://user-images.githubusercontent.com/49115822/216675664-69c35b21-bf7e-4058-8ec1-f0512f67c8fd.png)
#### Adding New Category
![Screen Shot 2023-02-02 at 6 33 30 PM](https://user-images.githubusercontent.com/49115822/216682344-dff2d1fa-0c3e-4e2d-ac06-c4abf7c1d0c4.png)
### Dish Management System
Besides the basic add, delete, edit, search functions, in this page, you can select several items and apply an operation on them by clicking only one button.(Delete Selected/Activate Selected/Deactivate Selected)
![Screen Shot 2023-02-02 at 5 56 45 PM](https://user-images.githubusercontent.com/49115822/216676941-3960ddac-f743-4457-b364-2c6e5b306452.png)

## Client-side Order System
### User Login
We will send vertification code to the input phone number. If this is a new user(the phone number does not exist in our database), we will add it to our database automatically.\
![Screen Shot 2023-02-02 at 6 12 38 PM](https://user-images.githubusercontent.com/49115822/216677552-354e1247-e012-41b7-8d33-9eae2e9a235f.png)
### Home Page
Users can add food to their cart.
#### Before Adding Food
![Screen Shot 2023-02-02 at 6 13 30 PM](https://user-images.githubusercontent.com/49115822/216677823-a5e01d9c-c64f-4db2-a02a-e73d88d76eae.png)
#### After Adding Food
![Screen Shot 2023-02-02 at 6 17 38 PM](https://user-images.githubusercontent.com/49115822/216680902-83dd489b-232e-4d7b-969f-b7ec6fa634a1.png)
### Page of Adding New Address
![Screen Shot 2023-02-02 at 6 14 03 PM](https://user-images.githubusercontent.com/49115822/216680336-3bb2636a-62c0-4308-8daa-22fda722b3db.png)
### My Account Page
![Screen Shot 2023-02-02 at 6 21 22 PM](https://user-images.githubusercontent.com/49115822/216681469-dd0b4ba4-d4d9-4427-ad28-0c5481c05e98.png)
### Previous Order Page
![Screen Shot 2023-02-02 at 6 21 30 PM](https://user-images.githubusercontent.com/49115822/216681544-cfa64262-c371-4105-bad2-a57454f3d750.png)
### My Addresses Page
This page displays all address of current user.\
![Screen Shot 2023-02-02 at 6 15 00 PM](https://user-images.githubusercontent.com/49115822/216680784-b2904f1c-2e16-40eb-97fb-783683da76d1.png)
### Check Out Page
![Screen Shot 2023-02-02 at 6 17 46 PM](https://user-images.githubusercontent.com/49115822/216680982-4e3bd4ef-c7e4-441c-b4cd-37c91d2c652f.png)
### After you check out
![Screen Shot 2023-02-02 at 6 20 05 PM](https://user-images.githubusercontent.com/49115822/216681064-6480facc-ec97-4f74-ad65-1be58b6fb3a7.png)
