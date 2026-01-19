# 🛒 Ecommerce Backend Application (Spring Boot)

This project is a **Spring Boot based Ecommerce Backend Application** developed for academic submission.

It demonstrates how a basic ecommerce system works on the backend, including **products, cart, orders, and payments**, using a **mock payment flow** instead of a real payment gateway.

---

## 🛠 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- H2 In-Memory Database
- Postman (for API testing)

---

## ✨ Features Implemented

- Product Management (Create & View Products)
- Cart Management (Add items to cart, view cart)
- Order Creation
- Payment Processing (Mock Payment)
- Order Status Update via Webhook
- RESTful APIs
- H2 Database Console

> ⚠️ Payment is implemented using a **mock payment + webhook mechanism** (no Razorpay).

---

## 🧱 Project Structure

com.example.ecommerce
│
├── controller
│ ├── ProductController
│ ├── CartController
│ ├── OrderController
│ ├── PaymentController
│ └── WebhookController
│
├── service
│ ├── ProductService
│ ├── CartService
│ ├── OrderService
│ └── PaymentService
│
├── repository
│ ├── ProductRepository
│ ├── CartRepository
│ ├── OrderRepository
│ └── PaymentRepository
│
├── entity
│ ├── Product
│ ├── CartItem
│ ├── OrderEntity
│ ├── OrderItem
│ ├── Payment
│ └── User
│
├── enums
│ ├── OrderStatus
│ └── PaymentStatus
│
└── EcommerceApplication.java

yaml
Copy code

---

## 🚀 How to Run the Project

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/Sandhya-scaler/ecommerce.git
2️⃣ Open in IDE
Open the project in IntelliJ IDEA / Eclipse

3️⃣ Run the Application
Run:

Copy code
EcommerceApplication.java
4️⃣ Server URL
arduino
Copy code
http://localhost:8080
🔗 API Testing (Postman)
➤ Create Product
POST /products

json
Copy code
{
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000,
  "stock": 5
}
➤ Get Products
GET /products

➤ Add Item to Cart
POST /cart/add

json
Copy code
{
  "userId": 1,
  "productId": 1,
  "quantity": 1
}
➤ View Cart
GET /cart/1

➤ Create Order
POST /orders/1

➤ Create Payment (Mock)
POST /payments/create?orderId=1

➤ Payment Webhook (Mock Callback)
POST /api/webhooks/payment

json
Copy code
{
  "orderId": 1,
  "status": "SUCCESS"
}
🗄 H2 Database Console
URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (leave empty)

📌 Notes
This is a simplified ecommerce backend

Authentication, real payment gateways, and frontend are intentionally skipped

Focus is on backend flow and architecture

Mock payment simulates real payment behaviour using webhook

🧪 Demo & Testing
APIs tested using Postman

Demo video recorded showing:

Product creation

Cart flow

Order creation

Payment & webhook callback

👩‍💻 Author
Name: Sandhya
GitHub: https://github.com/Sandhya-scaler