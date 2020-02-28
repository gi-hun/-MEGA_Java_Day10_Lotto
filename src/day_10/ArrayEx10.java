/*
 * # 즉석복권
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 아래 3종류의 복권의 당첨여부를 출력한다.
 */
package day_10;

import java.util.Scanner;

public class ArrayEx10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		
		while(true)
		{
			System.out.println("[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			
			System.out.print("메뉴 선택 : ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				int count = 0;
				int check = -1;
				
				for(int i=0;i<8;i++)
				{
					if(lotto1[i] == 7)
					{
						count ++;
						if(count == 3)
						{
							check = 1;
						}		
					  }
					else
					{
						count = 0;
					}
				}
				if(check == 1)
				{
					System.out.println("당첨");
				}
				else
				{
					System.out.println("꽝!");
				}
			}
			else if(select == 2)
			{
				int count = 0;
				int check = -1;
				
				for(int i=0;i<8;i++)
				{
					if(lotto2[i] == 7)
					{
						count++;
						if(count == 3)
						{
							check = 1;
						}
					}
					else
					{
						count = 0;
					}
				}
				if(check == 1)
				{
					System.out.println("당첨");
				}
				else
				{
					System.out.println("꽝!");
				}
			}
			else if(select == 3)
			{
				int count = 0;
				int check = -1;
				
				for(int i=0;i<8;i++)
				{
					if(lotto3[i] == 7)
					{
						count++;
						if(count == 3)
						{
							check = 1;
						}
					}
					else
					{
						count = 0;
					}
				}
				if(check == 1)
				{
					System.out.println("담첨");
				}
				else
				{
					System.out.println("꽝!");
				}
				
			}
		}
	}
}
