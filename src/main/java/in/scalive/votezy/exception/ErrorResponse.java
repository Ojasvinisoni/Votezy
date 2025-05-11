package in.scalive.votezy.exception;

import lombok.Data;
import lombok.Generated;

@Data
@Generated
public class ErrorResponse {

    private int statusCode;
    private String messageString;

    public ErrorResponse(int statusCode, String messageString) {
        this.statusCode = statusCode;
        this.messageString = messageString;
    }

    public ErrorResponse() {
    }
}