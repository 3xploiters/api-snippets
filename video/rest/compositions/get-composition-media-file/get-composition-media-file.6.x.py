# Download the Python helper library from twilio.com/docs/python/install
import json
from urllib.request import urlopen

from twilio.rest import Client

# Your Account Sid and Auth Token from twilio.com/console
api_key_sid = = 'SKXXXX'
api_key_secret = 'your_api_key_secret'
client = Client(api_key_sid, api_key_secret)

composition_sid = 'CXXXX'
uri = 'https://video.twilio.com/v1/Compositions/{}/Media'.format(composition_sid)
response = client.request('GET', uri)
media_location = json.loads(response.text).get('redirect_to')

# For example, download the media to a local file
local_file = open('myFile.mp4', 'w')
local_file.write(urlopen(media_location).read())
