import java.util.Scanner;
public class Kalk {
    public static void main(String[] args) {
        String[] signs = {"+", "-", "/", "*"};
        String[] regexSigns = {"\\+", "-", "/", "\\*"};
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        int actionIndex=-1;
        for (int i = 0; i < signs.length; i++) {
            if(exp.contains(signs[i])){
                actionIndex = i;
                break;
            }
        }

        if(actionIndex==-1){
            System.out.println("trouble2");
            return;
        }
        String[] data = exp.split(regexSigns[actionIndex]);
            int a,b;
            a = Integer.parseInt(data[0]);
            b = Integer.parseInt(data[1]);

        if (a>10 || a<1 || b>10 || b<1){
            System.out.println("Trouble3");
            System.exit(0);
        }

        for (;;) {

            int sod = exp.length();
            if (a == 10 && b == 10 && sod > 5) {
                System.out.println("Troubl4");
                System.exit(0);
            } else if (a==10 && b==10){
                break;
            }
            else if (a==10 | b==10 && sod > 4) {
                System.out.println("Trouble5");
                System.exit(0);
            } else if (a==10 | b==10){
                break;
            }
            else if (sod > 3) {
                System.out.println("Trouble6");
                System.exit(0);
            } else {
                break;
            }
        }



            int result;
            switch (signs[actionIndex]) {
                case "+":
                    result = a+b;
                    break;
                case "-":
                    result = a-b;
                    break;
                case "*":
                    result = a*b;
                    break;
                default:
                    result = a/b;
                    break;
            }

            System.out.println(result);




        }
    }

