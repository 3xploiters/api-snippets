# Get the Ruby helper library from https://twilio.com/docs/libraries/ruby
require 'twilio-ruby'

# Get your Account SID and Auth Token from https://twilio.com/console
account_sid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX'
auth_token = 'your_auth_token'
client = Twilio::REST::Client.new(account_sid, auth_token)

fleet_sid = 'FLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX'
fleet_service = client.preview.deployed_devices.fleets(fleet_sid)

certificate = fleet_service.certificates.create(
  device_sid: 'THXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX',
  friendly_name: 'Woody',
  certificate_data: IO.read('/path/to/certificate.pem')
)

puts certificate.sid
