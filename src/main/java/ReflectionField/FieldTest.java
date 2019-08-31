package ReflectionField;

import DO.HeroPlusDO;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @program: reflectionlearn
 * @description: Field Test
 * @author: jiuchai
 * @create: 2019-08-31 15:57
 */
public class FieldTest {

    public static void main(String[] args) throws  Exception{

        HeroPlusDO h = new HeroPlusDO();
        h.name = "李聪";
        System.out.println(h.getName());

        Class<?> clazz = Class.forName("DO.HeroPlusDO");
        Field field = clazz.getDeclaredField("name");
        field.set(h,"12345635");
        System.out.println(h.getName());

        /**
         * 1.获取HeroPlus类的对象 h
         * 2.获取成员方法：
         * public Method getMethod(String name ，Class<?>… parameterTypes):获取"公有方法"；（包含了父类的方法也包含Object类）
         * public Method getDeclaredMethods(String name ，Class<?>… parameterTypes) :获取成员方法，包括私有的(不包括继承的)
         * 参数解释：
         *   name : 方法名；
         *   Class … : 形参的Class类型对象
         * 3.调用方法
         * Method --> public Object invoke(Object obj,Object… args):
         * 参数说明：
         *   obj : 要调用方法的对象；
         *   args:调用方式时所传递的实参；
         */
        Method method = clazz.getMethod("setName", String.class);
        method.invoke(h,"gailun");
        System.out.println(h.getName());
        
    }

}
