package com.demo.highConcurrency;

/**
 * @author LiHaitao
 * @description VolatileAndSynchronized:Volatile和Synchronized关键字
 * @date 2019/9/23 16:12
 **/
public class VolatileAndSynchronized {
    /**
     * volatile：
     * synchronized和volatile都扮演着重要的角色。volatile是轻量级的synchronized，他在处理并发中保证了
     * 共享变量的可见性，可见性的意思是一个线程修改这个变量的时候另一个线程可以读到这个修改的值，如果volatile修饰
     * 恰当的话，他比synchronized执行成本更低，因为他不会引起上下文切换和调度资源。
     * synchronized：
     * synchronized实现同步的基础，java中的每一个对象都可以作为锁。具体有一下三种形式：
     * 1，对于普通方法，锁时当前实例对象
     * 2，对于静态同步方法，锁是当前类的Class对象
     * 3，对于同步方法块，锁是Synchronized括号里配置的对象
     * 锁的升级和对比：
     * 偏向锁：等到竞争出现才释放的锁，优点：加锁和解锁不需要额外的消耗，和执行非同步方法相比仅存在在纳秒级的差距。
     *         缺点：如果线程间存在锁竞争，会带来额外的锁撤销消耗。
     *         适用场景：适用于只有一个线程访问同步块场景
     * 轻量级锁：优点：竞争的线程不会阻塞，提高了程序的响应速度。
     *           缺点：如果始终得不到锁竞争的线程会使用自旋消耗cpu
     *           适用场景：追求响应时间，同步执行速度非常快
     * 重量级锁：优点：线程竞争不使用自旋，不会消耗cpu。
     *          缺点：线程阻塞，响应时间慢。
     *          使用场景：追求吞吐量。同步块执行速度较长。
     *  原子操作的实现原理：
     *  处理器实现原子操作？
     *  1，使用总线锁保证原子性
     *     总线锁就是提供一个LOCK #信号当一个处理器输出此信号的时，其他处理器请求将被阻塞住，那么该处理器将独占共享内存。
     *  2，使用缓存锁保证原子性
     *     在同一时刻，我们只需要保证某个内存地址的操作是原子性的，但是总线锁把cpu和内存之间的通信锁住了，是的锁定期间，处理器不能
     *     操作其他内存地址的数据，所以总线锁开销比较大。
     *  Java实现原子性：
     *  1，使用循环CAS实现原子操作:
     *     JVM中的CAS操作正是利用了处理器提供的CMPXCHG指令实现的。自旋CAS实现的基本思路是循环进行CAS操作直到成功。
     *     代码：
     *      @see Counter
     *  CAS存在的问题：
     * （1），ABA问题
     * （2），循环时间长开销大
     * （3），只能保证一个共享变量的原子操作
     * 2，使用锁机制实现原子操作：
     *    锁机制保证了获得锁的线程才能够操作锁定的内存区域。除了偏向锁，JVM实现锁的方式都使用了循环CAS，即当
     *    一个线程想进入同步块的时候使用循环CAS的方式来获取锁，当他退出同步块的时候使用循环CAS释放锁。
     */


}
