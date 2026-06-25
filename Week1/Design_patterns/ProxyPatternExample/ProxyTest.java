public class ProxyTest {
    public static void main(String[] args){
        Image image1 = new ProxyImage("profile_photo.jpg");

        System.out.println("First time display:");
        image1.display();

        System.out.println("\nSecond time display:");
        image1.display();
    }
}
