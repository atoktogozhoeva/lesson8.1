package kg.geektech.game.players;


public class Berserk extends Hero {

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperPower.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] == this && heroes[i].getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage() / 5);
                boss.setHealth(boss.getHealth() - boss.getDamage() / 5);
            }
        }
    }
}
