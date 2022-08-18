package Task17;

public abstract class Animal {
    private int weight;
    private int age;
    private String colour;
    private String gender;
    private String nickName;


    public Animal(int weight, int age, String colour, String gender) {
        this.weight = weight;
        this.age = age;
        this.colour = colour;
        this.gender = gender;
        this.nickName = nickName;
    }
    public Animal() {
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }


    public int getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }
    public String getColour() {
        return colour;
    }
    public String getGender() {
        return gender;
    }
    public String getNickName() {
        return nickName;
    }

}
