import preworkshop_week3.*;

public class Main {
    public static void main(String[] args) {
        Meeting m = new Meeting("wr");
        Participant p = new Participant("rw");
        for (int i = 0; i < 1000; i++) {
            Meeting m_new = new Meeting("wr");
            for(int ii = 0; ii < 20; ii++) {
                p.joinMeeting(m);
            }
        }
        for (int i = 0; i < 25; i++) {
            System.out.println(m.participant_list[i]);
        }
    }
}