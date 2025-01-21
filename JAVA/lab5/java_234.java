class Person {
void name (){
System . out . println (" Name is Divyanshu " );
} }
class Student extends Person {
void roll (){
System . out . println (" Roll is 2330441 " );
} }
class FirstYear extends Student {
void year (){
System . out . println (" 2nd year student " );
} }
public class java_234 {
public static void main ( String args []) {
FirstYear stud = new FirstYear ();
stud . year ();
stud . roll ();
stud . name ();
}}