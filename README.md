# Employee Management & Attendance Tracking App 📱

An Android application developed using **Java, XML, and Firebase** that helps organizations manage **complete employee information** including **personal details, professional details, salary information, designation**, and **employee attendance tracking** in a centralized system.

---

## 📌 Project Overview

The Employee Management & Attendance Tracking App is designed to digitally manage all employee-related data in one place.  
The application allows administrators to store and manage **employee personal details, professional details, salary structure, department, designation**, and also track **daily attendance** with check-in and check-out functionality.

The app is developed using **Android Studio**, with **Firebase** providing real-time backend services for data storage and synchronization.

---

## 🚀 Features

### 👤 Employee Personal Details
- Employee ID
- Full Name
- Contact Number
- Email Address
- Address
- Date of Joining

### 🏢 Professional Details
- Department
- Designation
- Employment Type (Full-time / Part-time)
- Work Location
- Reporting Manager

### 💰 Salary Details
- Basic Salary
- Allowances
- Deductions
- Net Salary
- Salary History (optional)

### ⏱️ Attendance Management
- Employee check-in & check-out
- Automatic date & time tracking
- Daily attendance records
- Attendance history view

### 🔄 Employee Management
- Add new employee records
- View employee list
- Update employee details
- Delete employee records

### 🔐 Firebase Integration
- Firebase Realtime Database / Firestore
- Real-time data synchronization
- Secure cloud storage
- Firebase Authentication (optional)

---

## 🛠️ Technologies Used

- **Android Studio** – IDE for Android development  
- **Java** – Core application logic  
- **XML** – UI design and layouts  
- **Firebase Realtime Database / Firestore** – Backend database  
- **Firebase Authentication** (optional) – Login system  

---

## 📂 Project Structure

```

EmployeeManagementApp/
│
├── app/
│   ├── java/
│   │   ├── activities/
│   │   │   ├── MainActivity.java
│   │   │   ├── AddEmployeeActivity.java
│   │   │   ├── EmployeeListActivity.java
│   │   │   ├── EmployeeDetailsActivity.java
│   │   │   └── AttendanceActivity.java
│   │   ├── adapters/
│   │   ├── models/
│   │   │   ├── Employee.java
│   │   │   ├── Salary.java
│   │   │   └── Attendance.java
│   │   └── utils/
│   │
│   ├── res/
│   │   ├── layout/
│   │   ├── values/
│   │   └── drawable/
│
├── gradle/
├── build.gradle
└── settings.gradle

````

---

## 🔧 Setup & Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/employee-management-app.git
````

2. Open **Android Studio**

   * Click **Open**
   * Select the project folder

3. **Configure Firebase**

   * Create a Firebase project
   * Add Android app to Firebase
   * Download `google-services.json`
   * Enable Realtime Database / Firestore

4. Sync Gradle and run the app on:

   * Android Emulator
   * Physical Android device

---

## 🗄️ Firebase Database Structure (Example)

```
employees
 ├── empId
 │   ├── personalDetails
 │   ├── professionalDetails
 │   ├── salaryDetails
 │   └── attendance
```
---

## 👨‍💻 Developer

**Pratik Lagad**
Android Application Developer
Skills: Android Studio, Java, XML, Firebase

---
Just tell me 👍
```
