package studentwebapp;

public class result {
  public result(int total2, int avg2, boolean studentresult2,String name) {
		// TODO Auto-generated constructor stub
	  this.total = total2;
	  this.avg =avg2;
	  this.studentresult = studentresult2;
	  this.name = name;
	}
int total;
  int avg;
  boolean studentresult;
  String name;
  public int gettotal(){
	  return total;
  }
  
  public int getavg(){
	  return avg;
  }
  
  public boolean getresult(){
	  return studentresult;
  }
  public String getname(){
	  return name;
  }
}
