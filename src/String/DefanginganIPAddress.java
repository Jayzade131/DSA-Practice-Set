package String;

public class DefanginganIPAddress {
    public static void main(String[] args) {
      String  address = "1.1.1.1";

        System.out.println(defangIPaddr(address));
    }
    static String defangIPaddr(String address) {
            String ipaddress=address.replace(".","[.]");
            return ipaddress;
    }
}
