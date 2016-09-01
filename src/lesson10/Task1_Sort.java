package lesson10;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Note on 16.08.2016.
 */
public class Task1_Sort {
    public static void main(String[] args) {
        String [] str  = {"Add","dsdsd","sd","fds"};

     Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }

}

//class CompareDesk implements Comparator<String>{
//    @Override
//    public int compare (String o1, String o2){
//        if ( o1 > o2 ){
//            return -1;
//
//        }else if (o1<o2){return 1}
//
//        return 0;
//    }
//}

//class CompareStringIgnoreCase implements