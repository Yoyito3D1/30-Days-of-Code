#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    N = int(input().strip())
    
    if((N % 2) == 1):
        print("Weird")
    else: 
        if((N <= 5) or (N > 20)): 
            print("Not Weird")
            
        elif(N <= 20): 
            print("Weird")