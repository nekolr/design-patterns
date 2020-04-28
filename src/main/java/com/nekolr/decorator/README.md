# 示例代码类图
示例代码中，最初的文件数据源只具备从文件读取数据和写入数据到文件的功能，使用了装饰模式之后，我们就可以在执行完文件读写的标准操作之后添加新的行为，比如加密数据和压缩数据等。

![例子类图](https://github.com/nekolr/design-patterns/blob/master/media/decorator_example.png)

# 装饰模式
![装饰器模式](https://github.com/nekolr/design-patterns/blob/master/media/decorator.png)

定义：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式比生成子类更为灵活。

- Component 是一个接口或抽象类，定义我们最核心、最原始的对象。
- ConcreteComponent 是最核心、最原始的接口或抽象类的实现，它就是我们要装饰的具体对象。
- Decorator 一般是一个抽象类，实现了 Component 接口的同时还持有一个私有的 Component 对象。
- ConcreteDecorator 继承 Decorator，是具体的装饰类。重写父类方法，并在重写的方法中基于父类方法添加新的功能。

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

# 典型案例
- JDK 中的 I/O 流，比如 InputStream 和 FilterInputStream。其中 InputStream 作为原始对象，而 FilterInputStream 就是装饰角色，具体的装饰器实现大体可以分为两类，其中一类是 DataInputStream，它允许程序以一种机器无关的方式从底层字节输入流中读取 Java 基本数据类型和 String 类型。另一类能够对 InputStream 进行改进或增强，在原有功能的基础上提供新的特性，比如使用最多的 BufferedInputStream 就在  InputStream 的基础上增加了缓冲区。
- JDK 中的 java.util.Collections 工具类，比如一些以 synchronized 开头的方法，举个例子: synchronizedList 就是在原始 List 方法的基础上加入了同步代码块。