# First kotlin
Simple CRUD User


Create user
---
POST localhost:8080/user
{
	"name":" BRAIN_656",
	"document": "656"
}
-- -

Update User
---
PUT localhost:8080/use/{userID}
{
	"name":"WWWWWWWWWWWW",
	"document": "XXXXXXXXX"
}

---


Delete User
---
DELETE localhost:8080/user/{userID}}

---

Find by userId
---
GET localhost:8080/user/{userID}}

---

Find all users 
---
GET localhost:8080/user

---

## Stack
- Kotlin
- Spring
- Mongo
- Gradle
