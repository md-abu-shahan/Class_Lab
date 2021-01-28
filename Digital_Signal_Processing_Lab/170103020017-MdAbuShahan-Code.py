import numpy as np
import matplotlib.pyplot as plt

def drawSignal(n,A):
    fig = plt.figure()
    ax = fig.add_subplot(111)
    plt.title("Signal")
    ax.stem(n, A)


def unitImpulse(lb, ub):
    assert(lb <= ub), "Lower bound can't be grater than uppre"
    
    #range
    n = np.arange(lb, ub+1, 1)
    
    #value
    x_n = []
    for i in n:
        if i < 0:
            x_n.append(0)
        elif i == 0:
            x_n.append(1)
        else:
            x_n.append(0)
            
    x_n =np.array(x_n)
    
    return (n, x_n)

def unitStep(lb, ub):
    assert(lb <= ub), "Lower bound can't be grater than uppre"
    
    #range
    n = np.arange(lb, ub+1, 1)
    
    #value
    x_n = []
    for i in n:
        if i < 0:
            x_n.append(0)
        else:
            x_n.append(1)
            
    x_n =np.array(x_n)
    
    return (n, x_n)

def unitRamp(lb, ub):
    assert(lb <= ub), "Lower bound can't be grater than upper"
    
    #range
    n = np.arange(lb, ub+1, 1)
    
    #value
    x_n = []
    for i in n:
        if i < 0:
            x_n.append(0)
        else:
            x_n.append(i)
            
    x_n =np.array(x_n)
    
    return (n, x_n)

def timeShifting(originalSignal, shiftingAmount):
    n,x_n = originalSignal
    
    #output array
    y_n = np.zeros(n.shape[0])
    
    #Main Logic
    if shiftingAmount > 0:
        if shiftingAmount > n.shape[0]:
            shiftingAmount = n.shape[0]
            
        dataToCopy = x_n[ 0 : n.shape[0]-shiftingAmount]
        y_n[shiftingAmount : n.shape[0]] = dataToCopy
    elif shiftingAmount < 0:
        if abs(shiftingAmount) > n.shape[0]:
            shiftingAmount = n.shape[0] * (-1)
            
        dataToCopy = x_n[ -shiftingAmount : n.shape[0] ]
        y_n[ 0 : n.shape[0]+shiftingAmount ] = dataToCopy
    else:
        y_n=x_n
        
    return (n,y_n)



    
    
    

def Mirroring(originalSignal):
    n,x_n = originalSignal
    lb = n[0]
    ub = n[len(n)-1]
    assert(lb<=0 and ub>=0), " It cannot be mirrored the signal has no zeroth sample "
    
    temp = {}
    index = 0
    for i in n:
        temp[i] = x_n[index]
        index+=1
    #output array
    y_n = []
    #Main Logic
    for i in n:
        if -i not in n:
            y_n.append(0)
        else: 
            y_n.append(temp[-i])
    
    
    y_n = np.array(y_n)
    
    return (n,y_n)

def Downsampling(originalSignal, T):
    assert( T > 0 ), " T is not greater than zero so can't work Downsampling. "
    n,x_n = originalSignal
    
    lowerBound = n[0]
    upperBound = n[len(n)-1]
    temp = {}
    index = 0
    for i in n:
        temp[i] = x_n[index]
        index+=1
    #output array
    y_n = []
    
    #Main Logic
    for i in n:
        if lowerBound > T*i or T*i > upperBound:
            y_n.append(0)
        else:
            y_n.append(temp[T*i])
    y_n = np.array(y_n)
    return (n,y_n)


def Scaling(originalSignal, A):
    n,x_n = originalSignal
    y_n = A * x_n
    y_n = np.array(y_n)
    return (n,y_n)

def Operations(first , second , operation):
    flb = first[0][0]
    slb = second[0][0]
    fub = first[0][len(first[0])-1]
    sub = second[0][len(second[0])-1]
    lb = min(flb,slb)
    ub = max(fub,sub)
    n = np.arange(lb, ub+1, 1)
    lb1,ub1 = lb,ub
    #print(lb,ub)
    i=0
    arr1 = []
    arr2 = []
    while lb1<=ub1:
        if lb1 not in first[0]:
            arr1.append(0)
        else: 
            arr1.append(first[1][i])
            i+=1
        lb1+=1
    lb1,ub1 = lb,ub
    i=0
    while lb1<=ub1:
        if lb1 not in second[0]:
            arr2.append(0)
        else:
            arr2.append(second[1][i])
            i+=1
        lb1+=1
    #print(arr1,arr2)
    arr1=np.array(arr1)
    arr2=np.array(arr2)
    if operation == 1:
        y_n = arr1 + arr2
    elif operation == 2:
        y_n = arr1 - arr2
    else:
        y_n = arr1 * arr2
   
    y_n = np.array(y_n)
    return (n,y_n)

def inputFunction():
    file = open("input.txt","r")
    test_case = int(file.readline())
    for j in range(0,test_case):
        parts = int(file.readline())
        for k in range(0,parts):
            if k != 0:
                parts_operator = int(file.readline())
            lowerBound = int(file.readline())
            upperBound = int(file.readline())
            component = int(file.readline())
            for i in range(0,component):
                if i != 0:
                    operator = int(file.readline())
                
                scaling = int(file.readline())
                
                signalType = int(file.readline())
                time_shifting = int(file.readline())
                if time_shifting == 1 :
                    shiftAmount = int(file.readline())
               
                mirroring = int(file.readline())
                downsampling = int(file.readline())
                if downsampling == 1:
                    T = int(file.readline())
            
            
                output = []
                if signalType == 1:
                    delta = unitImpulse(lowerBound, upperBound)
                    delta = Scaling(delta,scaling)
                    if time_shifting == 1:
                        delta = timeShifting(delta,shiftAmount)
                    if downsampling == 1:
                        delta = Downsampling(delta,T)
                    if mirroring == 1:
                        delta = Mirroring(delta)
                    
                    output = delta
                
                elif signalType == 2:
                    u = unitStep(lowerBound,upperBound)
                    u = Scaling(u,scaling)
                    if time_shifting == 1:
                        u = timeShifting(u,shiftAmount)
                    if downsampling == 1:
                        u = Downsampling(u,T)
                    if mirroring == 1:
                        u = Mirroring(u)
                    output = u
                else:
                    Ur = unitRamp(lowerBound,upperBound)
                    Ur = Scaling(Ur,scaling)
                    if time_shifting == 1:
                        Ur = timeShifting(Ur,shiftAmount)
                    if downsampling == 1:
                        Ur = Downsampling(Ur,T)
                    if mirroring == 1:
                        Ur = Mirroring(Ur)
                    
                    output = Ur
                
                if i==0:
                    final = output
                else:
                    if operator == 1:
                        final =  Operations(final,output,operator)
                    elif operator == 2:
                        final =  Operations(final,output,operator)
                    else:
                        final =  Operations(final,output,operator)
            if k==0:
                parts_final = final
            else:
                if parts_operator == 1:
                    parts_final =  Operations(parts_final,final,parts_operator)
                elif parts_operator == 2:
                    parts_final =  Operations(parts_final,final,parts_operator)
                else:
                    parts_final =  Operations(parts_final,final,parts_operator)
        parts_final = np.array(parts_final)
        print(parts_final[0],parts_final[1])
        drawSignal(parts_final[0],parts_final[1])
    
    return 
if __name__== "__main__":
     
    inputFunction()
    