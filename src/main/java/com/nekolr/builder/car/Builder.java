package com.nekolr.builder.car;

/**
 * 汽车建造者
 */
public interface Builder {
    /**
     * 类型
     *
     * @param type
     */
    void setType(Type type);

    /**
     * 引擎
     *
     * @param engine
     */
    void setEngine(Engine engine);

    /**
     * 座椅
     *
     * @param seats
     */
    void setSeats(int seats);

    /**
     * 导航
     *
     * @param navigator
     */
    void setNavigator(Navigator navigator);

    /**
     * 操作方式
     *
     * @param transmission
     */
    void setTransmission(Transmission transmission);

    /**
     * 构造汽车
     *
     * @return
     */
    Car build();
}
