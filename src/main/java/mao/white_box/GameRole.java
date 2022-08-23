package mao.white_box;

import java.util.Random;

/**
 * Project name(项目名称)：java设计模式_备忘录模式
 * Package(包名): mao.white_box
 * Class(类名): GameRole
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/23
 * Time(创建时间)： 19:36
 * Version(版本): 1.0
 * Description(描述)： 游戏角色类
 */

public class GameRole
{
    //生命力
    private int vit;
    //攻击力
    private int atk;
    //防御力
    private int def;

    /**
     * 初始化游戏角色的状态
     */
    public void initState()
    {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    /**
     * Instantiates a new Game role.
     */
    public GameRole()
    {
        this.initState();
    }

    /**
     * 获取随机数
     *
     * @param min 最小值
     * @param max 最大值
     * @return 一个随机数 int random
     */
    private int getIntRandom(int min, int max)
    {
        if (min > max)
        {
            min = max;
        }
        return min + (int) (Math.random() * (max - min + 1));
    }

    /**
     * 战斗方法，随机
     */
    public void fight()
    {
        this.vit = this.vit - getIntRandom(2, 15);
        if (Math.random() > 0.5)
        {
            this.atk = this.atk + getIntRandom(3, 10);
        }
        else
        {
            this.atk = this.atk - getIntRandom(5, 15);
        }
        if (Math.random() > 0.5)
        {
            this.def = this.def + getIntRandom(3, 10);
        }
        else
        {
            this.def = this.def - getIntRandom(5, 15);
        }
    }

    /**
     * 保存游戏的状态
     *
     * @return RoleStateMemento对象 role state memento
     */
    public RoleStateMemento saveState()
    {
        return new RoleStateMemento(vit, atk, def);
    }

    /**
     * 恢复状态
     *
     * @param roleStateMemento RoleStateMemento对象
     */
    public void recoverState(RoleStateMemento roleStateMemento)
    {
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    /**
     * 显示当前状态
     */
    public void stateDisplay()
    {
        System.out.println("当前角色生命力：" + vit);
        System.out.println("当前角色攻击力：" + atk);
        System.out.println("当前角色防御力：" + def);
    }

    /**
     * Gets vit.
     *
     * @return the vit
     */
    public int getVit()
    {
        return vit;
    }

    /**
     * Gets atk.
     *
     * @return the atk
     */
    public int getAtk()
    {
        return atk;
    }

    /**
     * Gets def.
     *
     * @return the def
     */
    public int getDef()
    {
        return def;
    }
}
