大话设计模式手写一遍
计算器用到了动态绑定方法
1、简单工厂模式  这个模式我是自己纯手写一遍的，和书中的代码不尽相同，可能思想也不太相同，留在第二遍的时候再看吧


2、策略模式
感觉简单工厂模式和策略模式都差不多，所以这个代码我没有再重新写一遍区别是策略模式在简单工厂的基础上加上了策略，即是工厂的同时又加上了策略，所以新加的类不是Factory为名称的类，而是Context为名称的类，但是其中又包含了工厂，但是这个简单工厂模式和策略模式具体的区别
我也不是很清楚，但是现在没有时间看了，需要第二遍看的时候再仔细看吧



3、单一职责原则
如果一个类中可以分成多种职责，那么这个类可以分成多个类这样可以便于重用

4、开闭原则，尽量写完之后少修改，同时复用这个代码，封闭即为尽量少修改或者不修改原有代码，开即为在此基础上增加新的类来符合需求


5、依赖倒转原则：依赖倒转原则是以李氏代换原则为前提的，即一个所有出现父类的地方都可以用子类代替，
所有的父类，说白了就是针对接口编程，而不是针对实现编程
