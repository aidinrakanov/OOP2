package Players;

public class Hero extends Players {


    public Hero(int health, int damage) {
        super(health, damage);
    }

    public String attackType;

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }
}
