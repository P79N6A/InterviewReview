package DO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: reflectionlearn
 * @description: HeroDo
 * @author: jiuchai
 * @create: 2019-08-31 15:10
 */

@Setter
@Getter
@ToString
public class HeroDO {

    private String name;
    private int num;
    private double hp;

    //默认构造方法
    HeroDO(String str) {
        System.out.println("默认构造方法是" + str);
    }

    //无参构造方法
    public HeroDO() {
        System.out.println("调用了公有、无参构造方法执行了。。。");
    }

    //有一个参数的构造方法
    public HeroDO(char name) {
        System.out.println("姓名：" + name);
    }

    //有多个参数的构造方法
    public HeroDO(String name, double hp) {
        System.out.println("姓名：" + name + "血量：" + hp);
    }

    //受保护的构造方法
    protected HeroDO(boolean n) {
        System.out.println("受保护的构造方法 n = " + n);
    }

    /**
     *     私有构造方法  这儿值得注意一下
     *     将一个类的构造函数声明为private，可以使得该类不被实例化，和不能被继承。常用于单例模式中==要创建这个类的实例，唯一的办法是提供一个公共静态方法
     */
    private HeroDO(double hp) {
        System.out.println("私有的构造方法   血量：" + hp);
    }
}
