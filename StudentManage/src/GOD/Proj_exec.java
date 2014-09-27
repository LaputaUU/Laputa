package GOD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Proj_exec {

	public boolean login(Proj_admin_data pad)
	{
		Proj_print print = new Proj_print();
		print.printlogin();
		String admname,admpassword;
		Scanner sc = new Scanner(System.in); 
		System.out.print("请选择，输入数字：");
		if(sc.next().equals("1"))
		{
			System.out.print("请输入用户名：");
			admname = sc.next();
			System.out.print("请输入密码：");
			admpassword = sc.next();
		} else {
			return false;
		}
		if(pad.isright(admname, admpassword))
		{
			return true;
		}
		else
		{
			while(!pad.isright(admname, admpassword))
			{
				System.out.print("用户名或密码错误，请重新输入：");
				System.out.println();
				System.out.print("请输入用户名：");
				admname = sc.next();
				System.out.println();
				System.out.print("请输入密码：");
				admpassword = sc.next();
			}
		}
		return true;	
	}
	
	public void lookover(ArrayList<Proj_student_data> list)
	{
		Iterator<Proj_student_data> it=list.iterator();
		while(it.hasNext())
		{
			it.next().print();
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入0返回上一菜单-->:");
		while(!sc.next().equals("0"))
		{
			System.out.print("请输入0返回上一菜单-->:");
		}
	}
	
	public void printchooselist()
	{
		Proj_print print = new Proj_print();
		print.printchooselist();
	}
	
	public void addstuinfo(ArrayList<Proj_student_data> list)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入学号:");
		String stu_number = sc.next();
		System.out.print("请输入姓名:");
		String stu_name = sc.next();
		System.out.print("请输入年龄:");
		String stu_age = sc.next();
		System.out.print("请输入职务:");
		String stu_post = sc.next();
		System.out.println();
		Proj_student_data p = new Proj_student_data(stu_number, stu_name, stu_age, stu_post);
		list.add(p);
	}
	
	public void modifystuinfo(ArrayList<Proj_student_data> list)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要修改的学生学号:");
		while(sc.hasNext())
		{
			Iterator<Proj_student_data> it=list.iterator();
			String stu_number = sc.next();
			boolean flag = false;
			while(it.hasNext())
			{
				Proj_student_data p = it.next();
				if(p.getStuNumber().equals(stu_number))
				{
					flag = true;
					System.out.print("请输入新姓名:");
					p.setStuName(sc.next());
					System.out.print("请输入新年龄:");
					p.setStuAge(sc.next());
					System.out.print("请输入新职务:");
					p.setStuPost(sc.next());
					break;
				}
			}
			if(flag)
				break;
			else
			{
				System.out.print("查无此人，请重新输入要修改的学生学号:");
			}
			
		}
		System.out.println();
	}
	
	public void searchstuinfo(ArrayList<Proj_student_data> list)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要查询的学生学号:");
		while(sc.hasNext())
		{
			Iterator<Proj_student_data> it=list.iterator();
			String stu_number = sc.next();
			boolean flag = false;
			while(it.hasNext())
			{
				Proj_student_data p = it.next();
				if(p.getStuNumber().equals(stu_number))
				{
					flag = true;
					System.out.println("你要查询的学生信息是:");
					p.print();
					break;
				}
			}
			if(flag)
				break;
			else
			{
				System.out.print("查无此人，请重新输入要查询的学生学号:");
			}
			
		}
		System.out.print("请输入0返回上一菜单-->:");
		while(!sc.next().equals("0"))
		{
			System.out.print("请输入0返回上一菜单-->:");
		}
	}
	
	public void delstuinfo(ArrayList<Proj_student_data> list)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要删除的学生学号:");
		while(sc.hasNext())
		{
			Iterator<Proj_student_data> it=list.iterator();
			String stu_number = sc.next();
			boolean flag = false;
			while(it.hasNext())
			{
				int i = 0;
				Proj_student_data p = it.next();
				if(p.getStuNumber().equals(stu_number))
				{
					flag = true;
					list.remove(i);
					break;
				}
			}
			if(flag)
				break;
			else
			{
				System.out.print("查无此人，请重新输入要删除的学生学号:");
			}
			
		}
		System.out.println();
	}
	
	
}
