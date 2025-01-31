
public class enums_1 {

    // enum Day{
    //     //-> public, static, final
    //     MONDAY,  //-> 0
    //     TUESDAY, //1
    //     WEDNESDAY, //2
    //     THURSDAY,
    //     FRIDAY,
    //     SATURDAY,
    //     SUNDAY
    // }

    enum TrafficLights{
        RED,
        YELLOW,
        GREEN
    }

    public static void main(String[] args) {
        // Day today = Day.FRIDAY;

        // System.out.println(today);

        //iterate on enum
        // for(Day i : Day.values()){
        //     System.out.println(i);
        // }

        TrafficLights tl = TrafficLights.YELLOW;

        switch(tl){
            case RED:
            System.out.println("Stop");
            break;

            case YELLOW:
            System.out.println("Get ready");
            break;

            case GREEN:
            System.out.println("Go");
            break;

            default:
            System.out.println("Error");
        }

    }
}
