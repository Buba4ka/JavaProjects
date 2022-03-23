package emailapp;

public class EmailApp {


    public static void main(String[] args) {

        Email em1 = new Email("Oksana", "Moshnaia");
        //System.out.println(em1.showInfo());

        em1.setMailboxCapacity(1000);
        System.out.println(em1.showInfo());
//        em1.setAlternateEmail("js@gmail.com");
//        System.out.println(em1.getAlternateEmail());

    }
}
