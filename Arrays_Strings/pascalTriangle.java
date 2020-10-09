import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
	public static void main(String[] args) {	
		int numsRows=5;
		System.out.println(generate(numsRows));
	}
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> alist = new ArrayList<List<Integer>>();
        int line=1;
        for(int i=0;i<numRows;i++){
        int c=1;
        int q=0;
        List<Integer> list = new ArrayList<Integer>();
        for(int k=1; k<=line; k++){  
            list.add(q,c);
            c= c*(line-k)/k;
        }
        line++;
        alist.add(list);
        }
        return alist;
    }
}
