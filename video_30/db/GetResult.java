package db;

public class GetResult {

    private void getConnection() {
        System.out.println("Connected to database");
    }

    private void execute() {
        getConnection();
        System.out.println("Query Executed");
    }

    public void getResult() {
        execute();
        System.out.println("Here are your product details");
    }

}
