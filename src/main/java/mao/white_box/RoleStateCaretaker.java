package mao.white_box;

/**
 * Project name(项目名称)：java设计模式_备忘录模式
 * Package(包名): mao.white_box
 * Class(类名): RoleStateCaretaker
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/23
 * Time(创建时间)： 19:48
 * Version(版本): 1.0
 * Description(描述)： 角色状态管理者类
 */

public class RoleStateCaretaker
{
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento()
    {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento)
    {
        this.roleStateMemento = roleStateMemento;
    }
}
