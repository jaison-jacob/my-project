package studentwebapp;

public class students {
		
	 String name;
	 
	 int tamil;
	 int english;
	 int maths;
	 int science;
	 int social;
	  public students(String name,int tamil,int english,int maths,int science,int social){
		  
		  this.name = name;
		  
		  this.tamil = tamil;
		  this.english = english;
		  this.maths = maths;
		  this.science = science;
		  this.social = social;
	  }
	  public String getname(){
		  return name;
	  }
	  public int gettamil(){
		  return tamil;
	  }
	  public int getenglish(){
		  return english;
	  }
	  public int getmaths(){
		  return maths;
	  }
	  public int getscience(){
		  return science;
	  }
	  public int getsocial(){
		  return social;
	  }
	  public void result(){
		  
	  }
}
