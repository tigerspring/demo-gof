package v1.pizza;

public abstract class Pizza {
    public  void prepare(){
        System.out.println("准备pizza");
    }

    public void bake(){
        System.out.println("烘焙披萨");
    }

    public void cut(){
        System.out.println("切披萨");
    }

    public void box(){
        System.out.println("披萨装盒");
    }

}
