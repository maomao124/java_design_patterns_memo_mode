package mao.white_box;

/**
 * Project name(项目名称)：java设计模式_备忘录模式
 * Package(包名): mao.white_box
 * Class(类名): RoleStateMemento
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/23
 * Time(创建时间)： 19:43
 * Version(版本): 1.0
 * Description(描述)： 游戏状态存储类(备忘录类)
 */

public class RoleStateMemento
{
    private int vit;
    private int atk;
    private int def;

    /**
     * Instantiates a new Role state memento.
     *
     * @param vit the vit
     * @param atk the atk
     * @param def the def
     */
    public RoleStateMemento(int vit, int atk, int def)
    {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
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
     * Sets vit.
     *
     * @param vit the vit
     * @return the vit
     */
    public RoleStateMemento setVit(int vit)
    {
        this.vit = vit;
        return this;
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
     * Sets atk.
     *
     * @param atk the atk
     * @return the atk
     */
    public RoleStateMemento setAtk(int atk)
    {
        this.atk = atk;
        return this;
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

    /**
     * Sets def.
     *
     * @param def the def
     * @return the def
     */
    public RoleStateMemento setDef(int def)
    {
        this.def = def;
        return this;
    }
}
