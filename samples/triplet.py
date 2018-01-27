# in this program you have given an array and you have to find all triplet combination which make a triangle

a = [5, 6, 8, 14, 86, 45, 43, 24, 67, 34, 56, 50]
new_array = []

for i in range(0,len(a)):
    for j in range(i + 1 , len(a)-1):
        new_array.append([a[i], a[j]])

print(new_array)