data = input("Input Data")
stringa=""
for a in data:
    if a.isnumeric():
        stringa+=a

print(stringa)
