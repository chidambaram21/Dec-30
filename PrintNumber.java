package edu.stpeters;

public class PrintNumber {

	public static void main(String[] args) {
			
				long n = 123456789l;// / 100000000
				long d = 100000000l;
				printHello(n,d);
				//123456789
				//12345678
				//1234567
				//123456
				//12345
				//1234
				//123
				//12
				//1
			}

			private static void printHello(long n,long d) {
			
				if(d != 0) {// 5 4 3 2 1 
					System.out.println(n/d);//1
					d= d /10;//
					printHello(n,d);
				}
			}

		}

