package days.day7;

public class AbstractionBluetoothExample {
    public static void main(String[] args) {

    }
}

// Research Center
interface BluetoothProtocol{
    void pair();
    void shareData();
    void closeConnection();
}

// Samsung Company
abstract class SamsungBluetooth implements BluetoothProtocol{

    @Override
    public void pair() {
        System.out.println("Samsung authentication");
    }

    @Override
    public void closeConnection() {
        System.out.println("Close connection safely");
    }
}

// Tablet Team
class GalaxyTablet extends SamsungBluetooth{

    @Override
    public void shareData() {
        System.out.println("Sharing data from tablet");
    }
}

// Mobile phone team
class GalaxyPhone extends SamsungBluetooth{

    @Override
    public void shareData() {
        System.out.println("Sharing data from phone");
    }
}