import java.rmi.server.UnicastRemoteObject;

// 继承java.rmi.server.UnicastRemoteObject
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    // 1.实现MyRemote接口
    // 2.提供一个无参构造器，调用父类的无参构造器
    public MyRemoteImpl() throws java.rmi.RemoteException {
    }

    // 3.实现sayHello方法
    @Override
    public String sayHello() {
        return "Server says, 'Hey there!'";
    }

    public static void main(String[] args) {
        try {
            // 4.创建MyRemoteImpl对象
            MyRemoteImpl remote = new MyRemoteImpl();

            // 5.注册远程对象到RMI注册表.RMI系统会把stub加到注册表中
            java.rmi.Naming.rebind("RemoteHello", remote);

            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
