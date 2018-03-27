package sevenDisplay;

class sevenDisplay3 {
    public static void main(String[] args) {
        int a = 1234567890;
        String one = "._. ";
        String two = "... ";
        String three = "|.| ";
        String four = "..| ";
        String five = "._| ";
        String six = "|_| ";
        String seven = "|_. ";
        String aa = a + "";
        for(int i = 0; i < aa.length(); i++) {
            int k = Character.digit(aa.charAt(i),10);
            switch(k) {
                case 0:
                case 2:
                case 3:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                        System.out.print(one);
                        break;
                        case 1:
                case 4:
                        System.out.print(two);
                        break;
            }
        }
                        System.out.println();
                         String bb = a + "";
                        for(int i = 0; i < bb.length(); i++) {
                        int c = Character.digit(bb.charAt(i),10);
                switch(c) {
                    case 0:
                        System.out.print(three);
                        break;
                    case 1:
                    case 7:
                        System.out.print(four);
                        break;
                    case 2:
                    case 3:
                        System.out.print(five);
                        break;
                    case 4:
                    case 8:
                    case 9:
                        System.out.print(six);
                        break;
                    case 5:
                    case 6:
                        System.out.print(seven);
                        break;
                }
            }
        System.out.println();
                String cc = a + "";
                for(int i = 0; i < bb.length(); i++) {
                    int d = Character.digit(bb.charAt(i),10);
                    switch(d) {
                        case 0:
                        case 6:
                        case 8:
                            System.out.print(six);
                            break;
                        case 1:
                        case 4:
                        case 7:
                            System.out.print(four);
                            break;
                        case 2:
                            System.out.print(seven);
                            break;
                        case 3:
                        case 5:
                        case 9:
                            System.out.print(five);
                            break;
                    }
        }
    }
}