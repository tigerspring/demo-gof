package v4.pizza;

public class ChicagoStylePizza extends Pizza{

    public ChicagoStylePizza(String type){
        System.out.println("芝加哥风格pizza->重奶酪，厚饼 类型："+type);
    }

    public void cut(){
        System.out.println("芝加哥风格pizza->切成方形");
    }
}
