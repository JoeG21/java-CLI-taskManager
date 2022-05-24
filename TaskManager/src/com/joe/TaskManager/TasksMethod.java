package com.joe.TaskManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class TasksMethod extends Main {
	
	public static void displayMenu() {
		System.out.println("=== Task Manager ===");
		System.out.println("1. Add to the list");
		System.out.println("2. Remove from the list");
		System.out.println("3. Complete that item");
		System.out.println("4. List the list");
		System.out.println("0. End of the Line --");
		System.out.print("Your choice: ");
	}
	
	public static int readUserInput() {
		int val = sc.nextInt();
		sc.nextLine();
		return val;
	}
	
//	add task
	public static void addTask(String name) {
		tasks.add(new TaskProperties(name));
	}
	
//	remove task
	public static void removeTask(int id) {
		tasks.remove(id - 1);
	}
	
//	complete task
	public static void completeTask(int id) {
		tasks.get(id - 1).setComplete(true);
	}
	
//	list tasks
	public static void listTasks() {
		System.out.println("-- TO DO LIST --");
		
		for(int i = 0; i < tasks.size(); i++) {
			System.out.println(i+1 + ". " + tasks.get(i).toString());
		}
		
		System.out.println("====================\n");
	}
	
//	Write and Read file
	public static void newFile() {
		try {
			FileWriter writer = new FileWriter("list.txt");
			for(int i = 0; i < tasks.size(); i++) {
//				writer.write(tasks.get(i).toString());
				writer.write(tasks.get(i).toString() + ", ");
			}	
			writer.close();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("list.txt"));
			String line;
			while((line = reader.readLine())!= null ) {
				System.out.println(line);
			}
			reader.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	
//	public static void application() {
//		do {
//			TasksMethod.displayMenu();
//			int menuChoice = TasksMethod.readUserInput();
//
//			switch (menuChoice) {
//			case 1:
//				System.out.println("What do you want to ADD: ");
//				String taskName = sc.nextLine();
//				TasksMethod.addTask(taskName);
//				break;
//
//			case 2:
//				System.out.println("Task to be REMOVE: ");
//				TasksMethod.listTasks();
//				int removeId = TasksMethod.readUserInput();
//				TasksMethod.removeTask(removeId);
//				break;
//
//			case 3:
//				System.out.println("Item to compete");
//				TasksMethod.listTasks();
//				int completeId = TasksMethod.readUserInput();
//				TasksMethod.completeTask(completeId);
//				break;
//
//			case 4:
//				TasksMethod.listTasks();
//				break;
//
//			case 0:
//				running = false;
//				TasksMethod.newFile();
//				break;
//
//			default:
//				System.out.println("UNKNOWN");
//			}
//
//		} while (running);
//	}
	
}
