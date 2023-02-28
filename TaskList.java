package Application;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {

	public static void main(String[] args) {
		
		ArrayList<String> tasks = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------Welcome-To-Your-TaskList----------");
	
		while (true) {
			System.out.println("*******************************************");
			System.out.println("1. Add Task");
			System.out.println("2. Delete Task");
			System.out.println("3. Mark Task as Finished");
			System.out.println("4. Show All Tasks");
			System.out.println("5. Exit");
			System.out.print("Select your option: ");
			int option = sc.nextInt();
			System.out.println("-------------------------------------------");
			
			switch (option) {
			case 1: 
				System.out.print("Enter Task: ");
				sc.nextLine();
				String task = sc.nextLine();
				tasks.add(task);
				break;
			case 2:
                System.out.print("Enter Task Number: ");
                int numberTask = sc.nextInt();
                sc.nextLine();
                System.out.println("Task " + numberTask + " deleted: " + tasks.get(numberTask - 1));
                tasks.remove(numberTask - 1);
				break;
			case 3: 
				System.out.print("Enter Task Number: ");
				int numTask = sc.nextInt();
				System.out.println("");
				System.out.println("Task " + numTask + " Completed: " + tasks.get(numTask - 1));
                tasks.set(numTask - 1, tasks.get(numTask - 1) + " (Completed)");
				break;
			case 4:
				System.out.println("Exists '" + tasks.size() + "' tasks: ");
				
				for(int i = 0; i < tasks.size(); i++) {
					System.out.println((i + 1) + ". " + tasks.get(i));
				}
				break;
			case 5:
				System.out.println("Exiting...");
				System.exit(0);
				System.out.print("Exit successful");
				break;
			default:
				System.out.println("Your choice do not exists");
			}
		}
	}

}
