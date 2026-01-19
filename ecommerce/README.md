# Ecommerce Backend Application (Spring Boot)

This project is a **Spring Boot based E-commerce Backend Application** developed as part of an academic assignment.

The application demonstrates core backend concepts such as REST APIs, layered architecture, database interaction using JPA, and a complete order-to-payment flow using a **mock payment service**.

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- Maven
- H2 In-Memory Database

---

## ✨ Features Implemented

- Product Management (Add and View Products)
- Cart Functionality
- Order Creation
- Mock Payment Processing
- Payment Status Handling
- RESTful APIs
- H2 Database Console for testing

> Note: Payment is implemented using a **mock payment mechanism** for simplicity and academic purposes.

---

## 🧱 Project Structure

com.example.ecommerce
│
├── controller
├── service
├── repository
├── entity
├── enums
└── EcommerceApplication.java

yaml
Copy code

---

## 🚀 How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/ecommerce-spring-boot.git
Open the project in IntelliJ IDEA or Eclipse

Run the application by executing:

Copy code
EcommerceApplication.java
The application will start on:

arduino
Copy code
http://localhost:8080
🔗 API Endpoints
Method	Endpoint	Description
GET	/products	Get all products
POST	/products	Add a new product
GET	/cart	View cart items
POST	/cart	Add item to cart
POST	/orders	Create an order
POST	/payment	Process mock payment

🗄️ H2 Database Console
You can view the in-memory database using the H2 console.

URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (leave empty)

📌 Notes
This project is a simplified implementation of an e-commerce backend.

Advanced features such as authentication, real payment gateway integration, and microservices are intentionally not included.

The focus is on understanding backend flow and architecture.

👩‍💻 Author
Name: Your Name

GitHub: https://github.com/<your-username>

yaml
Copy code

---









