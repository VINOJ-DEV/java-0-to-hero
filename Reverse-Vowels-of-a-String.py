class Solution:
    def reverseVowels(self, s: str) -> str:
        v='aeiouAEIOU'
        S=list(s)
        char=[]
        for i in S:
            if i in v:
                char.append(i)
        for i in range(len(S)):
            if S[i] in v:
                S[i] = char.pop()     
        return ''.join(S)    