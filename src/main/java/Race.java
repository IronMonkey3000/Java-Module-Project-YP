public class Race {
    public String leaderName = "";
    int leaderDistance = 0;
    public  void newLeader(String carName, int carSpeed ) {
        int newDistance = 24 * carSpeed;
        if (newDistance > leaderDistance) {
            leaderName = carName;
            leaderDistance = newDistance;
        }
    }

}