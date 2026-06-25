public class BuilderTest {

    public static void main(String[] args) {

        Computer Computer1 =
                new Computer.Builder()
                        .setcpu("Intel i9")
                        .setram(32)
                        .setstorage(1000)
                        .setBluetooth(true)
                        .build();

        Computer Computer2 =
                new Computer.Builder()
                        .setcpu("Intel i5")
                        .setram(16)
                        .setstorage(512)
                        .setBluetooth(true)
                        .build();

        System.out.println("Computer1 Configuration");
        Computer1.displayComputer();

        System.out.println("Computer2 Configuration");
        Computer2.displayComputer();
    }
}