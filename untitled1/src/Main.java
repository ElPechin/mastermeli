public class Main {

    public static void main(String[] args) {

        ICalculadora iSuma = (a,b) -> a + b;
        System.out.println("5 + 4 = " + iSuma.operacion(5,4));
        ICalculadora iResta = (a,b) -> a - b;
        System.out.println("5 - 4 =" + iResta.operacion(5,4));
    }
}
