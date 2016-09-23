package epamMethodsProgramming.part2.chapter13_Networking.code.internetSupport;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Alexander on 9/20/2016.
 */
public class UnCheckedHost {
    public static void main(String[] args) {
// задание IP-адреса в виде массива
        byte ip[] ={(byte)217, (byte)21, (byte)43, (byte)10};
        try {
            InetAddress addr = InetAddress.getByAddress("University", ip);
            System.out.println(addr.getHostName()
                    + "-> cоединение:" + addr.isReachable(1000));
        } catch (UnknownHostException e) {
            System.err.println("адрес недоступен " + e);
        } catch (IOException e) {
            System.err.println("ошибка потока " + e);
        }
    }
}
