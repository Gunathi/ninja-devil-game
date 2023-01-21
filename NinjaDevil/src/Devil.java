public class Devil extends GameCharacter{

   int number;
   public Devil(String name, int health ){
      super(name,health);

   }
       public void attack(Ninja n){
          /*n.setHealth(n.getHealth()-1);
          System.out.println(n.getName()+"'s health "+n.getHealth()+" left");*/
         if(n.getArmor()){
             n.loseHealth(1);
         }else {
             n.loseHealth(2);
         }
       }

       public void stealArmor(Ninja n){
            n.loseArmor();
       }
}
