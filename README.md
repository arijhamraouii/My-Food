# 🍽️ **MyFood - Architecture Microservices**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Eureka](https://img.shields.io/badge/Eureka-0055A4?style=for-the-badge&logo=spring&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)

---

## 🎯 **Description du Projet**
**MyFood** est un système de gestion de restauration utilisant une architecture **microservices** pour offrir une solution performante et scalable :
- Les **clients** peuvent consulter les restaurants et passer des commandes.
- Les **restaurants** gèrent les commandes et les transfèrent aux **cuisiniers**.
- Les **livreurs** prennent en charge les livraisons des commandes.

---

## 🛠️ **Architecture Microservices**

Les microservices suivants ont été implémentés :
- **OrderService** : Gestion des commandes.
- **KitchenService** : Gestion de la préparation des commandes.
- **DeliveryService** : Gestion des livraisons.
- **RestaurantService** : Gestion des restaurants et des menus.
- **CourtierService** : Gestion de la localisation des livreurs.
- **Service Registry (Eureka)** : Enregistrement et découverte des microservices.
- **API Gateway** : Point d'entrée centralisé pour les microservices.

---

graph TD;
    A[Postman] -->|JSON Requests| B[API Gateway];
    B --> C[OrderService];
    B --> D[KitchenService];
    B --> E[DeliveryService];
    B --> F[RestaurantService];
    B --> G[CourtierService];
    G --> H[MySQL Database];
    C --> H;
    D --> H;
    E --> H;
    F --> H;
    B --> I[Service Registry (Eureka)];

