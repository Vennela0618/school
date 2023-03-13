// Write your code here
package com.example.school.repository;

import java.util.List;

import com.example.school.model.Student;

public interface StudentRepository {
List<Student> getStudents();
Student getStudentById(int studentId);
Student addStudent(Student student);
Student updateStudent(int studentId, Student student);
void deleteStudent(int studentId);
int addStudents(List<Student> students);
}