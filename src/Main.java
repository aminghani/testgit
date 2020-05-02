import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> list1 = new ArrayList<>();
        List<Customer> list2 = new ArrayList<>();
        list1.add(new Customer("amin" , 122));
        list1.add(new Customer("ehsan" , 124));
        list2.add(new Customer("ali" , 144));
        list2.add(new Customer("sajjd" , 90));
        List<Customer> sortedList = sort(list1,list2);
        for(int i =0;i<sortedList.size();i++){
            System.out.println(sortedList.get(i));
        }
    }

    private static List<Customer> sort(List<Customer> list1 , List<Customer> list2){
        List<Customer> sortedList = new ArrayList<>();
        for(int i = 0;i<list1.size();i++){
            sortedList.add(list1.get(i));
        }
        for(int i = 0;i<list2.size();i++){
            sortedList.add(list2.get(i));
        }
        Collections.sort(sortedList);
        return sortedList;
    }

}
