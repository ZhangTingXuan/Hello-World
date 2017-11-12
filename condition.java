public class Condition{
// The Integer
  int age;
  public int getAge(){
    return this.age;
  }
  public void setAge(int age){
    this.age = age;
  }
  
  
  
  if(age <= 0){
    throw new Exeption("Is it possible to be under 0 yrs old?")
  }else{
    System.out.println("You are" + age.toString() + "old");
  }
}
