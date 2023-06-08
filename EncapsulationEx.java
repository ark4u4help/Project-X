//package com.oops;
class Medicine
{
private int medrefNo;
private String medIngredname;
//public Medicine(int medrefNo, String medIngredname) {
// super();
// this.medrefNo = medrefNo;
// this.medIngredname = medIngredname;
//}
public int getMedrefNo() {
System.out.println("Capsule Vitamin A");
System.out.println(medIngredname);
System.out.println(medrefNo);
return medrefNo;
}
public void setMedrefNo(int medrefNo) {
this.medrefNo = medrefNo;
}
public String getMedIngredname() {
return medIngredname;
}
public void setMedIngredname(String medIngredname) {
this.medIngredname = medIngredname;
}



}
public class EncapsulationEx {
public static void main(String[] args) {
Medicine m1 = new Medicine();
m1.getMedrefNo();
}
}