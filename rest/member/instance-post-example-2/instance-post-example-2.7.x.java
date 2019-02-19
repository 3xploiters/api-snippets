// Install the Java helper library from twilio.com/docs/java/install
import java.net.URI;
import java.net.URISyntaxException;

import com.twilio.Twilio;
import com.twilio.http.HttpMethod;
import com.twilio.rest.api.v2010.account.queue.Member;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "your_auth_token";

  public static void main(String[] args) throws URISyntaxException {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    // Get an object from its sid. If you do not have a sid,
    // check out the list resource examples on this page
    Member member =
        Member.updater("QU5ef8732a3c49700934481addd5ce1659", "CA5ef8732a3c49700934481addd5ce1659",
            new URI("http://demo.twilio.com/docs/voice.xml"), HttpMethod.POST).update();

    System.out.println(member.getDateEnqueued());
  }
}
