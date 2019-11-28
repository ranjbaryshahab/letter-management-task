package ir.maktab32.projects.lettermanagement.features.archiveletter.usecases;

import ir.maktab32.projects.lettermanagement.core.annotations.UseCase;
import ir.maktab32.projects.lettermanagement.model.Letter;

@UseCase(code="123")
public interface SubmitLetterByOfficialEmployeeUseCase {
    Letter submit(String title,
                  Long indicator,
                  String privacy,
                  String sender,
                  String submitDate) throws SubmitLetterByOfficialEmployeeFailedException;
    class SubmitLetterByOfficialEmployeeFailedException extends Exception {
        private String message;

        public SubmitLetterByOfficialEmployeeFailedException(String message) {
            this.message = message;
        }
    }
}
