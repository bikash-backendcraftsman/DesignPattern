import com.technostack.conceptImpl.LazyInitializationSingleton;

public class App {
    public static void main(String[] args) {

        /**
         *  So After executing the LazyInitialization, we found out that
         *  if first time instance is null , it is creating the instance and return the instance.
         *
         * if we call the getInstance() method again, it will run the same instance.
         *
         * We verify through calling hashCode method.
         */
        LazyInitializationSingleton instance = LazyInitializationSingleton.getInstance();
        System.out.println("First instance created for LazyInitialization Singleton :"+" "+instance.hashCode());

        LazyInitializationSingleton instance2 = LazyInitializationSingleton.getInstance();
        System.out.println("Second instance created for LazyInitialization Singleton :"+" "+instance2.hashCode());

        System.out.println("Print values : "+ instance.equals(instance2));

        /**
         * Output
         *
         * First instance created for LazyInitialization Singleton : 1595428806
         *  Second instance created for LazyInitialization Singleton : 1595428806
         * Print values : true
         */
    }
}
