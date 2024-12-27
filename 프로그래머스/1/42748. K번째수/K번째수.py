def solution(array, commands):
    answer = []
    
# array에서 i~j 자르고, 정렬 후 k번째를 answer에 추가
    for i,j,k in commands:
        
        answer.append(sorted(array[i-1:j])[k-1])
    return answer
        

