package pjc;

public enum TrafficSignal {
    RED("RED", 45),
    GREEN("GREEN", 90),
    YELLOW("YELLOW", 10),
    WALK("WALK", 35),
    DONT_WALK("DONT_WALK", 100);
    
    private final String name;
    private final int time;
    
    TrafficSignal(String name, int seconds) {
        this.name = name;
        this.time = seconds;
    }
    
    public String getName() {
        return name;
    }
    
    public int getTime() {
        return time;
    }
    
}
