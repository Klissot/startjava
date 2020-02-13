public class Variable {
    public static void main(String[] args) {
        byte cpuCore = 4;
        float cpuFrequency = 2.30f;
        short ram = 6;
        double availableMemory = 5.85;
        int ssdMemory = 500;
        long graphicsCard = 1050;
        char diskName = 'C';
        boolean isWindows = true;   
        
        System.out.println("Acer Nitro");
        System.out.println("CPU: " + "Core - " + cpuCore + "; frequency - " + cpuFrequency);
        System.out.println("Memory: " + "RAM - " + ram + ", available - " + availableMemory + "; SSD - " + ssdMemory);
        System.out.println("Graphics:" + " Model - NVIDIA GeForce GTX" + graphicsCard);
        System.out.println("System on the disk " + diskName);
        System.out.println(isWindows);
    }
}