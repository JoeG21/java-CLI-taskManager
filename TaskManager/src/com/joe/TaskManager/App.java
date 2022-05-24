//package com.joe.TaskManager;
//
//public class App extends Main {
//	public static void App() {
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
//
//}
