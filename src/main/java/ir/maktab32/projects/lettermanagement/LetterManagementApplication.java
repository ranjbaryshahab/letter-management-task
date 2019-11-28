package ir.maktab32.projects.lettermanagement;

import ir.maktab32.projects.lettermanagement.features.archiveletter.impl.SubmitLetterByOfficialEmployeeUseCaseImpl;
import ir.maktab32.projects.lettermanagement.features.archiveletter.usecases.SubmitLetterByOfficialEmployeeUseCase;
import ir.maktab32.projects.lettermanagement.model.Letter;

import java.util.Scanner;

public class LetterManagementApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("What do you want?");
            String command = scanner.nextLine();
            switch (command) {
                case "exit" -> exit = true;
                case "submit" -> {
                    SubmitLetterByOfficialEmployeeUseCase submitLetterByOfficialEmployeeUseCase =
                            new SubmitLetterByOfficialEmployeeUseCaseImpl();

                    System.out.println("Title: ");
                    String title = scanner.nextLine();

                    System.out.println("Indicator: ");
                    Long indicator = Long.parseLong(scanner.nextLine());

                    System.out.println("Sender: ");
                    String sender = scanner.nextLine();

                    System.out.println("Submit Date: ");
                    String submitDate = scanner.nextLine();

                    System.out.println("Privacy: ");
                    String privacy = scanner.nextLine();

                    try {
                        Letter letter = submitLetterByOfficialEmployeeUseCase.submit(title, indicator, privacy, sender, submitDate);
                        System.out.println(letter);
                    } catch (SubmitLetterByOfficialEmployeeUseCase.SubmitLetterByOfficialEmployeeFailedException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                }
            }
        }
    }
}
