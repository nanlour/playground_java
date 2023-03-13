package preworkshop_week3;

public class Meeting {
    private static int maximum_capacity_all = 1000;
    private static int participant_number_all = 0;
    private int maximum_capacity_room = 25;
    private int participant_number_room = 0;
    public String[] participant_list;
    private String host_name;

    public Meeting(String new_host_name) {
        host_name = new_host_name;
        participant_list = new String[maximum_capacity_room];
    }

    public String getHostName() {
        return host_name;
    }

    public boolean addParticipant(Participant participant) {
        if (maximum_capacity_room > participant_number_room &&
            maximum_capacity_all > participant_number_all) {
            participant_list[participant_number_room] = participant.getName();
            participant_number_room += 1;
            participant_number_all += 1;
            return true;
        } else {
            return false;
        }
    }

}
