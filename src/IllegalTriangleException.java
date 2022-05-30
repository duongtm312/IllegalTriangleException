public class IllegalTriangleException extends Exception{
    @Override
    public String getMessage() {
        return "Đây ko phải là tam giác";
    }
}
