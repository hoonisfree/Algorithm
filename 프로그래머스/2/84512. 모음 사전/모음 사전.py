def solution(word):
    v = ['A','E','I','O','U']
    weight = [5**4+5**3+5**2+5**1+5**0,5**3+5**2+5**1+5**0,5**2+5**1+5**0,5**1+5**0,5**0]
    result = 0
    
    for i,char in enumerate(word):
        index = v.index(char)
        result += index*weight[i] +1
        
    return result