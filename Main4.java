class Device {
    String powerSource;

    void setPowerSource(String p) {
        powerSource = p;
    }

    void turnOn() {
        System.out.println("Device powered on");
    }
}

class Mobile extends Device {
    double screenSize;

    void setScreenSize(double s) {
        screenSize = s;
    }

    void makeCall() {
        System.out.println("Making a call");
    }
}

class Android extends Mobile {
    void openPlayStore() {
        System.out.println("Opening Play Store");
    }
}

class iPhone extends Mobile {
    void openAppStore() {
        System.out.println("Opening App Store");
    }
}

public class Main4 {
    public static void main(String[] args) {

        Android a = new Android();
        a.setPowerSource("Battery");
        a.setScreenSize(6.5);

        a.turnOn();
        a.makeCall();
        a.openPlayStore();

        iPhone i = new iPhone();
        i.setPowerSource("Battery");
        i.setScreenSize(6.1);

        i.turnOn();
        i.makeCall();
        i.openAppStore();
    }
}