// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.rest.taskrouter.v1.workspace.worker.Reservation;

public class Example {
  private static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  private static final String AUTH_TOKEN = "your_auth_token";
  private static final String WORKSPACE_SID = "WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  private static final String WORKER_SID = "WKXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  private static final String RESERVATION_SID = "WRXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    Reservation reservation =
        Reservation.fetcher(WORKSPACE_SID, WORKER_SID, RESERVATION_SID).fetch();

    System.out.println(reservation.getReservationStatus());
    System.out.println(reservation.getWorkerName());
  }
}
