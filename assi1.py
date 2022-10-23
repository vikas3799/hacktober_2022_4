print("assingment 1")
print("hacktober_fest")
def myfun(a):
    s=0
    while a>0:
        d=a%10
        s=s+d
        a=a//10
    return s
a=int(input("Enter a number:- "))
print(myfun(a))
