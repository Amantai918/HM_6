public class HM_6_1 {
    public static void main(String[] args) {
        Weapon weapon1 = new Weapon(WeaponType.melee_weapons, "Двуручный топор");
        Weapon weapon2 = new Weapon(WeaponType.firearms, "Револьвер");
        Weapon weapon3 = new Weapon(WeaponType.bow, "Древний лук");


        Boss boss = new Boss(1000,200,"Air", weapon1);
        System.out.println(" Главный босс: " + boss.bossInfo());



        Skeleton skeleton1 = new Skeleton(500, 300, "water", weapon3, 50);
        Skeleton skeleton2 = new Skeleton(300, 700, "fire", weapon3, 30);

        System.out.println(" Cкелет 1: " + skeleton1.skeletonInfo());
        System.out.println(" Скелет 2: " + skeleton2.skeletonInfo());
    }
}
