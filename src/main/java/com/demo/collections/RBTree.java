package com.demo.collections;

/**
 * @author LiHaitao
 * @description RBTree:红黑树
 * @date 2019/10/16 10:09
 **/
public class RBTree {
    public static void main(String[] args) {
        /**
         * 前言：
         * 在阅读HashMap源码的时候发现，java1.8的HashMap的链表实现增加了红黑树，当链表长度超过指定阈值8的时候回进行树化。
         * 为了提高增删查的效率。
         * 而红黑树又比较复杂，所以专门写一篇关于红黑树的文章。
         * 概念
         * R-B Tree，全称是Red-Black Tree，又称为“红黑树”，是一种特殊的二叉查找树。红黑树的每个结点上都有存储位表示结点的颜色，
         * 首先了解一下百度给出的红黑树概念：
         * 可以是红(Red)或黑(Black)
         * 摘自百度：
         *  红黑树（Red Black Tree） 是一种自平衡二叉查找树，是在计算机科学中用到的一种数据结构，典型的用途是实现关联数组。
         *  它是在1972年由Rudolf Bayer发明的，当时被称为平衡二叉B树（symmetric binary B-trees）。后来，
         *  在1978年被 Leo J. Guibas 和 Robert Sedgewick 修改为如今的“红黑树”。
         *  红黑树和AVL树类似，都是在进行插入和删除操作时通过特定操作保持二叉查找树的平衡，
         *  从而获得较高的查找性能。
         *  它虽然是复杂的，但它的最坏情况运行时间也是非常良好的，并且在实践中是高效的：
         *  它可以在O(log n)时间内做查找，插入和删除，这里的n 是树中元素的数目。
         *
         *  在了解红黑树之前，先了解一下AVL树：https://blog.csdn.net/isunbin/article/details/81707606
         *  红黑树的统计功能要好于AVL树，因为AVL是严格平衡的，红黑树是黑平衡的，维持平衡需要额外的操作。
         *
         * 应用：
         *   C++的STL，map和set都是用红黑树实现的。
         *   著名的linux进程调度Completely Fair Scheduler，用红黑树管理进程控制块。
         *   epoll在内核中的实现，用红黑树管理事件块。
         *   nginx用红黑树管理timer等。
         *   Java的TreeMap实现。
         *
         *性质
         * 红黑树不仅是自平衡二叉树还满足5个性质：
         *  1）每个结点或红或黑
         *  2）根结点是黑色
         *  3）空叶子结点是黑色
         *  4）如果一个结点是红色，那么它的子节点是黑色
         *  5）从任意一个结点出发到空的叶子结点经过的黑结点个数相同
         *  为了满足这五个性质，对于平衡二叉树的插入，删除就多增加了一些操作，为了满足上面5个性质。
         *  因此也多了相关的操作：
         *  左旋，右旋，变色：
         *
         *操作
         *  插入节点面临的情况：
         *   1.树为空，插入的结点为根结点
         *   直接将插入的结点变成黑色
         *   2.父亲结点为黑色结点
         *   不需要任何操作
         *   3.父亲结点为红色结点的情况下：
         *   3.1 叔叔结点也为红色结点
         *   将叔叔和父亲结点改为黑色，爷爷结点改为红色，未完，然后又将爷爷结点当作插入结点看待，一直进行上
         *   面的操作，直到当前结点为根结点，然后将根结点变成黑色
         *   3.2 叔叔结点为黑色结点的情况下：
         *   3.2.1 （父亲结点为左孩子，插入结点也为左孩子）||（父亲结点为右孩子，插入结点也为右孩子）
         *   将父亲结点和爷爷结点的颜色互换，然后针对爷爷结点进行一次左旋
         *   3.2.2 （父亲结点为左孩子，插入结点为右孩子）||（父亲结点为右孩子，插入结点为左孩子）
         *   针对父结点进行右旋，此时右旋后的情况必定是3.2.1的情况，然后按照3.2.1的情况处理
         *
         *
         *
         *
         **/
    }
}
