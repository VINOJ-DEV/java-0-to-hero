class Solution {
    public int romanToInt(String s) {
        
        int prev = 0;  //int curr = 0;
         int sum = 0;
        for(int i=0;i<s.length();i++){
            // if(s.charAt(i)=='I') curr =1;
            // if(s.charAt(i)=='V') curr =5;
            // if(s.charAt(i)=='X') curr =10;
            // if(s.charAt(i)=='L') curr =50;
            // if(s.charAt(i)=='C') curr =100;
            // if(s.charAt(i)=='D') curr =500;
            // if(s.charAt(i)=='M') curr =1000;
            int curr = 0;
        
        switch(s.charAt(i)) {
            case 'I': curr = 1; break;
            case 'V': curr = 5; break;
            case 'X': curr = 10; break;
            case 'L': curr = 50; break;
            case 'C': curr = 100; break;
            case 'D': curr = 500; break;
            case 'M': curr = 1000; break;}
            sum = sum+curr;
            if(curr>prev) sum=sum-(2*prev);
            prev = curr;
        }
        return sum;
    }
}