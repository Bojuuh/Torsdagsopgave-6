
public class Flow {

        public void methodA(String input) {
            System.out.println("J");
            if (input.equals("start")) {
                System.out.println("a");
                methodB("start");
            } else {
                System.out.println("d");
                methodC(input);

            }
            System.out.println("a");
        }

        public void methodB(String start) {
            String bLetter = "v";
            if (start.equals("start")) {
                System.out.println(bLetter);
            }
            else if (start.equals("end")) {
                bLetter = "o";
                System.out.println(bLetter);
            }
            else if (start.equals("java")) {
                bLetter = "j";
                System.out.println(bLetter);
            }
            else {
                bLetter = "e";
                System.out.println(bLetter);
            }
        }

        public void methodC(String input) {
            String cLetter = "r";
            System.out.println(cLetter);
            //methodD(input.length());
        }

        public void methodD(int number) {
            if (number > 20) {
                System.out.println("s");
                methodD(number - 5);
            }
            else if (number == 20) {
                methodB("java");
                methodD(number - 5);
            }
            else if (number == 15) {
                methodB("end");
                methodD(number - 5);
            }
            else if (number == 10) {
                methodB("start");
                methodD(number - 5);
            }
            else if (number == 5) {
                System.out.println("t");
            }



        }



    }