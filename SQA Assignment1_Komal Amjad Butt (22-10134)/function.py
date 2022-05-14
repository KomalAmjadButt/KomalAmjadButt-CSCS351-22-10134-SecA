def odd(n):
    if (n != 1) and (n % 1) == 0 and (n % n) == 0:
        return True
    return False

def even(n):
    if (n % 2) == 0:
        return True
    return False


def add(a, b):
    """Add Function"""
    return a + b


def subtract(a, b):
    """Subtract Function"""
    return a - b

def maximum(a, b):

    if a >= b:
        return a
    else:
        return b

def multiply(a, b):
    """Multiply Function"""
    return a * b


def divide(a, b):
    """Divide Function"""
    if b == 0:
        raise ValueError('Can not divide by zero!')
    return a / b

def prime(num):
    if (num == 1):
        return False
    elif (num == 2):
        return True;
    else:
        for i in range(2,num):
            if(num % i == 0):
                return False
        return True

#****Driver function****
if __name__ == '__main__':
    print(odd(5))
    print(even(4))
    print(add(2,5))
    print(subtract(10,5))
    print(maximum(10,20))
    print(multiply(8,2))
    print(divide(20,2))
    print(prime(3))
