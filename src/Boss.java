public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Boss(int health, int damage, String defence, Weapon weapon) {
        super(health, damage, defence);
        this.weapon = weapon;
    }

    public String bossInfo() {
        return super.info() + " Оружие: " + weapon;
    }
}

