package com.joe.TaskManager;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc;
	static ArrayList<TaskProperties> tasks;
	static boolean running = true;

	public static void main(String[] args) {

		tasks = new ArrayList<TaskProperties>();
		sc = new Scanner(System.in);
//		boolean running = true;

//		try {
//			TasksMethod.application();
		do {
			
			try {
				TasksMethod.displayMenu();
				int menuChoice = TasksMethod.readUserInput();

				switch (menuChoice) {
				case 1:
					System.out.println("What do you want to ADD: ");
					String taskName = sc.nextLine();
					TasksMethod.addTask(taskName);
					break;

				case 2:
					System.out.println("Task to be REMOVE: ");
					TasksMethod.listTasks();
					int removeId = TasksMethod.readUserInput();
					TasksMethod.removeTask(removeId);
					break;

				case 3:
					System.out.println("Item to compete");
					TasksMethod.listTasks();
					int completeId = TasksMethod.readUserInput();
					TasksMethod.completeTask(completeId);
					break;

				case 4:
					TasksMethod.listTasks();
					break;
				case 0:
					running = false;
					TasksMethod.newFile();
					break;

				default:
					System.out.println("UNKNOWN");
					break;
				}

			} catch (Exception e) {
				System.out.println("Invaild Answer");
//				break;
//				continue;
			}

		} while (running);
//		} catch (Exception e) {
//			System.out.println("Invaild Answer");
//		}

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
