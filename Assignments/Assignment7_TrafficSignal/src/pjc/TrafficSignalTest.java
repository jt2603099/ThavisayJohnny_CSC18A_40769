package pjc;

public class TrafficSignalTest {
    
    public static void main(String[] args) {
        System.out.printf("All enum signals%n");
        System.out.printf("---------------------------------------%n");
        
        for (TrafficSignal signal : TrafficSignal.values()) {
            System.out.printf("%-25s%5d%9s%n", signal.getName(), signal.getTime(), "seconds");
        }  
    }
    
}