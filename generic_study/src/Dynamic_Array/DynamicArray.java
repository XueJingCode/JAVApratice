package Dynamic_Array;

import java.util.Arrays;
// 动态数组
public  class DynamicArray<E> {
    private static final int DEFAULT_CAPACITY=10;
    private int size;
    private Object elementDate[];
    public DynamicArray() {
        this.elementDate = new Object[DEFAULT_CAPACITY];
    }
    // 确保容量
    private void ensureCapacity(int minCapacity) {
        int oldCapacity = elementDate.length;
        if(oldCapacity >=  minCapacity){
            return;// 现有容量够用，直接返回
        }
        // 扩容策略：新容量是旧容量的 2 倍
        int newCapacity = oldCapacity * 2;
        // 保证新容量至少达到所需的最小容量
        if(newCapacity < minCapacity){
            newCapacity = minCapacity;
        }
        // 扩容操作：复制旧数组内容到新数组
        elementDate = Arrays.copyOf(elementDate, newCapacity);
    }
    // 添加元素
    public void add(E e) {
        ensureCapacity(size + 1);// 1. 先确保容量足够存放新元素
        elementDate[size++] = e;// 2. 放入元素，size 自增
    }
    // 获取元素
    public E get(int index){
        return (E) elementDate[index];//强制转换
    }
    // 获取大小
    public int size(){
        return size;
    }
    // 设置元素
    public E set(int index,E element){
        E oldValue = get(index);// 1. 先保存旧值
        elementDate[index]=element;// 2. 覆盖新值
        return oldValue;// 3. 返回旧值
    }

}
