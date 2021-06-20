package days.day8;

public class MethodOverloadingGameSample {
    public static void main(String[] args) {
        Soldier s = new BowSoldier();
        s.weapon = new Bow();

        Game game = new Game(s);
        game.soldier.fire();
    }
}

class Game{
    Soldier soldier;

    public Game(Soldier soldier) {
        this.soldier = soldier;
    }

    void start(){
        soldier.fire();
    }
}


class Soldier{
    Weapon weapon;

    void fire(){
        System.out.println("I am a Soldier");
        weapon.weaponFire();
    }
}

class SwordSoldier extends Soldier{
    void fire(){
        System.out.println("I am a SwordSoldier");
        weapon.weaponFire();
    }
}

class BowSoldier extends Soldier{
    void fire(){
        System.out.println("I am a class BowSoldier");
        weapon.weaponFire();
    }
}

class Weapon{
    void weaponFire(){
        System.out.println("I am a weapon");
    }
}

class Sword extends Weapon{
    void weaponFire(){
        System.out.println("I am a sword");
    }
}

class Bow extends Weapon{
    void weaponFire() {
        System.out.println("I am a bow");
    }
}