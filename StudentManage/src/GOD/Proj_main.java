package GOD;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Proj_student_data> list = new ArrayList<Proj_student_data>();
		Proj_student_data s1 = new Proj_student_data("s001", "奥巴马", "26", "班长");
		Proj_student_data s2 = new Proj_student_data("s002", "拉登", "26", "体育委员");
		Proj_student_data s3 = new Proj_student_data("s003", "布莱尔", "26", "生活委员");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Proj_admin_data Pad = new Proj_admin_data("ketai","0000");
		Proj_exec pe= new Proj_exec(); 
		if(pe.login(Pad))
		{
			pe.printchooselist();
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext())
			{
				switch(sc.next())
				{
				case "1":
					pe.lookover(list);
					break;
				case "2":
					pe.addstuinfo(list);
					pe.lookover(list);
					break;
				case "3":
					pe.modifystuinfo(list);
					pe.lookover(list);
					break;
				case "4":
					pe.searchstuinfo(list);
					break;
				case "5":
					pe.delstuinfo(list);
					pe.lookover(list);
					break;
				case "6":
					System.out.print("谢谢你的使用！");
					return;
					default:
						
				}
				pe.printchooselist();
			}
			
		}
		
	}

}
