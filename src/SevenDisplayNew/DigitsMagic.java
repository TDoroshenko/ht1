package SevenDisplayNew;

class DigitsMagic {

    DigitsMagic digits = new DigitsMagic();

    private static String one = "._. ";
    private static String two = "... ";
    private static String three = "|.| ";
    private static String four = "..| ";
    private static String five = "._| ";
    private static String six = "|_| ";
    private static String seven = "|_. ";

    public String getOne() {
        return one;
    }

    public String getTwo() {
        return two;
    }

    public String getThree() {
        return three;
    }

    public String getFour() {
        return four;
    }

    public String getFive() {
        return five;
    }

    public String getSix() {
        return six;
    }

    public String getSeven() {
        return seven;
    }


    public static void Digits() {

        String numberString = String.format("%s", MyScanner.Scan());
        for (int i = 0; i < numberString.length(); i++) {
            int firstLine = Character.digit(numberString.charAt(i), 10);
            switch (firstLine) {
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
        for (int i = 0; i < numberString.length(); i++) {
            int secondLine = Character.digit(numberString.charAt(i), 10);
            switch (secondLine) {
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
        for (int i = 0; i < numberString.length(); i++) {
            int thirdLine = Character.digit(numberString.charAt(i), 10);
            switch (thirdLine) {
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
