package groupLearning.coreJava.classes;

public class Cat {
    private int age;
    private String color;
    private String name;

    public Cat(String name,int age, String color){
        this.age = age;
        this.name = name;
        this.color = color;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
