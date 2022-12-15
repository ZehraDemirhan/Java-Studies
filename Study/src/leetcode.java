
class Solution {
    public int lengthOfLongestSubstring(String s) {
       int max = 0;
       int count = 0;
       int j ;
       Map<Character, Integer> map = new HashMap<>();
       boolean cont = true;
        
     
       if(s.length()==0 || s.length()==1)
           return s.length();
     
       for(int i = 0; i < s.length(); i++) {  
            
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            count++;
            cont = true;
            //System.out.println("count: "+ count);

            j=i+1;

            while(j< s.length() && cont){

                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                //System.out.println("value: " + map.get(s.charAt(j)));
                if(map.get(s.charAt(j))!=1)
                {

                    if (count > max)
                    {
                        max = count;
                    }

                map.clear();
                count = 0;
                //System.out.println("loop" + j); 
                cont= false;

                }
                else{ 

                    count++;
                    //System.out.println("count incremented");

                }
                j++;
            }
         }

    return max; 
        
    } 
}
