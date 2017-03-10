package week1;

public class Threading implements Runnable {
	public int tong;
	public Threading() {
		this.tong  = 1000;
	}
	//sync thread: thread 1 start firstly then lock this method, thread2  can not implements this method so need to wait 
	public synchronized void rutTien(){
		if (tong > 0){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tong = tong - 1000;
			System.out.println("tong = " + tong);
		} else{
			System.out.println("het tien");
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		rutTien();
	}


	public static void main(String[] args) {
		// ex1: thread 1 vs thread2
		Thread1 thread1 = new Thread1();
		Thread t1 = new Thread(thread1);
		
		Thread2 t2 = new Thread2();
		
		t1.start();
//		try {
//			//thread 1 run first 5s then start theard2
////			t1.join(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t2.start();
		//example2: sync thread
//		Threading t = new Threading();
//		Thread t3 = new Thread(t);
//		Thread t4 = new Thread(t);
//		t3.start();
//		t4.start();
	}


	
	

}
