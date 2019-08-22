package student;

public class Computer {

    private String operatingSystem;
    private double processTact;
    private double memory;
    private int hardDrive;

    public Computer() {

    }

    public Computer(String a, double b, double c, int d) {

        this.operatingSystem = "Linux";
        this.processTact = 2.4;
        this.memory = 16.0;
        this.hardDrive = 500;
    }

    public void setOperatingSystem(String newOS) {

        this.operatingSystem = newOS;
    }

    public void setProcessTact(double newPT) {

        this.processTact = newPT;
    }

    public void setMemory(double newMemory) {

        this.memory = newMemory;
    }

    public void setHardDrive(int newHD) {

        this.hardDrive = newHD;
    }

    public String getOperatingSystem() {

        return this.operatingSystem;
    }

    public double getProcessTact() {

        return this.processTact;
    }

    public double getMemory() {

        return this.memory;
    }

    public int getHardDrive() {

        return this.hardDrive;
    }
    
    public void infoComputer() {
    
        System.out.println(this.hardDrive + this.operatingSystem + this.processTact + this.memory);
    }

}
