https://blog.csdn.net/pange1991/article/details/82347284

关于这个 单链表的头插入方式 的理解，我多说两句。
这地方我再看的时候，就有点蒙了，他到底怎么在插到新的数组里面的？
要是在插入新数组的时候，也出现了一个数组下标的位置处，出现了多个节点的话，那又是怎么插入的呢？
1，假设现在刚刚插入到新数组上，因为是对象数组，数组都是要默认有初始值的，那么这个数组的初始值都是null。不信的可以新建个Javabean数组测试下。
那么e.next = newTable[i],也就是e.next = null啦。然后再newTable[i] = e;也就是 说这个时候，这个数组的这个下标位置的值设置成这个e啦。
2，假设这个时候，继续上面的循环，又取第二个数据e2的时候，恰好他的下标和刚刚上面的那个下标相同啦，那么这个时候，是又要有链表产生啦、
e.next = newTable[i];，假设上面第一次存的叫e1吧，那么现在e.next = newTable[i];也就是e.next = e1；
然后再，newTable[i] = e;，把这个后来的赋值在数组下标为i的位置，当然他们两个的位置是相同的啦。然后注意现在的e，我们叫e2吧。e2.next指向的是刚刚的e1，e1的next是null。
这就解释啦：先放在一个索引上的元素终会被放到Entry链的尾部。这句话。