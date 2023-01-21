public class SuperNinja extends Ninja {

    public SuperNinja(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(Devil d) {
        d.loseHealth(2);
    }

    public void increaseHealth() {
        if (this.getHealth() == 10) {
            System.out.println(this.getName() + " can't increase health cz you're in the limit.");
        } else if (this.getHealth()<=0){
            System.out.println(this.getName()+" can't increase health as you're dead.");
        }
        else {
            this.setHealth(this.getHealth() + 1);
            System.out.println(this.getName() + "'s health " + this.getHealth());
        }
    }
}
