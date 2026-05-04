# 🚀 Smart Recommendation System

🔗 **Live Demo:**  
https://smart-recommendation-system-bfau.onrender.com

📂 **GitHub Repository:**  
https://github.com/Ziyad28/smart-recommendation-system

---

## 📸 Preview

![Preview](preview.png)

---

## 🧠 About the Project

A data-driven web application that recommends the best restaurants and coffee shops based on ratings and number of reviews.

The application is deployed and accessible online.

---

## 🚀 Features

- 🔍 Smart recommendation system based on rating and reviews
- 🍕 Restaurants & ☕ Coffee shops support
- 🥇 Top 3 ranked results (Best Match, Second, Third)
- 🗺️ Google Maps search links for each place
- 🎨 Modern UI (Glass effect + background image)
- 🌐 Live deployed application

---

## 🌍 Supported Cities

- Hail
- Riyadh
- Dammam

---

## 🛠 Technologies Used

- Java
- Spring Boot
- REST API
- HTML
- CSS
- JavaScript

---

## 📊 How It Works

```java
score = rating + min(reviews / 1000, 1);
```

This formula balances:

- ⭐ Quality (rating)
- 📈 Popularity (number of reviews)

---

## ⚙️ System Design

- Backend: Spring Boot REST API
- Frontend: HTML / CSS / JavaScript
- Architecture: Stateless API

---

## 📌 API

**POST /recommend**

Example request:

```json
{
  "city": "Riyadh",
  "type": "restaurant",
  "category": "Italian"
}
```

---

## 👨‍💻 Author

**Ziyad Alghadban**  
📧 Email: lzyad717@gmail.com  
🔗 Portfolio: https://ziyad28.github.io/

---

⭐ If you like the project, give it a star!
