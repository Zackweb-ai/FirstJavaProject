public class App {
    public static void main (String[] args){
        String Message = "Hello, World!";
        PrintHello(Message);
        System.out.println(PrintNum(5));
        System.out.println(square(5));
        System.out.println(square(PrintNum(5)));

    }

    static void PrintHello( String meassage) {
        System.out.println(meassage);
    }
    static int PrintNum (int Num){
        return Num;
    }
    static int square (int num){
        return num * num;
    }
}
