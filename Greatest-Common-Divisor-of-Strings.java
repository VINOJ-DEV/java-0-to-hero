class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String x = ""; String y = "";
        
        if (!(str1+str2).equals(str2+str1)) {return ""; } 


        int n = gcd(str1.length(),str2.length());
        return(str1.substring(0,n));
    }
        private int gcd(int a, int b){
            return ( b==0 ? a : gcd(b,a%b));
        }         

            }   
         
        // for printing unique char 
        // for (int i=0;i<str1.length();i++){
        //     char v = str1.charAt(i);
        //     if (x.indexOf(v)==-1)
        //         x+=v;
        // }
        // if (str2.indexOf(x)==-1){ return "";}
        // else return x;
    