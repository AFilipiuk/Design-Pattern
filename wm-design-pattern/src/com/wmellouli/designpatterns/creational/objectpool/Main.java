package com.wmellouli.designpatterns.creational.objectpool;

/**
 * 
 * The object pool pattern is a software creational design pattern that uses a set of initialised objects kept ready to use, rather than allocating and
 * destroying them on demand. A client of the pool will request an object from the pool and perform operations on the returned object. When the client has
 * finished, it returns the object, which is a specific type of factory object, to the pool rather than destroying it.
 * 
 * Object pooling can offer a significant performance boost in situations where the cost of initializing a class instance is high, the rate of instantiation of
 * a class is high, and the number of instances in use at any one time is low. The pooled object is obtained in predictable time when creation of the new
 * objects (especially over network) may take variable time.
 * 
 * However these benefits are mostly true for objects that are expensive with respect to time, such as database connections, socket connections, threads and
 * large graphic objects like fonts or bitmaps. In certain situations, simple object pooling (that hold no external resources, but only occupy memory) may not
 * be efficient and could decrease performance.
 * 
 * Examples
 * 
 * In the .NET Base Class Library there are a few objects that implement this pattern. System.Threading.ThreadPool is configured to have a predefined number of
 * threads to allocate. When the threads are returned, they are available for another computation. Thus, one can use threads without paying the cost of creation
 * and disposal of threads.
 * 
 * Java supports thread pooling via java.util.concurrent.ExecutorService and other related classes. The executor service has a certain number of "basic" threads
 * that are never discarded. If all threads are busy, the service allocates the allowed number of extra threads that are later discarded if not used for the
 * certain expiration time. If no more threads are allowed, the tasks can be placed in the queue. Finally, if this queue may get too long, it can be configured
 * to suspend the requesting thread.
 * 
 * [source: wikipedia]
 * 
 * 
 * @author Walid MELLOULI
 * 
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Not implemented !");

	}

}
