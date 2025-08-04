from flask import Blueprint, request, jsonify
from models import Recipe, User, db

routes = Blueprint('routes', __name__)

@routes.route('/api/recipes', methods=['GET'])
def get_recipes():
    recipes = Recipe.query.all()
    return jsonify([recipe.to_dict() for recipe in recipes])

@routes.route('/api/recipes/<int:recipe_id>', methods=['GET'])
def get_recipe(recipe_id):
    recipe = Recipe.query.get_or_404(recipe_id)
    return jsonify(recipe.to_dict())

@routes.route('/api/recipes', methods=['POST'])
def create_recipe():
    data = request.json
    new_recipe = Recipe(title=data['title'], ingredients=data['ingredients'], instructions=data['instructions'])
    db.session.add(new_recipe)
    db.session.commit()
    return jsonify(new_recipe.to_dict()), 201

@routes.route('/api/recipes/<int:recipe_id>', methods=['PUT'])
def update_recipe(recipe_id):
    data = request.json
    recipe = Recipe.query.get_or_404(recipe_id)
    recipe.title = data['title']
    recipe.ingredients = data['ingredients']
    recipe.instructions = data['instructions']
    db.session.commit()
    return jsonify(recipe.to_dict())

@routes.route('/api/recipes/<int:recipe_id>', methods=['DELETE'])
def delete_recipe(recipe_id):
    recipe = Recipe.query.get_or_404(recipe_id)
    db.session.delete(recipe)
    db.session.commit()
    return jsonify({'message': 'Recipe deleted successfully'}), 204

@routes.route('/api/users/<int:user_id>/favorites', methods=['GET'])
def get_favorites(user_id):
    user = User.query.get_or_404(user_id)
    favorites = user.favorites
    return jsonify([recipe.to_dict() for recipe in favorites])