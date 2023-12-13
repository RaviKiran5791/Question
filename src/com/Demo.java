package com;

class Demo {
	int coinDeterminer(int num) {
	    if (num < 1 || num > 250)       return -1;
	    if (num < 5)                    return num;

	    int count = num / 11;
	    int remainder = num % 11;

	    if (remainder == 0)             return count;
	    else if (remainder % 2 == 1)    return count + 1;
	    else                            return count + 2;
	}

	public static void main(String[] args) {
	
		System.out.println(new Demo().coinDeterminer(11));
	}
}
