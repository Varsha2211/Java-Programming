import java.util.*;
public class Source {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++) { a.add(s.nextInt()); }
        for(int i = 0; i < 5; i++) { b.add(s.nextInt()); }
            
        List <Integer> ans_array= mergeAndSort(a,b);
        System.out.print(ans_array);
	}
	
	public static List<Integer> mergeAndSort(List<Integer> a, List<Integer> b) 
	{
        Scanner s = new Scanner(System.in);
	    int count = 0;
	    List<Integer> merge_list = new ArrayList<Integer>();
        List<Integer> ans = new ArrayList<Integer>();
        
        merge_list.addAll(a);
        merge_list.addAll(b);
        
        Collections.sort(merge_list);
        ans.add(merge_list.get(2));
        ans.add(merge_list.get(6));
        ans.add(merge_list.get(8));
        return ans;
	}
}