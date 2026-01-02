list = [1, 4, 6, 6, 5]

max = second_max = -1

for i in range(len(list)):
    if (list[i] < max):
        if(list[i] > second_max):
            second_max = list[i]
    elif(list[i] > max):
        second_max = max
        max = list[i]

print(second_max)