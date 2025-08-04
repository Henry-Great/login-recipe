# Recipe Sharing Website Backend

This is the backend component of the Recipe Sharing Website project, built using Python and Flask. The backend handles all server-side logic, including user authentication, recipe management, and data storage.

## Project Structure

- **app.py**: Main entry point for the Flask application. Initializes the app, sets configurations, and registers routes.
- **models.py**: Defines data models for the application, including classes for recipes and users.
- **routes.py**: Contains route definitions for handling HTTP requests related to recipes and user actions.
- **requirements.txt**: Lists the Python dependencies required for the backend.

## Setup Instructions

1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd recipe-sharing-website/backend
   ```

2. **Create a virtual environment**:
   ```
   python -m venv venv
   source venv/bin/activate  # On Windows use `venv\Scripts\activate`
   ```

3. **Install dependencies**:
   ```
   pip install -r requirements.txt
   ```

4. **Run the application**:
   ```
   python app.py
   ```

The application will be running on `http://127.0.0.1:5000`.

## API Usage

- **GET /recipes**: Retrieve a list of all recipes.
- **POST /recipes**: Create a new recipe.
- **GET /recipes/<id>**: Retrieve a specific recipe by ID.
- **PUT /recipes/<id>**: Update a specific recipe by ID.
- **DELETE /recipes/<id>**: Delete a specific recipe by ID.
- **POST /login**: User login.
- **POST /register**: User registration.

## Contributing

Contributions are welcome! Please submit a pull request or open an issue for any suggestions or improvements.