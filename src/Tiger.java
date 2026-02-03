public class Tiger extends Animal implements Walk{
    private int numberOfStripes;
    private double speed;
    private double soundLevelOfRoar;
    public Tiger()
    {
        super("Tiger");
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

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public void setSoundLevelOfRoar(double soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
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

    @Override
    public String getNameOfAnimal() {
        return super.getNameOfAnimal();
    }

    public double getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public double getSpeed() {
        return speed;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    @Override
    public void eatingCompleted() {
        System.out.println(" Tiger: I have eaten meat");
    }

    @Override
    public void walking() {
        System.out.println("Tiger: Iam moving at the "+speed+" mph ");
    }
}


