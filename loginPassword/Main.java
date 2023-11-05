public class Main {

    public static void main(String[] args) {

        lap first = new lap("tamara2_", "hahaha", "hahaha");

        try {
            lap.IsLogPassTrue(first.getLogin(), first.getPassword(), first.getConfirmPassword());
        } catch (wle | wpe e) {
            System.out.println(e.getMessage());
        }



    }
}