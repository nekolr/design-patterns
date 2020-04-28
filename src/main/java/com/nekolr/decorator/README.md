# 装饰器模式
![装饰器模式](https://github.com/nekolr/design-patterns/blob/master/media/decorator.png)

- Component 是一个接口或抽象类，定义我们最核心、最原始的对象。
- ConcreteComponent 是最核心、最原始的接口或抽象类的实现，它就是我们要装饰的具体对象。
- Decorator 一般是一个抽象类，实现了 Component 接口的同时还持有一个私有的 Component 对象。
- ConcreteDecorator 继承 Decorator，是具体的装饰类。

![例子类图](https://github.com/nekolr/design-patterns/blob/master/media/decorator_example.png)

# 适用性
如果希望在无需修改代码的情况下即可使用对象，同时还可以在运行时为对象新增额外的行为，那么可以使用装饰器模式。

如果用继承来扩展对象的行为无法实现，比如类使用 final 修饰，那么可以使用该模式。

# 优缺点
优点：

- 可以无需通过创建新子类，而是通过聚合（或组合）的方式即可扩展对象的行为。
- 可以在运行时添加或删除对象的行为。
- 可以使用多个装饰器对象来组合集中不同的行为。
- 可以将实现了不同行为的一个大类拆分为多个较小的类，即**单一职责原则**。

缺点：

- 在装饰器栈中删除特定的装饰器比较困难。
- 实现行为不受装饰器栈顺序影响的装饰器比较困难。
