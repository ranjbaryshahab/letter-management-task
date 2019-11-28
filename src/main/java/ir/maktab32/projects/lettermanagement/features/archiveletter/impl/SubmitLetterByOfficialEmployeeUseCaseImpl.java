package ir.maktab32.projects.lettermanagement.features.archiveletter.impl;

import ir.maktab32.projects.lettermanagement.core.annotations.Service;
import ir.maktab32.projects.lettermanagement.features.archiveletter.usecases.SubmitLetterByOfficialEmployeeUseCase;
import ir.maktab32.projects.lettermanagement.model.Letter;

@Service
public class SubmitLetterByOfficialEmployeeUseCaseImpl implements SubmitLetterByOfficialEmployeeUseCase {
    @Override
    public Letter submit(String title, Long indicator, String privacy, String sender, String submitDate) throws SubmitLetterByOfficialEmployeeFailedException {
        validate(title);
        Letter letter = new Letter(
                null,
                indicator,
                title,
                privacy,
                sender,
                submitDate);
        
        // Todo: insert into database
        insertIntoDatabase(letter);
        return letter;
    }

    private void insertIntoDatabase(Letter letter) {
    }

    private void validate(String title) throws SubmitLetterByOfficialEmployeeFailedException {
        if (title.length() <= 3) {
            throw new SubmitLetterByOfficialEmployeeFailedException(
                    "Title length have to be more than 1 characters");
        }
    }
}
