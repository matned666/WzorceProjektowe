package a_creational.singleton_demo;

public class LazySingleton {

    static final String DANE = "LAZY = Dane bez inicjalizacji";

    private static LazySingleton instance = null;

    private LazySingleton() {}

    static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
