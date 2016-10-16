package com.cuzofu.pattern.singleton.mode2;

/**
 * 
 * 懒汉式，线程安全</br>
 * 是否 Lazy 初始化：是</br>
 * 是否多线程安全：是</br>
 * 实现难度：易</br>
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。</br>
 * 优点：第一次调用才初始化，避免内存浪费。</br>
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。</br>
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。</br>
 * 
 * @author cuzofu
 *
 */
public class Singleton {

	private static Singleton instance;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}

}