 public class EmployeeDetails {

     public void showMenu ()  {
         int option;
         System.out.println("------------Menu--------");
         System.out.println("1. Enter Data");
         System.out.println("2. Display Data");
         System.out.println("3. Exit");
         System.out.println("\nChoose the option:  ");


         option = 2;
  switch (option)  {
  case 1:
   EnterData();
   break;
  case 2:
   DisplayData();
   break;
  case 3:
   ExitMenu();
   break;
  default:
   System.out.println("Incorrect menu option");
   showMenu();
   break;
    }
  }
  public void EnterData() {
   System.out.println("enterData method is invoked");
  }

  public void DisplayData() {
   System.out.println("displayData method is invoked");
  }


  public void ExitMenu() {
   System.out.println("exitMenu method is invoked");
   System.exit(0);
  }

  public static void main(String[] args)  {
   EmployeeDetails obj = new EmployeeDetails();
   obj.showMenu();
     }
  }

