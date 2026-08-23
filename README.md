**Spring Ecommerce** adalah aplikasi project online shopping sederhana dibuat dengan **Java Spring Boot MVC** dan **Thymeleaf**. Ini adalah aplikasi web dengan dengan frontend  **HTML, CSS, JavaScript,** dan **jQuery**, termasuk  **jQuery DataTables** untuk  enhanced data management.

# Fitur
  - **Arsitektur Spring Boot MVC:** Projek ini mengikuti standar arsitektur Model View Control  (MVC) dengan Service, Repository, dan Controller layers untuk memastikan clean code, mudah dimaintenance, dan scalabilitas.
  - **Frontend:**
      -  **Thymeleaf:** Sebagai View best-practice dari Server-side Java untuk rendering dynamic HTML pages.
      - **HTML5/CSS3:** Desain Responsive untuk web browser dan mobile devices.
      - **JavaScript & jQuery:** Untuk user interaktif dengan dynamic elements.
      - **jQuery DataTables:** Untuk handling data yang efisien dan menampilkan dengan pagination, sorting, dan search fungsional.
  
 - **Backend:**
      - **Java Spring Boot (3.3.2):** Core framework backend, handling business logic dan interaksi database.
      - **Spring Data JPA:** Simplified data access dan query database dengan JPA finder method (query hanya dengan nama method).
      - **MySQL:** Relational database untuk data persistence.
      - **Spring Security:** Secure the application dengan user authentication dan role-based authorization.
      - **Lombok:** Simplifies code dengan annotations untuk eliminate boilerplate code (seperti **getters**, **setters**, **constructors**).
      - **Maven:** Build tool untuk project dan dependency management.
      - **Java Mail Sender:** Send Email untuk Password Reset.
  
 - **Security:**
      - User authentication dan authorization dengan Spring Security.
      - Protected routes dan roles-based access control.
  
 - **Deployment:** Packaged sebagai **WAR** file, cocok untuk deployment pada semua servlet container seperti Apache Tomcat.


# Requirements
  - Java 17 (bisa diadjust untuk Java 8)
  - MySQL
  - Maven
  - Apache Tomcat (WAR deployment)

# Instalasi
   **1. Clone repository:**
```bash
git clone https://github.com/fathur1207/spring-ecommerce.git
```
   **2. Masuk ke root project directory:**
```bash
cd spring-ecommerce
```
  **3. Set up MySQL database:**
```bash
CREATE DATABASE ecommerce_store;
```
  **4. Untuk konfigurasi koneksi database di application.properties / application-docker.properties.:**
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_store
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=${SPRING_MAIL_USERNAME}
spring.mail.password=${SPRING_MAIL_PASSWORD}
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

spring.servlet.multipart.max-file-size=2MB
spring.servlet.multipart.max-request-size=2MB
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.orm.jdbc.bind=TRACE
logging.level.org.springframework.web=DEBUG
logging.level.org.springframework.web.servlet.DispatcherServlet=DEBUG

```
**5. Run application:** 
- mvn clean install
- mvn spring-boot:run
- **Akses di http://localhost:8080.**

# Project Screenshots: 
_**Note : Project belom selesai dan masih under development. The project akan terus diupdated insyaAllah._

**Index Page:**

![index-page]()
![index-page-02]()
![index-page-03]()
![Index-page-04-with-category-Dropdown]()


**Register Page**

![Register-User-Page]()


**Login Page:**

![Login Page]()


**Admin Dashboard**

![Admin-Dashboard]()


**User:**

![User-Login-Page]()


**User After Login:**

![User_Login_Index_Page]()


**User Disable Feature :**


![WhenUser-Disable]()


**Wrong Password Enter:**

![WrongPasswordLoginTry]()


**Logout:**

![LogoutSuccefully]() 


**Category Module:**

**Category Home:**

![All_category-List]()

**ADD Category:**

![Add-a-Category]()

**Edit Category**

![Edit-a-Category]()


**Search Category**

![Search-Category-in-Category-List]()


**Product Module**


**Product Home**

![product-list]()

**Add Product Page**

![add-product-form]()

![add-product-form-fillup]()

**Product Added**

![product-save-successfully-home]()

**Product Home - List of All Product**
![ListOfAll-Products]()

**Edit Product Module**
**Edit Product with Discount**
![Edit-Product-With-10%-Discount]()

**Product Updated with Discount**

![Product-Update-With-Discount-Price]()


**After Adding 10% Discount**

![Product-List-many]()

![ListOfAll-Products]()

**Product Details**

![Single-Product-Details-Page]()

![Single-product-details-page-02]()

![Details-Product-Blazer]()

![Details-product-with-discount]()


**Out of Stock Product**

![Out-of-Stock-Products]()



**Product Category Filter**

_Category Wise Product Filtering_

**All Category**

![All_category-List]()

**All Products - All Categories Product**

![Category-All-Product-with-Discount]()

**Filter Category wise products**

Casual Shirt:

![Category-wise-casual-Shirts]()

KnitWear:

![Category-wise-knit-wear]()

Blazer :

![Category-wise-blazer]()

Panjabi:

![Category-wise-panjabi-product]()

Pants:

![Category-Wise-Pants]()

Accessories:

![Category-wise-accessories]()

No Product Found for This Category:

![No-Product-with-this-category]()

**Forgot Password:**
![Screenshot from 2024-10-17 21-40-50]()

![Screenshot from 2024-10-17 21-40-59]()

