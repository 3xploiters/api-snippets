<?php
// Get the PHP helper library from https://twilio.com/docs/libraries/php

require_once 'vendor/autoload.php'; // Loads the library
use Twilio\Twiml\MessagingResponse;

$response = new MessagingResponse();
$response->message("The Robots are coming! Head for the hills!");
print $response;
