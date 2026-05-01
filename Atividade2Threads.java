public class Atividade2Threads {

    static class ThreadA implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread A (Número): " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    static class ThreadB implements Runnable {
        @Override
        public void run() {
            String[] mensagens = {"Mensagem 1", "Mensagem 2", "Mensagem 3", "Mensagem 4", "Mensagem 5"};
            for (String mensagem : mensagens) {
                System.out.println("Thread B (Mensagem): " + mensagem);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread threadA = new Thread(new ThreadA());
        Thread threadB = new Thread(new ThreadB());
        threadA.start();
        threadB.start();
    }
}
