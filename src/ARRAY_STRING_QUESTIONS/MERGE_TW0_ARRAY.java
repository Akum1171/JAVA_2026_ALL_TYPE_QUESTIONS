package ARRAY_STRING_QUESTIONS;

public class MERGE_TW0_ARRAY {public static void main(String[] args)
{
//		int arr1[]= {1,2,3,4,5,6};
//		int arr2[]= {34,5,6,7,8,8};
//		int aLength=arr1.length;//
//		int bLength=arr2.length;
//		int cLength=aLength+bLength;
//		int c[]=new int[cLength];
//		for(int i=1;i<arr1.length;i++)
//		{
//			c[i]=arr1[i];
//		}
//
//		for(int i=0;i<arr2.length;i++)
//		{
//			c[aLength+i]=arr2[i];
//		}
//		for(int i=0;i<cLength;i++)
//		{
//			System.out.print(c[i]+" ");
//
//		}
//

//  2nd: ways :-
    int a[] = {1, 2, 3, 4};
    int b[] = {4, 6, 7, 8};

    int alen=a.length;
    int blen=b.length;

    int clen=alen+blen;

    int c[]=new int[clen];


    for(int i=0;i<clen;i++)
    {
        if(i<alen) {
            c[i]=a[i];
        }
        else {
            c[i]=b[i-alen];
        }
        System.out.print(c[i]+" ");
    }
}
}