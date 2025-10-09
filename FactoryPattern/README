🏭 Factory Design Pattern — Vehicle Example

📘 Concept Summary

The Factory Design Pattern is a creational design pattern that provides an interface for creating objects, but allows subclasses or separate factory classes to decide which class to instantiate.
It helps to encapsulate object creation logic, promoting loose coupling and scalability.

⸻

⚙️ Key Intent

“Define an interface for creating an object, but let subclasses or factory methods decide which class to instantiate.”

In short:
	•	Client code doesn’t use new directly.
	•	Factory decides which subclass to create based on input or configuration.


  🧩 Project Structure

  com.technostack.conceptImpl
 ├── Vehicle.java              → Interface (Product)
 ├── Car.java                  → Concrete Product
 ├── Bike.java                 → Concrete Product
 ├── Cycle.java                → Concrete Product
 ├── Factory.java              → Factory Class (Creator)
 └── App.java                  → Client (uses Factory)


 🔍 Class Responsibilities

Class                                     Responsibility
=====                                     ==============
Vehicle (Interface)                       Common contract for all vehicle types.

Car / Bike / Cycle (Concrete Classes)     Implement Vehicle interface and define specific driveVehicle() logic.

Factory                                   Encapsulates object creation logic and returns appropriate Vehicle instance based on vehicleType.

App (Client)                              Calls Factory.getInstance(type) and uses the returned object without worrying about its creation.

🧠 Why Use Factory Pattern

✅ Centralized object creation
✅ Follows Open/Closed Principle — new types can be added without modifying client code
✅ Reduces tight coupling between client and concrete classes
✅ Hides complex creation logic behind a simple method
✅ Improves code readability, testability, and maintainability


⚖️ When to Use
	•	You have multiple subclasses implementing the same interface.
	•	You don’t want clients to use new keyword directly.
	•	You need runtime decisions for object creation.
	•	You want to keep object creation logic in one place.


🧭 How It Works Internally
	1.	The client (App) requests an object by type.
	2.	The Factory receives the type and decides which subclass to create.
	3.	The factory returns a Vehicle reference — not the concrete class.
	4.	The client calls vehicle.driveVehicle() without knowing if it’s a Car, Bike, or Cycle.

💬 Key Recall Notes
	•	Factory Pattern answers: “Which object should I create?”
	•	Singleton Pattern answers: “How many instances should exist?”
	•	Factory focuses on type; Singleton focuses on lifecycle.
	•	Always program to interface, not implementation.
	•	Ideal for use in combination with Strategy or Abstract Factory for larger systems.

  
⚙️ Advantages

Benefit                     Description

✅ Loose Coupling           Client depends only on interface, not concrete class

✅ Centralized Control      Creation logic in one place

✅ Extendable               Add new vehicles easily

✅ Cleaner Code             Removes repetitive new statements

