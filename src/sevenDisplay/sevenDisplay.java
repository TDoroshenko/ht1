package sevenDisplay;

import java.net.SocketPermission;

class sevenDisplay {
    public static void main(String[] args) {
        int a = 1026;
        String aa = a + "";
        for(int i = 0; i < aa.length(); i++) {
            int k = Character.digit(aa.charAt(i),10);
            switch(k) {
                    case 0:
                        System.out.println("._.");
                        System.out.println("|.|");
                        System.out.println("|_|");
                        break;
                    case 1:
                        System.out.println("...");
                        System.out.println("..|");
                        System.out.println("..|");
                        break;
                    case 2:
                        System.out.println("._.");
                        System.out.println("._|");
                        System.out.println("|_.");
                        break;
                    case 3:
                        System.out.println("._.");
                        System.out.println("._|");
                        System.out.println("._|");
                        break;
                    case 4:
                        System.out.println("...");
                        System.out.println("|_|");
                        System.out.println("..|");
                        break;
                    case 5:
                        System.out.println("._.");
                        System.out.println("|_.");
                        System.out.println("._|");
                        break;
                    case 6:
                        System.out.println("._.");
                        System.out.println("|_.");
                        System.out.println("|_|");
                        break;
                    case 7:
                        System.out.println("._.");
                        System.out.println("..|");
                        System.out.println("..|");
                        break;
                    case 8:
                        System.out.println("._.");
                        System.out.println("|_|");
                        System.out.println("|_|");
                        break;
                    case 9:
                        System.out.println("._.");
                        System.out.println("|_|");
                        System.out.println("._|");
                        break;
            }
        }
    }
}

