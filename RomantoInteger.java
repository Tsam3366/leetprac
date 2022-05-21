
import java.util.HashMap;
public class RomantoInteger {
    public static void main(String[] args) {
        String str="LVII";
        System.out.println(romanToInt(str));
    }
     public static int romanToInt(String s) {
        HashMap <Character,Integer> hm=new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X',10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int size=s.length();
        int result=hm.get(s.charAt(size-1));
        for(int i=size-2;i>=0;i--)
        {
            if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1)))
            {
                result-=hm.get(s.charAt(i));
            }
            else
            {
                result+=hm.get(s.charAt(i));
            }
        }
        return result;
    }
}

