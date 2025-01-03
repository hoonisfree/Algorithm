from itertools import permutations

def solution(k, dungeons):
    max_d = 0
    
    for p in permutations(dungeons):
        cur_k=k
        count=0
        
        for min_r, cost in p:
            if cur_k >= min_r:
                cur_k -= cost
                count+=1
                
            else:
                break
        max_d = max(max_d, count)
    
    return max_d