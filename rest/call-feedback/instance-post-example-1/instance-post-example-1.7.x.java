// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.call.Feedback;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "your_auth_token";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    // Get an object from its sid. If you do not have a sid,
    // check out the list resource examples on this page
    Feedback feedback = Feedback.creator("CAe03b7cd806070d1f32bdb7f1046a41c0", 3)
        .setIssue(Feedback.Issues.IMPERFECT_AUDIO).create();

    System.out.println(feedback.getDateCreated());
  }
}
