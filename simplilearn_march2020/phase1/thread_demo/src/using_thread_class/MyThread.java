package using_thread_class;

public class MyThread extends Thread {

	@Override
	public void run() {
		//System.out.println(Thread.currentThread()+" Id = "+Thread.currentThread().getId());
		for (int i = 0; i < 4; i++) {
			System.out.println("printing from "+Thread.currentThread().getName()+" i = "+i);
			try {
				Thread.currentThread().sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
