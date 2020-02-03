package a_creational.factory_demo;

public class FactoryMain {
    public  static Car getCar(String type, String engine, String bodyType, String brand){
        if("FAMILY".equalsIgnoreCase(type)){
            return  new FamilyVehicle(engine, bodyType,brand);
        }else if ("UTILITY".equalsIgnoreCase(type)){
            return new UtilityVehicle(engine, bodyType, brand);
        }else if ("SPORT".equalsIgnoreCase(type)){
            return new SportVehicle(engine, bodyType, brand);
        }
        return null;
    }

    public static void main(String[] args) {
        Car utility = getCar("utility","1,2 gas", "sedan", "toyota");
        Car family = getCar("family","1,8 diesel", "combi", "ford");
        Car sport = getCar("sport","5 hemi", "hatchback", "ford");

        System.out.println(utility.toString());
        System.out.println(family.toString());
        System.out.println(sport.toString());

    }
}
