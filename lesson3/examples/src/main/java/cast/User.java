package cast;

public class User {
    String name;
    int age;

    String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (getName() != null) return getName().equals(user.getName());
        return user.getName() == null;
    }

    @Override
    public int hashCode() {
        int result;
        if (getName() != null) result = getName().hashCode();
        else result = 0;
        result = 31 * result + age;
        return result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name){
        this.name = name;
    }

    public User(){}
}
