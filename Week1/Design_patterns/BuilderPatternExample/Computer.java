public class Computer {
    private String cpu;
    private int ram;
    private int storage;
    private boolean bluetooth;

    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.bluetooth = builder.bluetooth;
    }
    public void displayComputer(){
        System.out.println("CPU      :"+cpu);
        System.out.println("RAM      :"+ram+"GB");
        System.out.println("Storage  :"+storage+"GB");
        System.out.println("Bluetooth:"+bluetooth);
        System.out.println();
    }
    public static class Builder{
        private String cpu;
        private int ram;
        private int storage;
        private boolean bluetooth;

        public Builder setcpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder setram(int ram){
            this.ram = ram;
            return this;
        }
        public Builder setstorage(int storage){
            this.storage = storage;
            return this;
        }
        public Builder setBluetooth(boolean Bluetooth){
            this.bluetooth = bluetooth;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
