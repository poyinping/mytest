package com.qf.cdjava2201.day15.stumgr;

import java.util.Arrays;

//��̬����
public class StudentUtil {

	/**
	 * 
	 * @param phone--�ֻ���
	 * @param password  ����
	 * @param students  ѧ������
	 * @return  ��¼��ѧ��  if failed value is null else logined student
	 */
	public static Student login(String phone, String password, Student[] students) {
		for(Student s : students) {
			if(s!=null&&s.getPhone().equals(phone)&&s.getPassword().equals(password)) {
				return s;
			}
		}
		return null;
	}

	public static void showStudents(Student[] students) {
		for(int i=0;i<students.length;i++) {
			Student s = students[i];
			if(s!=null) {
				System.out.println(i+1+" "+s.getNo()+" "+s.getName()+" "+s.getAge()+" "+s.getPhone());
			}
		}
	}

	//��������ģ����������ѧ��
	public static Student[] getStudentsByName(String name, Student[] students) {
		Student[] stus = new Student[1];		
		for(int i=0;i<students.length;i++) {
			if(students[i]!=null&&students[i].getName().contains(name)) {
				stus[i] = students[i];
				stus = Arrays.copyOf(stus, stus.length+1);
			}
		}
		return stus;
	}

	//����ѧ�Ų�ѯѧ��
	public static Student getStudentByNo(String no, Student[] students) {		
		for (int i = 0; i < students.length; i++) {
			if(students[i]!=null&&students[i].getNo().equals(no)) {
				return students[i];
			}
		}
		return null;
	}

	//�����±�ɾ��ѧ��
	public static boolean deleteStudent(int index, Student[] students) {
		//index 0-length-1
		if(index<0||index>=getStudentsSize(students)) {
			return false;
		}
		for(int i=index;i<students.length-1;i++) {
			students[i] = students[i+1];			
		}
		students[students.length-1] = null;
		return true;
	}
	//�����������ж���ѧ��
	public static int getStudentsSize(Student[] students) {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i]!=null) {
				count++;
			}
		}
		return count;
	}

	//����ѧ����������
	public static Student[] sort(Student[] students) {
	     Student[] stus = students.clone();
		//ð������
		for(int i=0;i<stus.length-1;i++) {
			for(int j=0;j<stus.length-1-i;j++) {				
				if(stus[j+1]!=null&&stus[j]!=null&&stus[j].getAge()>stus[j+1].getAge()) {
					Student temp = stus[j];
					stus[j] = stus[j+1];
					stus[j+1] = temp;
				}
			}
		}
		return stus;
	}

	//���һ��ѧ��
	public static void add(Student addStudent, Student[] students) {
		//���ҿ�λ
		if(getStudentsSize(students)==students.length) {//����,����
			students = Arrays.copyOf(students, students.length*2);
		}
		//���
		for (int i = 0; i < students.length; i++) {
			if(students[i]==null) {
				students[i] = addStudent;
				break;
			}
		}
	}
	

}
