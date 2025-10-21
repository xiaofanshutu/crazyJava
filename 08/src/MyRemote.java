import java.rmi.Remote;

// 1.继承java.rmi.Remote
// Remote是个标记性接口，没有方法。接口是可以继承其他接口的，使用extends关键字。

// 2.声明所有方法都会抛出java.rmi.RemoteException
public interface MyRemote extends Remote {
    public String sayHello() throws java.rmi.RemoteException; // 1.声明一个方法，返回String类型
}

// 3.确定所有参数和返回值类型都是基本类型或可序列化的对象
// 任何远程方法的参数都会被打包通过网络传送，而这是通过序列化实现的。返回值也一样。