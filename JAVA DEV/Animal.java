public class Animal {
    String name;
    int age;
    Animal (String name,int age) throws AgeAnimalException{
        if (age < 0) {
            throw new AgeAnimalException("Age cannot be negative : " +  age);
        }
        this.name = name;
        this.age = age;    
    }
}
