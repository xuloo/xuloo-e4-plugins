package cc.xuloo.ds;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

import cc.xuloo.ds.F.Promise;

public class ThreadedProcessor {

	private BlockingImpl impl;
	
	private BlockingQueue<DelayableJob> queue;
	
	public ThreadedProcessor(int capacity, boolean autoStart) {
		impl = new BlockingImpl(queue = new ArrayBlockingQueue<DelayableJob>(capacity));
		
		if (autoStart) start();
	}
	
	protected void start() {
		if (impl != null) impl.start();
	}
	
	protected void stop() {
		if (impl != null) impl.interrupt();
	}
	
	protected void process(DelayableJob job) {
		queue.add(job);
	}
	
	protected abstract class DelayableJob<T> implements Callable<T> {
		
		private Promise<T> promise;
		
		private long delay;
		
		private boolean delayed = true;
		
		public DelayableJob() {
			this(0L);
		}
		
		public DelayableJob(long delay) {
			this.delay = delay;
			promise = new Promise<T>();
		}
		
		public DelayableJob(long delay, boolean delayed) {
			this(delay);
			this.delayed = delayed;
		}
		
		public DelayableJob(boolean delayed) {
			this();
			this.delayed = delayed;
		}
		
		public long getDelay() {
			return delay;
		}
		
		public void setDelay() {
			this.delay = delay;
		}
		
		public boolean isDelayed() {
			return delayed;
		}
		
		public void setDelayed(boolean delayed) {
			this.delayed = delayed;
		}
		
		public Promise<T> getPromise() {
			return promise;
		}
	}
	
	private class BlockingImpl extends Thread {
		
		private BlockingQueue<DelayableJob> queue;
		
		private Stopwatch stopwatch = new Stopwatch();
		
		public BlockingImpl(BlockingQueue<DelayableJob> queue) {
			this.queue = queue;
		}
		
		@Override
		public void run() {
			while (true) {
				
				try {
					// Blocks until there is something in the queue
					DelayableJob job = queue.take();
					try {
						job.getPromise().invoke(job.call());
					} catch (Exception e) {
						System.out.println("Problem executing threaded job: '" + e.getMessage() + "'");
						e.printStackTrace();
					}
			
	                stopwatch.stop();
	
	                // Sleeps until the minimum delay time has passed (if it hasn't passed)
	                if(job.isDelayed() && stopwatch.getElapsedTime() < job.getDelay())
	                {
	                    Thread.sleep(job.getDelay() - stopwatch.getElapsedTime());
	                }
	                
	                stopwatch.start();
	                
				} catch (InterruptedException e) {
					
				}
			}
		}
	}
}
