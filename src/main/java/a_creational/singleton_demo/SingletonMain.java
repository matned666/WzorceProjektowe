package a_creational.singleton_demo;

public class SingletonMain {

    public static void main(String[] args) {

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println("Wystartował: "+eagerSingleton.getClass().getSimpleName());
        System.out.println("o hashu: "+eagerSingleton.hashCode());
        System.out.println("Wystartował: "+eagerSingleton2.getClass().getSimpleName());
        System.out.println("o hashu: "+eagerSingleton2.hashCode());
        System.out.println("****************************************************");

        System.out.println(LazySingleton.DANE);
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton secondLazySingleton = LazySingleton.getInstance();

        System.out.println("Wystartował: "+lazySingleton.getClass().getSimpleName());
        System.out.println("o hashu: "+lazySingleton.hashCode());
        System.out.println("Wystartował: "+secondLazySingleton.getClass().getSimpleName());
        System.out.println("o hashu: "+secondLazySingleton.hashCode());
        System.out.println("****************************************************");

    }
}
