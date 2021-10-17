en = input().split(" ")
no = input().split(" ")

n = int(en[0]) #pessoas na roda
l = round(float(en[1]),1) #quantidade de litros de água
q = round(float(en[2]),1) #litros de água que cabem na cuia
dude = 0
ok = 0
# (l / q)%q = pessoa
# l%q = qntd
#dude = int((l/q)%n)

while ok==0:
    if l <= q:
        ok==1
        break
    if l > q:
        l = l-q
    dude += 1
dude = int(dude%n)
print(no[dude],round(l,1))