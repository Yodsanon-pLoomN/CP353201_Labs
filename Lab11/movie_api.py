from flask import Flask, request
from flask_restful import Resource, Api
from flasgger import Swagger

app = Flask(__name__)
api = Api(app)
swagger = Swagger(app)

playlists_data = [
    {"playlist_id":1,"playlist_name":"datenight","movie_list":["The Notebook", "50 First Dates", "A Walk to Remember"]},
    {"playlist_id":2,"playlist_name":"action","movie_list":["Die Hard", "Mad Max: Fury Road", "John Wick"]},
    {"playlist_id":3,"playlist_name":"comedy","movie_list":["Superbad", "Step Brothers", "The Hangover"]}
]


class Playlists(Resource):
    def get(self):
        """ 
        Get a list of all playlists
        ---
        responses:
          200:
            description: A list of playlists
        """
        return playlists_data, 200

    def post(self):
        """
        Create a new Playlist
        ---
        parameters:
          - in: body
            name: Playlist
            required: true
            schema: 
                playlist_id: Playlist 
                required:
                    - playlist_name 
                properties: 
                    playlist_name: 
                        type: string 
                        description: The name of the playlist 
                    movie_list: 
                        type: list 
                        description: The list of the movie_list
        responses:
            201:
                description: A new playlist created
            400:
                description: Bad request
        """
        new_id = playlists_data[-1]['playlist_id'] + 1
        data = request.get_json()       # retrieves the JSON data from the request object
        new_playlist = {'playlist_id': new_id, 'playlist_name': data['playlist_name'], 'movie_list': data['movie_list']}
        playlists_data.append(new_playlist)
        return playlists_data, 201

api.add_resource(Playlists, '/playlists')

# Run the app
if __name__ == '__main__':
    app.run(debug=True)
