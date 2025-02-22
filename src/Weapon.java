public class Weapon {
    protected WeaponType weaponType;
    private String weaponName;

    public Weapon(WeaponType Type, String Name) {
        this.weaponType = Type;
        this.weaponName = Name;


    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String toString() {
        return "Тип оружия: " + weaponType + ", Название: " + weaponName;
    }
}
