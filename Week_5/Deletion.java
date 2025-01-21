package Week_5;
import java.util.Scanner;
public class Deletion {
	@SuppressWarnings("resource")
	public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the array: ");
	int[] arr = new int[5];
	for(int i = 0; i <arr.length; i++)
	{
		arr[i]=sc.nextInt();
	}

	System.out.println("Enter the key: ");
	int key = sc.nextInt();
	int[] re = new int[arr.length-1];

	int index = 0;
	boolean keykey= false;
		for(int i = 0 ; i<arr.length;i++)
		{
			if(arr[i]!=key)
			{
				re[index]=arr[i];
				index++;
				
			}
			else {
				keykey=true;
			}
			
		}
		  if (keykey) {
	            System.out.println("Array after deletion:");
	            for (int i = 0; i < index; i++) {
	                System.out.print(re[i]+" ");
	            }
	            System.out.println();
	        } else {
	            System.out.println("Key not found! ");
	        }
	    }
	}