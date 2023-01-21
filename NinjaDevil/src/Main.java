public class Main {
    public static void main(String[] args) {

        Devil d1 = new Devil("Demon", 10);
        NormalNinja nn1 = new NormalNinja("Blackie",10);
        SuperNinja sn1 = new SuperNinja("Pinkie", 10);

        d1.stealArmor(sn1);
        d1.attack(sn1);
        d1.attack(sn1);
        d1.attack(sn1);
        d1.attack(sn1);
        d1.attack(sn1);
        sn1.gainArmor();
        sn1.increaseHealth();
        d1.attack(sn1);




    }
}