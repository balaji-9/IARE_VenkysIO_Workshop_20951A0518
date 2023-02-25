import time
start = time.time()
s = list(input("Enter the string:"))
l = len(s)
i,j = 0,l-1
ans = ''
while i < j:
    s[i],s[j] = s[j] , s[i]
    i+=1
    j-=1
print(''.join(s))
end = time.time()
print("Time in ms:",(end-start)*1000)

