package bruh;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hallo Welt!");
        /* omegalol */
        /* funny, isn't it? */
        /* bruh */
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String aa = args[2];
        int c = 0;
        switch (aa){
            case "n":
                c = a*b;
                break;
            case "s":
                c = a+b;
                break;
            case "o":
                c = a-b;
                break;
            case "d":
                c= a/b;
                break;
        }
        System.out.println(c);
    }
}
