import math

def corner():
  corner_res = 0
  for i in range(3):
    for j in range(3):
      for k in range(4):
        if i == 1 and j == 1:
          if k == 0:
            if input_barcode[i][j] == '1':
              print(0)
              exit()
          elif k == 1:
            if input_barcode[i][j + 6] == '1':
              print(0)
              exit()
          elif k == 2:
            if input_barcode[i + 6][j] == '1':
              print(0)
              exit()
          else:
            if input_barcode[i + 6][j + 6] == '1':
              print(0)
              exit()
        else:
          if k == 0:
            if input_barcode[i][j] == '0':
              print(0)
              exit()
          elif k == 1:
            if input_barcode[i][j + 6] == '0':
              print(0)
              exit()
          elif k == 2:
            if input_barcode[i + 6][j] == '0':
              print(0)
              exit()
          else:
            if input_barcode[i + 6][j + 6] == '0':
              print(0)
              exit()     
  return corner_res

def center():
  center_res = 0
  for i in range(3):
    for j in range(3):
      for k in range(5):
        if k == 0:
          if input_barcode[i][j + 3] == '2':
            center_res += 1
        elif k == 1:
          if input_barcode[i + 3][j] == '2':
            center_res += 1
        elif k == 2:
          if input_barcode[i + 3][j + 3] == '2':
            center_res += 1
        elif k == 3:
          if input_barcode[i + 3][j + 6] == '2':
            center_res += 1
        else:
          if input_barcode[i + 6][j + 3] == '2':
            center_res += 1
  return center_res

input_barcode = []
for i in range(9):
  input_barcode.append(input())

res = 0
res += corner()
res += center()
print(int(math.pow(2, res)))