package Generic_Method;

import java.util.Arrays;

public class test {
    
    static class SearchResult {
        private boolean found;
        private int index;
        
        public SearchResult(boolean found, int index) {
            this.found = found;
            this.index = index;
        }
        
        public boolean isFound() {
            return found;
        }
        
        public int getIndex() {
            return index;
        }
        
        @Override
        public String toString() {
            return "找到：" + found + ", 索引：" + index;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== 泛型方法演示 ===");
        
        String[] names = {"你好", "hi", "hello"};
        System.out.println("\n字符串数组：" + Arrays.toString(names));
        String searchName = "hello";
        SearchResult result1 = indexOf(names, searchName);
        System.out.println("查找元素 \"" + searchName + "\" -> " + result1);
        
        Integer[] numbers = {1, 2, 3};
        System.out.println("\n整数数组：" + Arrays.toString(numbers));
        Integer searchNum = 10;
        SearchResult result2 = indexOf(numbers, searchNum);
        System.out.println("查找元素 " + searchNum + " -> " + result2);
        
        Integer searchNum2 = 2;
        SearchResult result3 = indexOf(numbers, searchNum2);
        System.out.println("查找元素 " + searchNum2 + " -> " + result3);
        
        System.out.println("\n=== 演示结束 ===");
    }
    
    public static <T> SearchResult indexOf(T[] arr, T elm) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(elm)){
                return new SearchResult(true, i);
            }
        }
        return new SearchResult(false, -1);
    }
}