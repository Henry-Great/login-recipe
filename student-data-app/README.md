# Student Data Application

This project is a Java application designed to manage student data using a graphical user interface (GUI) and a database. It allows users to view, add, update, and delete student records efficiently.

## Project Structure

```
student-data-app
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── app
│   │   │   │   └── Main.java
│   │   │   ├── gui
│   │   │   │   └── StudentGUI.java
│   │   │   ├── db
│   │   │   │   └── DatabaseManager.java
│   │   │   └── model
│   │   │       └── Student.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── app
│               └── MainTest.java
├── pom.xml
└── README.md
```

## Features

- **Student Management**: Add, update, delete, and view student records.
- **Database Integration**: Connects to a database to store and retrieve student information.
- **User-Friendly GUI**: Provides an intuitive interface for users to interact with the application.

## Setup Instructions

1. **Clone the Repository**:
   ```
   git clone <repository-url>
   cd student-data-app
   ```

2. **Build the Project**:
   Ensure you have Maven installed, then run:
   ```
   mvn clean install
   ```

3. **Configure Database**:
   Update the `src/main/resources/application.properties` file with your database connection details.

4. **Run the Application**:
   Execute the main class:
   ```
   mvn exec:java -Dexec.mainClass="app.Main"
   ```

## Usage Guidelines

- Launch the application to access the GUI.
- Use the provided options to manage student records.
- Ensure the database is running and accessible for the application to function correctly.

## Contributing

Contributions are welcome! Please submit a pull request or open an issue for any enhancements or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for details.