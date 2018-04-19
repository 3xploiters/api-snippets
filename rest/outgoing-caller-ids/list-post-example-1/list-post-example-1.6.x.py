# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest import Client

# Your Account Sid and Auth Token from twilio.com/user/account
account_sid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"
auth_token = "your_auth_token"
client = Client(account_sid, auth_token)

validation_request = client.validation_requests \
                           .create("+14158675310",
                                   friendly_name="My Home Phone Number")

print(validation_request.validation_code)
