public class NewException extends Exception{
    private String message;
    NewException(){
        super();
    }
    public NewException(String message) {
        super(message);
        this.message = message;
    }
}
