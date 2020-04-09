skills = []
max = None
index = [0, 0]
for i in range(4):
    skills.append(input().split(" "))
    for j in range(3):
        if max == None:
            max = int(skills[i][j])
            index = [i, j]
        elif int(skills[i][j]) > max:
            max = int(skills[i][j])
            index = [i, j]
print(index[0] + 1)