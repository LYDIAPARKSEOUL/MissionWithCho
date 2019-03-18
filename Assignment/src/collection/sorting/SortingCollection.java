package collection.sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class SortingCollection {
                public static void main(String[] args) {
                                SortingCollection sc = new SortingCollection();
                                int[] num = { 5, 1, 2, 3, 13, 4, 22, 66, 75, 100 };
                                int[] sorting = { 1, 2, 3, 4, 5, 13, 22, 66, 75, 100 };
                                // Array(배열)에서의Sorting
                                sc.arraySorting(num, sorting);
                                System.out.println();
                                // List 에서의 Sorting
                                sc.listSorting();
                                System.out.println();
                                // Set 에서의 Sorting
                                sc.setSorting();
                                System.out.println();
                                // Map 에서의 Sorting
                                sc.mapSorting();
                                System.out.println();
                }
                // Array(배열)에서의Sorting
                public void arraySorting(int[] num, int[] sorting) {
                                Arrays.sort(num);
                                System.out.print("[ Array ] Sorting num : ");
                                for (int i = 0; i < num.length; i++) {
                                                System.out.print(" " + num[i]);
                                }
                                System.out.println();
                }
                // List 에서의 Sorting
                public void listSorting() {
                                List<Integer> sortingList = new LinkedList<>();
                                sortingList.add(1);                               sortingList.add(33);
                                sortingList.add(10);                             sortingList.add(7);
                                sortingList.add(3);                               sortingList.add(8);
                                sortingList.add(22);                             sortingList.add(102);
                                sortingList.add(4);                               sortingList.add(90);
                                System.out.println("[ List ] Before Sorting : " + sortingList);
                                Collections.sort(sortingList);
                                System.out.println("[ List ] After Sorting : " + sortingList);
                                
                                Comparator<Integer> comp = new Comparator<Integer>() {
                                                @Override
                                                public int compare(Integer o1, Integer o2) {
                                                                return o2.compareTo(o1); // Comparator 인터페이스를 지정해 정렬순서 지정가능
                                                }
                                };
                                Collections.sort(sortingList, comp);
                                System.out.println("[ List ] After Sorting (내림) : " + sortingList);
                }
                // Set 에서의 Sorting
                public void setSorting() {
                                Set<Integer> intSet = new LinkedHashSet<>();
                                intSet.add(4);        intSet.add(1); 
                                intSet.add(30);       intSet.add(54);
                                intSet.add(14);       intSet.add(99);
                                intSet.add(2);        intSet.add(24);
                                intSet.add(34);       intSet.add(114);
                                
                                System.out.println("[ Set ] Before Sorting : " + intSet);
                                List<Integer> list = new ArrayList<Integer>(intSet);
                                // Collections 클래스의 sort 메소드 이용해 정렬
                                Collections.sort(list, (i1, i2) -> { //람다식 이용 (내림차순정렬)
                                                return i2 - i1;
                                });
                                intSet = new LinkedHashSet<>(list);
                                System.out.println("[ Set ] After Sorting (내림Set) : " + intSet);
                }
                
                // Map 에서의 Sorting
                public void mapSorting() {
                                Map<Integer, String> map  = new HashMap<>();
                                map.put(2, "유지태");        map.put(25, "유덕화");
                                map.put(13, "정우성");      map.put(70, "박건후");
                                map.put(4, "유승호");        map.put(41, "윤종신");
                                map.put(1, "김우빈");        map.put(12, "박보검");
                                map.put(8, "이순재");        map.put(80, "키아누리브스");
                                
                                System.out.println("[ Map ] Before Sorting :" + map);
                                
                                // HashMap 에 있는 키값들을 뽑아서 순차정렬..
                                // key값 뽑기
                                System.out.print("[ Map ] HashMap 의 key : ") ;
                                Set<Integer> setKeys = map.keySet();
                                Iterator<Integer> iterator = setKeys.iterator();
                                while(iterator.hasNext()) { // 출력해보려고 Iterator 이용한것
                                                Integer key= iterator.next();
                                                String str = Integer.toString(key);
                                                System.out.print(str + " ");
                                }
                                System.out.println();
                                // key 값을  정렬
                                List<Integer> list = new ArrayList<>(setKeys);
                                Collections.sort(list, (i1, i2) -> { return i1-i2 ;}); // 람다식 이용 (오름차순정렬)
                                setKeys = new LinkedHashSet<>(list);
                                System.out.println("[ Map ] 정렬된 Map의 keys (오름) : "+ setKeys);
                                
                                // 정렬된 key값들을 이용해서 Map을 정렬한다.
                                List<Map.Entry<Integer, String>> entries  = new ArrayList<>(map.entrySet());
                                // List 에 map의 entry 형태로 담을수 있는 entries 객체 생성 후
                                // Collections.sort 메소드 이용해 정렬 (Comparator 이용해 오름차순으로 정렬)
                                Collections.sort(entries, new Comparator<Entry<Integer, String>>() {
                                                @Override
                                                public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
                                                                return o1.getKey().compareTo(o2.getKey()); // Map의 key값들 비교해서 정렬(오름차순)
//                                                             return o2.getKey().compareTo(o1.getKey()); // Map의 key값들 비교해서 정렬(내림차순)
                                                }
                                });
                                Map<Integer, String> sortedMap = new LinkedHashMap<>();
                                for( Map.Entry<Integer, String> entry  : entries ) { // 루프문을 이용해 정렬된 값들을 Map 객체에 넣어줌
                                                sortedMap.put(entry.getKey(), entry.getValue());
                                }
                                System.out.println("[ Map ] After Sorting by keys:" + sortedMap);
                                
                                // HashMap 에 있는 Value값들을 뽑아서 순차정렬..
                                // map 에 있는 value 값들을 뽑아내기
                                List<String> valueList = new ArrayList<>();
                                for(int i = 0; i < map.size() ; i++) {
                                                valueList.add(map.get(list.get(i))  );
                                }
                                System.out.println("[ Map ] 정렬된 Map의 Values : "+valueList);
                                
                                List<Map.Entry<Integer, String>> entries2 = new ArrayList<>(map.entrySet());
                                Collections.sort(entries2, new Comparator<Entry<Integer, String>>() {
                                                @Override
                                                public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
                                                                return o2.getValue().compareTo(o1.getValue()); // 이름 오름차순 정렬
                                                }
                                });
                                Map<Integer, String> sortedMapByValue = new LinkedHashMap<>();
                                for(Map.Entry<Integer, String> entry : entries2) {
                                                sortedMapByValue.put(entry.getKey(), entry.getValue());
                                }
                                System.out.println("[ Map ] After Sorting by values:" +sortedMapByValue);
                }
                
}