import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.AgressiveConduct;
import strategy.Conduct;
import strategy.DefensiveConduct;
import strategy.NormalConduct;
import strategy.Robo;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //SIngleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        //Strategy

        Conduct normal = new NormalConduct();
        Conduct defensive = new DefensiveConduct();
        Conduct agressive = new AgressiveConduct();

        Robo robo = new Robo();
        robo.setConduct(normal);

        robo.move();
        robo.setConduct(agressive);
        robo.move();
        robo.move();
        robo.setConduct(defensive);
        robo.move();
        robo.move();


        //Facade

        Facade facade = new Facade();
        facade.changeClient("venilton", "08527374404");


    }
}
