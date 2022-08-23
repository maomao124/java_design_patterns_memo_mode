package mao.white_box;

/**
 * Project name(项目名称)：java设计模式_备忘录模式
 * Package(包名): mao.white_box
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/23
 * Time(创建时间)： 19:50
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        GameRole gameRole = new GameRole();
        gameRole.stateDisplay();
        RoleStateMemento roleStateMemento = gameRole.saveState();
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(roleStateMemento);
        System.out.println("------------");
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("------------");
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("------------");
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("------------");
        //恢复
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
