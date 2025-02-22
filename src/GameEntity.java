public class GameEntity {
    protected int health;
    protected int damage;
    protected String defence;

    public GameEntity(int health, int damage, String defence) {
        this.health = health;
        this.damage = damage;
        this.defence = defence;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public String info() {
        return "Здоровье:  " + this.health + " Атака: " + this.damage + " Защита: " + this.defence;
    }
}
