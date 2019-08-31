package DO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: reflectionlearn
 * @description: HeroPlusDO
 * @author: jiuchai
 * @create: 2019-08-31 15:57
 */
@Getter
@Setter
@ToString
public class HeroPlusDO {

    public String name;
    public double hp;
    public int damage;
    public int id;

    public HeroPlusDO(){}

    public HeroPlusDO(String name){
        this.name = name;
    }

    public boolean isDead(){
        return false;
    }

    public void attackHero(String p){
        System.out.println(this.name + " attack " + p);
    }

}
