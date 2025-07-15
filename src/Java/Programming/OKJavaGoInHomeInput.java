package Java.Programming;
import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

import javax.swing.*;


public class OKJavaGoInHomeInput {
    public static void main(String[] args) {
        // edit configuration을 통해 arguments를 입력하고 받아올 수 있음
        // args도 매개변수이며 입력한 arguments들은 String[]에 저장되여 리스트 형태로 사용할 수 있다.
        String id = args[0];
        String bright = args[1];

        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);

        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(id + " / Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id + " / FloorLamp");
        floorLamp.on();

        DimmingLights moodLamp = new DimmingLights(id+ " moodLamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();
    }
}
