package gateway.proximity.gatewayserver.exceptions;


public class InvalidHeaderException extends RuntimeException {
    public InvalidHeaderException(String message) {
        super(message);
    }
}
