class mythread1 extends Thread
{
volatile int count=0;
public void run()
{
while(true)
count++;
}
void show(){
System.out.println("the count value of thread1 is :" +count);
}
}
class mythread2 extends Thread
{
volatile int count=0;
public void run()
{
while(true)
count++;
}
void show(){
System.out.println("the count value of thread2 is :" +count);
}
}
class ThreadTest
{
public static void main(String args[])throws InterruptedException
{
mythread1 ob1=new mythread1();
mythread2 ob2=new mythread2();
ob1.setPriority(10);
ob2.setPriority(4);
ob1.start();
ob2.start();
Thread.sleep(100*5);
ob2.stop();
ob1.stop();
ob1.show();
ob2.show();
}
}