package index;

public class index {
    int ciao = 12;
    String nome = "samuel";
    

    public static void main(String[] args) {
        
        sayHelloTo(10);
        doppioValore(2);
    }

    private static void sayHelloTo(int recipient) {
        index ciao = new index();
        System.out.println(ciao.nome);
        System.out.println(10 + recipient);
    }

    public static void doppioValore(int val) {
        System.out.println(val * 2);
    }

}