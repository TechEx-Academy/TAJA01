package days.day7;

public class Code3 {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(-4);
        user.setPassword("abcd");

        System.out.println(user.getAge());
        System.out.println(user.getPassword());
    }
}

class User{
    String userName;
    private String password;
    private int age;

    void setAge(int _age){
        if(_age < 0){
            System.out.println("Invalid Age");
        }else{
            this.age = _age;
        }
    }

    int getAge(){
        return this.age;
    }

    void setPassword(String password){
        this.password = password;
    }

    int getPassword(){
        return this.password.hashCode();
    }
}