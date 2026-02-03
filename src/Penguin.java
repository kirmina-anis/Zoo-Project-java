public class Penguin extends Animal implements Walk , Swim{
    private int walkSpeed;
    private int swimSpeed;
    private boolean isSwimming;
    public Penguin()
    {
        super("Penguin");
    }
    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }

    @Override
    public void setNameOfAnimal(String nameOfAnimal) {
        super.setNameOfAnimal(nameOfAnimal);
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    @Override
    public void walking() {
        System.out.println("I am walking at the speed");
    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed of "+ swimSpeed+"nautical miles per hour");
    }
}

