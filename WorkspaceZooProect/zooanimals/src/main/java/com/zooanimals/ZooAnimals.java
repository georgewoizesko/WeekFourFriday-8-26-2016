package com.zooanimals;

import java.util.Scanner;

public class ZooAnimals {
    
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        String userMenuInput = null;
        boolean menuCorrect = false;
        
        System.out.println("Welcome to the Fantasy Zoo App!!!");
    
    do
    {
        System.out.println("Press 1 to read from DB" + "\nPress 2 to add to DB");
        userMenuInput = sc.nextLine();



        switch (userMenuInput) { 
        case "1":
            DAO.readFromDB();

            break;
        case "2":
            DAO.writeToDB();
            
            break;                
        default:
            System.out.println("You've entered an invalid option");
            menuCorrect = true;
            break;
        }
    }while(menuCorrect);

    }
}

/*package com.zooanimals;

public class ZooAnimals {

	public static void main(String[] args) {
		
		DAO.readFromDB();
		
		

	}

}*/
