public class Skeleton extends Boss{
    private int quiver;

    public Skeleton (int health, int damage, String defence, Weapon weapon, int quiver){
        super(health, damage, defence, weapon);
        this.quiver = quiver;
    }

    public int getQuiver() {
        return quiver;
    }

    public void setQuiver(int quiver) {
        this.quiver = quiver;
    }

    public String skeletonInfo() {
        return super.info() + this.weapon + " Количевство стрел: " + quiver;
    }
}
