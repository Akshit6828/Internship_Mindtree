public class CustomException {
    public static void main(String[] args) {
        Animal a = null;
        try{
            a = new Animal("Horse", -1);
            if(a!=null){
                System.out.println("Animal created");
            }
        }
        catch(AgeAnimalException e){
            System.out.println(e.getMessage());
        }
    }
}
