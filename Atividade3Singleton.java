public class Atividade3Singleton {

    private static Atividade3Singleton instancia;

    private Atividade3Singleton() {
        System.out.println("Instância Singleton criada!");
    }

    public static Atividade3Singleton getInstance() {
        if (instancia == null) {
            instancia = new Atividade3Singleton();
        }
        return instancia;
    }

    public static void main(String[] args) {
        Atividade3Singleton s1 = Atividade3Singleton.getInstance();
        Atividade3Singleton s2 = Atividade3Singleton.getInstance();

        System.out.println("singleton1 == singleton2: " + (s1 == s2));
    }
}
