package OOP;

public class Computer {
private Processor processor;
private Ram ram;


public Computer(Processor processor, Ram ram){
   this.processor=processor;
   this.ram = ram;
}
 public void run() {
     System.out.println("Computer procesor has: " + processor.numberOfCores + " number of cores");
     System.out.println("Computer ram is made by : " + ram.name);

 }

}

