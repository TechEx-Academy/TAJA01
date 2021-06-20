package days.day8;

import java.util.ArrayList;

public class AbstractionExample {


}

//=========research center
interface BlueTooth{
    void pair();
    void share();
    void close();
}

//========== samsung company
abstract class SamsungBluetooth implements BlueTooth{
    public void pair(){
        System.out.println("Following Samsung security guidelines");
    }
}

//====== tab team
class SamsungTabletBlueTooth extends SamsungBluetooth{
    public void share(){
        System.out.println("Tablet sharing data");
    }

    public void close(){
        System.out.println("Tablet closing connection");
    }
}

//========== phone team
class SamsungPhoneBlueTooth extends SamsungBluetooth{
    public void share(){
        System.out.println("Phones sharing data");
    }

    public void close(){
        System.out.println("Phone closing connection");
    }
}


//========= Nokia compnay
abstract class NokiaBluetooth implements BlueTooth{
    public void pair(){

    }

    public void close(){

    }
}

class Galaxy{
    SamsungPhoneBlueTooth sbt;
    N9 n9;

    void shareData(){
        n9.shareData(sbt);
    }
}

class N9{
    void shareData(BlueTooth blueTooth){
        ArrayList<Integer> a = new ArrayList<>();

    }
}