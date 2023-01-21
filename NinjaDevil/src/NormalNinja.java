public class NormalNinja extends Ninja {
        public NormalNinja(String name, int health){
            super(name, health );
        }

    @Override
    public void attack(Devil d) {
        d.loseHealth(1);
    }

}
