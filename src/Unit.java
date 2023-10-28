public class Unit {

    protected String name;
    protected String surname = "Ivanov";
    public Unit(String name) {
        Game.countOfUnits++;
        this.name = name;
    }

    protected int health = 100;
    protected int defence = 100;
    protected int power = 10;

    protected float criticalChance = 0.1F;
    protected float parringChance = 0.1F;

    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public float getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(float criticalChance) {
        this.criticalChance = criticalChance;
    }

    public float getParringChance() {
        return parringChance;
    }

    public void setParringChance(float parringChance) {
        this.parringChance = parringChance;
    }

    public void attack(Unit unit){
        unit.getDamage(power);
    }

    public void getDamage(int damage){
        this.health -= damage;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }
}
