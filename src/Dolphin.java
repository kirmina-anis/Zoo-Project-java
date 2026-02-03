public class Dolphin extends Animal implements Swim{
    private String color;
    private double swimmingSpeed;
    public Dolphin()
    {
        super("Dolphin");
    }

    @Override
    public void setNameOfAnimal(String nameOfAnimal) {
        super.setNameOfAnimal(nameOfAnimal);
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    public void setColorOfDolphin(String color) {
        this.color = color;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String getNameOfAnimal() {
        return super.getNameOfAnimal();
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public String getColorOfDolphin() {
        return color;
    }

    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of "+ swimmingSpeed +" nautical miles per hour");
    }
}

