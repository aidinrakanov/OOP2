package Players;

public class Boss extends Players {


    public Boss(int health, int damage) {
        super(health, damage);
    }

    public String defenseType;

    public String getDefenseType() {
        return defenseType;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }
}
