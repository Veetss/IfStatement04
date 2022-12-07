public class Person {
    public int age;

    public Person(){
        this.age = (int) Math.floor(Math.random() * (80 - 5 + 1) + 5);
    }
    public String getLifeStage(){
        if(age <= 12){
            return "This person is a child!";
        }else if(age <= 19 && age >= 13){
            return "This person is a teenager!";
        }else if(age <= 59 && age >= 20){
            return "This person is an adult!";
        }else if(age >= 60){
            return "This person is a senior adult!";
        }else{
            return "Error 404 brain not found.";
        }
    }
}
