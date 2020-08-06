package StreamDemo;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();
        list.add("诛仙剑");
        list.add("戮仙剑");
        list.add("玄铁重剑");
        list.add("诛仙剑阵");
        list.add("巨阙含光剑");
        //list.stream().forEach(e -> System.out.println(e));
        //list.stream().filter(e -> e.endsWith("剑")).forEach(e -> System.out.println(e));
        list.stream().filter(e -> e.endsWith("剑")).filter(e -> e.length() == 3).forEach(e -> System.out.println(e));*/
        //List集合的流
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();
        System.out.println(listStream);
        //set 的流
        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();
        System.out.println(setStream);
        //数组的流
        String[] str = new String[5];
        Stream<String> stringStream = Stream.of(str);
        System.out.println(stringStream);
        //Map的流
        Map<String,String> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<String> valueStream = map.values().stream();
        Stream<Map.Entry<String,String>> entryStream = map.entrySet().stream();
        System.out.println(keyStream);
        System.out.println(valueStream);
        System.out.println(entryStream);
    }
}
