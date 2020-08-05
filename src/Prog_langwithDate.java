import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.*;

class exec
{


    HashMap<Integer, List<String>> hash_map = new HashMap<>();
    public void exec_method()throws Exception {

        hash_map.put(1996,new ArrayList<String>(Arrays.asList("JDK1.0")));
        hash_map.put(1997,new ArrayList<String>(Arrays.asList("JDK1.1","innerClasses")));
        hash_map.put(1998,new ArrayList<String>(Arrays.asList("J2SE1.2","java2")));
        hash_map.put(2000,new ArrayList<String>(Arrays.asList("J2SE1.3","HotspotJVM")));
        hash_map.put(2002,new ArrayList<String>(Arrays.asList("J2SE1.4","JSR59")));
        hash_map.put(2004,new ArrayList<String>(Arrays.asList("J2SE5.0","for-eachloops")));
        hash_map.put(2006,new ArrayList<String>(Arrays.asList("JSE6","JSR269","JDK1.0")));
        hash_map.put(2011,new ArrayList<String>(Arrays.asList("JSE7","JSR336")));
        hash_map.put(2014,new ArrayList<String>(Arrays.asList("JSE8","LamdaExpressions")));
        hash_map.put(2018,new ArrayList<String>(Arrays.asList("JSE11","LTS")));
        hash_map.put(2019,new ArrayList<String>(Arrays.asList("JSE12","JSE13")));
        hash_map.put(2020,new ArrayList<String>(Arrays.asList("JSE14")));


    }
        public void getYear (String Software)throws Exception
        {
            int final_key=0;
            for(Map.Entry<Integer,List<String>> key1:hash_map.entrySet())
            {
               List<String> list_sftwr =key1.getValue();
               for(String str:list_sftwr) {
                   if (str.equals(Software))
                   {
                       final_key=key1.getKey();

                   }
               }

            }
            System.out.println(final_key);
        }
        public void getSoftware (int year)
        {
            System.out.println(hash_map.get(year));
        }

}
public class Prog_langwithDate {

    public static void main(String[] args)throws Exception {
        try
        {
        exec ex=new exec();
        ex.exec_method();
        Scanner scan =new Scanner(System.in);
        System.out.println("Select from the options");
        System.out.println("1- To know year of release");
        System.out.println("2- To know Software released in year");
        int ch=scan.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("Enter software");
                String software=scan.next();ex.getYear(software);

            break;
            case 2:System.out.println("Enter year");
                int year=scan.nextInt();ex.getSoftware(year);
            break;
            default:
                System.out.println("Wrong input! Please select 1 or 2");
                break;

        }
    }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
