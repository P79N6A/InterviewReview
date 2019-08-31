package ReflectionConstructors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: reflectionlearn
 * @description: ConstructorsRefelction
 * @author: jiuchai
 * @create: 2019-08-31 15:23
 */
public class ConstructorsTest {

    /*
	 * 通过Class对象可以获取某个类中的：构造方法、成员变量、成员方法；并访问成员；
	 *
	 * 1.获取构造方法：
	 * 		1).批量的方法：
	 * 			public Constructor[] getConstructors()：所有"公有的"构造方法
	            public Constructor[] getDeclaredConstructors()：获取所有的构造方法(包括私有、受保护、默认、公有)

	 * 		2).获取单个的方法，并调用：
	 * 			public Constructor getConstructor(Class... parameterTypes):获取单个的"公有的"构造方法：
	 * 			public Constructor getDeclaredConstructor(Class... parameterTypes):获取"某个构造方法"可以是私有的，或受保护、默认、公有；
	 *
	 * 2.创建对象
	 * 		Constructor对象调用newInstance(Object... initargs)
	 */

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> clazz = Class.forName("DO.HeroDO");

        //获取所有公有构造方法
        System.out.println("一下输出所有的公有构造方法=================");
        Constructor<?>[] conArray = clazz.getConstructors();
        for(Constructor con : conArray){
            System.out.println(con);
        }

        //获取所有的构造方法
        System.out.println("以下获取所有的构造方法==================");
        conArray = clazz.getDeclaredConstructors();
        for (Constructor con : conArray){
            System.out.println(con);
        }

        //获取公有 无参的构造方法
        Constructor constructor = clazz.getConstructor(null);
        System.out.println(constructor);
        Object instance = constructor.newInstance();

        //获取私有构造方法
        Constructor constructorPrivate = clazz.getDeclaredConstructor(double.class);
        System.out.println(constructorPrivate);
        //暴力访问
        constructorPrivate.setAccessible(true);
        Object o = constructorPrivate.newInstance(100);


    }

}
