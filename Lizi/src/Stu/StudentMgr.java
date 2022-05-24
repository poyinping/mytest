package Stu;

import java.util.Scanner;

//杩欎釜绫绘槸鎴戜滑鐨勪富鎴樺満锛屾墍鏈夌殑閫昏緫鍦ㄧ粍缁�
public class StudentMgr {
	Scanner input = new Scanner(System.in);
	Student[] students = new Student[10];

	// 绋嬪簭寮�濮嬬殑鏂规硶
	public void start() {
		//鍒濆鍖栧鍛�--瀵硅薄鏁扮粍		
		while (true) {
			System.out.println("璇烽�夋嫨1銆佺櫥褰�  2銆侀��鍑�");
			int menu = input.nextInt();
			if (menu == 1) {
				//鐧诲綍
				System.out.println("璇疯緭鍏ユ墜鏈哄彿锛�");
				String phone = input.next();
				System.out.println("璇疯緭鍏ュ瘑鐮侊細");
				String password = input.next();
				Student s = StudentUtil.login(phone,password,students);
				if (s != null) {//鐧诲綍鐨勭粨鏋�--boolean int String -->Student
					//鎴愬姛--鎵撳嵃浜岀骇鑿滃崟
					while(true) {						
						System.out.println("1銆佹煡鐪嬫墍鏈夊鐢熶俊鎭�");
						System.out.println("2銆佹牴鎹鍚嶆煡鐪嬪鐢熶俊鎭�");
						System.out.println("3銆佹牴鎹鍙锋煡璇�");
						System.out.println("4銆佷慨鏀硅嚜宸辩殑瀵嗙爜");
						System.out.println("5銆佸垹闄ゅ鐢�");
						System.out.println("6銆佸鍔犱竴涓鐢�");
						System.out.println("7銆佹煡璇㈠鐢熸�绘暟");
						System.out.println("8銆佹牴鎹鐢熷勾榫勫瀛︾敓鎺掑簭");
						System.out.println("9銆佽繑鍥炰笂涓�绾ц彍鍗�");
						System.out.println("10銆侀��鍑虹▼搴�");
						int subMenu = input.nextInt();						
						switch(subMenu) {
						    case 1:
						    	StudentUtil.showStudents(students);
						    	break;
						    case 2:
						    	System.out.println("璇疯緭鍏ヨ鏌ユ壘鐨勫鍚嶏細");
						    	String  name = input.next();
						    	Student[] temp = StudentUtil.getStudentsByName(name,students);
						    	StudentUtil.showStudents(temp);
						    	break;
						    case 3:
						    	System.out.println("璇疯緭鍏ュ鍙凤細");
						    	String no = input.next();
						    	Student studentByNo = StudentUtil.getStudentByNo(no,students);
						    	if(studentByNo!=null) {
						    		System.out.println(studentByNo);
						    	}else {
						    		System.out.println("鏌ユ棤姝や汉");
						    	}
						    	break;
						    case 4:
						    	System.out.println("璇疯緭鍏ユ柊瀵嗙爜锛�");
						    	String newPassword = input.next();
						    	s.setPassword(newPassword);
						    	break;
						    case 5:
						    	System.out.println("璇烽�夋嫨瑕佸垹闄ょ殑瀛︾敓锛�");
						    	StudentUtil.showStudents(students);
						    	int index = input.nextInt();
						    	boolean flag = StudentUtil.deleteStudent(index-1,students);
						    	if(flag==true) {
						    		System.out.println("鍒犻櫎鎴愬姛");
						    	}else {
						    		System.out.println("鍒犻櫎澶辫触");
						    	}
						    	break;
						    case 6:
						    	//娣诲姞涓�涓鐢�
						    	System.out.println("璇疯緭鍏ュ鐢熷鍙凤細");
						    	String stuNo = input.next();
						    	System.out.println("濮撳悕锛�");
						    	String stuName = input.next();
						    	System.out.println("瀵嗙爜锛�");
						    	String stuPassword = input.next();
						    	System.out.println("骞撮緞锛�");
						    	int stuAge = input.nextInt();
						    	System.out.println("鎵嬫満锛�");
						    	String  stuPhone = input.next();
						    	Student addStudent = new Student(stuNo,stuName,stuAge,stuPassword,stuPhone);
						    	StudentUtil.add(addStudent,students);
						    	break;
						    case 7:
						    	System.out.println("瀛︾敓鎬绘暟鏄細"+StudentUtil.getStudentsSize(students));
						    	break;
						    case 8:
						    	//鏍规嵁骞撮緞杩涜鎺掑簭
						    	Student[] stus = StudentUtil.sort(students);
						    	StudentUtil.showStudents(stus);
						    	break;
						    case 9:
						    	start();//label  break
						    	break;
						    case 10:
						    	System.out.println("璋㈣阿浣跨敤锛�");
						    	System.exit(0);
						    default:
						    	System.out.println("鏃犳閫夐」");
						    	break;						
						}
					}
				} else {
					System.out.println("鐢ㄦ埛鍚嶆垨瀵嗙爜涓嶆纭�");
				}
			} else {
				//閫�鍑�
				System.out.println("涓嬫鍐嶆潵");
				break;
			} 
		}
	}

	// 鍒濆鍖栧鍛�
	public void init() {
		students[0] = new Student("cd2201-1", "寰愬嚖骞�", 20, "888", "111");
		students[1] = new Student("cd2201-2", "寰愯惂", 40, "888", "13886663333");
		students[2] = new Student("cd2201-3", "寰愰緳璞�", 18, "888", "13886664444");
		students[3] = new Student("cd2201-4", "娲礂璞�", 800, "888", "13886665555");
		students[4] = new Student("cd2201-5", "鐜嬮噸妤�", 100, "888", "13886666666");
	}

}
