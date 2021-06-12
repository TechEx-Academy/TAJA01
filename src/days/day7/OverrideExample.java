package days.day7;

public class OverrideExample {
    public static void main(String[] args) {
        Device d = getDevice();

        if(d instanceof Fan){
            Fan myFan = (Fan)d;
            myFan.coolFan();
        }else{
            AC myAc = (AC)d;
            myAc.coolAC();
        }
    }

    static Device getDevice(){
        int temp = 34;
        if(temp > 30){
            return new AC();
        }else{
            return new Fan();
        }
    }
}

class Device{
    void coolDevice(){
        System.out.println("Device cooling the room");
    }
}

class AC extends Device{
    void coolAC() {
        System.out.println("AC machine cooling the room");
    }
}

class Fan extends Device{
    void coolFan(){
        System.out.println("Fan cooling the room");
    }
}