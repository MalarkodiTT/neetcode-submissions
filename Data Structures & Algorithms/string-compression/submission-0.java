class Solution {
    public int compress(char[] chars) {
        int write =0;
        int i=0;
        while(i<chars.length)
        {
            char current = chars[i];
            int count =0;while(i<chars.length && chars[i] == current)
            {
                i++;
                count++;
            }
            chars[write++] = current;
            if(count > 1)
            {
                char[] cnt = String.valueOf(count).toCharArray();
                for(char c:cnt)
                {
                    chars[write++] =c;
                }
            }
        }
        return write;
    }
}