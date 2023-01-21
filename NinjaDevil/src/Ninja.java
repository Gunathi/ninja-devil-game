public abstract class Ninja extends GameCharacter {

    private String name;
    private int health;
    private boolean armor;

    public Ninja(String name, int health){
        super(name, health );
        this.armor = true;
    }

    public void setArmor(boolean armor){
        this.armor = armor;
    }

    public boolean getArmor(){
        return armor;
    }

         public void loseArmor (){
        if(armor) {
            this.armor = false;
            System.out.println(this.getName() + " lost armor!");
        }
         }

         public abstract void attack(Devil d);

         public void gainArmor(){
             if(this.getHealth()<=0){
                 System.out.println(this.getName()+" can't get armor cz you're dead.");
             }else {
                 if(this.getArmor()){
                     System.out.println(this.getName()+" already has an armor.");
                 }else {
                     this.setArmor(true);
                     System.out.println(this.getName() + "'s gain his armor back.");
                 }
             }
         }
     }

