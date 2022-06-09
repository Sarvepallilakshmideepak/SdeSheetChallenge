import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
         ArrayList<ArrayList<Long>> list=new ArrayList<ArrayList<Long>>(); 
         for(int i=0;i<n;i++)
          {
                list.add(new ArrayList<>());
          }
        list.get(0).add(1L);
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<list.get(i-1).size()+1;j++)
            {
                if(j==0)
                {
                    list.get(i).add(1L);
                }
                else if(j==list.get(i-1).size())
                {
                    list.get(i).add(1L);
                }
                else
                {
                    list.get(i).add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
        }
        return list;
	}
}

