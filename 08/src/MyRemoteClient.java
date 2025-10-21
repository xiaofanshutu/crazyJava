import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            // 1.客户端查找RMI注册表中的远程对象
            // Naming.lookup()方法的参数是一个URL字符串，格式为"rmi://host:port/name"。
            // 2.RMI注册表返回stub对象
            MyRemote service = (MyRemote) Naming.lookup("rmi:127.0.0.1/Remote Hello");
            String s = service.sayHello();  // 2.调用远程方法
            System.out.println("Server says: " + s);  // 3.输出结果
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}