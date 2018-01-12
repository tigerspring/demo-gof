import com.gof.factorymodel.factory.BMWFactory;
import com.gof.factorymodel.factory.ifactory.FACTORYTYPE;
import com.gof.factorymodel.factory.ifactory.IFactory;
import org.junit.Test;


public class TestIfactory {
    @Test
    public void test(){
        IFactory ifactory253 = BMWFactory.getBMWFactory(FACTORYTYPE.BMW253);
        IFactory ifactory320 = BMWFactory.getBMWFactory(FACTORYTYPE.BMW320);

        System.out.println("我想要宝马320");
        System.out.println(ifactory320);
        ifactory320.createCar();


        System.out.println("我还想要 其他型号 比如宝马253");

        System.out.println(ifactory253);
        ifactory253.createCar();
    }
}
